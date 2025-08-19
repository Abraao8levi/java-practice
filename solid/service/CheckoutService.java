package solid.service;

import solid.domain.Order;
import solid.notify.ReceiptSender;
import solid.payment.PaymentDetails;
import solid.payment.PaymentProcessor;
import solid.payment.PaymentResult;
import solid.pricing.DiscountPolicy;
import solid.repo.OrderRepository;

import java.math.BigDecimal;

/**
 * SRP: CheckoutService coordena o fluxo (calcular total c/ desconto, cobrar, persistir, enviar recibo).
 * DIP: depende apenas de abstrações (PaymentProcessor, DiscountPolicy, ReceiptSender, OrderRepository).
 * OCP: novas políticas de desconto/processadores de pagamento podem entrar sem mudar este serviço.
 */
public class CheckoutService {

    private final PaymentProcessor paymentProcessor;
    private final DiscountPolicy discountPolicy;
    private final ReceiptSender receiptSender;
    private final OrderRepository orderRepository;

    public CheckoutService(PaymentProcessor paymentProcessor,
                           DiscountPolicy discountPolicy,
                           ReceiptSender receiptSender,
                           OrderRepository orderRepository) {
        this.paymentProcessor = paymentProcessor;
        this.discountPolicy = discountPolicy;
        this.receiptSender = receiptSender;
        this.orderRepository = orderRepository;
    }

    public boolean checkout(Order order, PaymentDetails paymentDetails) {
        BigDecimal total = order.total();
        BigDecimal finalAmount = discountPolicy.apply(total);

        PaymentResult result = paymentProcessor
                .charge(finalAmount, paymentDetails);

        if (!result.success()) {
            System.out.println("[CHECKOUT] Payment failed: " + result.message());
            return false;
        }

        orderRepository.save(order, result.transactionId());

        String receipt = """
                ==== RECIBO ====
                Pedido: %s
                Valor original: %s
                Valor final:    %s
                Transação:      %s
                =================
                """.formatted(order.id(), total, finalAmount, result.transactionId());

        receiptSender.sendReceipt(order.custom().email(), receipt);
        return true;
    }
}

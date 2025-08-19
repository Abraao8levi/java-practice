package solid;

import solid.domain.*;
import solid.notify.EmailNotifier;
import solid.payment.*;
import solid.pricing.*;
import solid.repo.InMemoryOrderRepository;
import solid.service.CheckoutService;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // monta domínio
        Custom c = new Custom("C001", "Abraão", "abraao@email.com", "+55-85-99999-0000");
        Product p1 = new Product("SKU-1", "Teclado Mecânico", new BigDecimal("299.90"));
        Product p2 = new Product("SKU-2", "Mouse Gamer", new BigDecimal("159.90"));

        Order order = new Order("ORD-1001", c);
        order.addItem(new OrderItem(p1, 1));
        order.addItem(new OrderItem(p2, 2));

        // configura dependências via abstrações (DIP)
        PaymentProcessor processor = new CreditCardPaymentProcessor(); // troque por new PixPaymentProcessor() sem mudar o restante (OCP)
        DiscountPolicy discount = new SeasonalDiscount(new BigDecimal("0.10")); // 10% off (ou new NoDiscount())
        EmailNotifier email = new EmailNotifier(); // ReceiptSender
        InMemoryOrderRepository repo = new InMemoryOrderRepository();

        CheckoutService checkout = new CheckoutService(processor, discount, email, repo);

        // executa checkout
        PaymentDetails details = new PaymentDetails(PaymentDetails.Method.CREDIT_CARD, "tok_abc_123");
        boolean ok = checkout.checkout(order, details);

        System.out.println("Checkout success? " + ok);

        // Demonstra LSP/OCP: trocando implementação, nada mais muda:
        System.out.println("\n== Pagando por PIX ==");
        PaymentProcessor pix = new PixPaymentProcessor();
        CheckoutService checkoutPix = new CheckoutService(pix, new NoDiscount(), email, repo);
        PaymentDetails pixDetails = new PaymentDetails(PaymentDetails.Method.PIX, "chave-pix-xyz");
        boolean okPix = checkoutPix.checkout(order, pixDetails);
        System.out.println("Checkout PIX success? " + okPix);
    }
}

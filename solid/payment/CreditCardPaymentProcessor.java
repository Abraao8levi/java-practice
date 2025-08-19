package solid.payment;

import java.math.BigDecimal;
import java.util.UUID;

public class CreditCardPaymentProcessor implements PaymentProcessor {
    @Override
    public PaymentResult charge(BigDecimal amount, PaymentDetails details) {
        if (details.method() != PaymentDetails.Method.CREDIT_CARD)
            return PaymentResult.fail("Invalid method for CreditCardPaymentProcessor");

        // Simulação de integração com gateway de cartão:
        if (details.tokenOrKey() == null || details.tokenOrKey().isBlank())
            return PaymentResult.fail("Missing card token");

        return PaymentResult.ok("CC-" + UUID.randomUUID());
    }
}

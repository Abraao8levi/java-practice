package solid.payment;

import java.math.BigDecimal;
import java.util.UUID;

public class PixPaymentProcessor implements PaymentProcessor {
    @Override
    public PaymentResult charge(BigDecimal amount, PaymentDetails details) {
        if (details.method() != PaymentDetails.Method.PIX)
            return PaymentResult.fail("Invalid method for PixPaymentProcessor");

        if (details.tokenOrKey() == null || details.tokenOrKey().isBlank())
            return PaymentResult.fail("Missing PIX key");

        // Simula aprovação instantânea:
        return PaymentResult.ok("PIX-" + UUID.randomUUID());
    }
}

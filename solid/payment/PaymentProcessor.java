package solid.payment;

import java.math.BigDecimal;

/**
 * DIP: alto nível depende desta abstração (e não de implementações).
 * LSP: qualquer implementação deve cumprir este contrato sem "surpresas".
 */
public interface PaymentProcessor {
    PaymentResult charge(BigDecimal amount, PaymentDetails details);
}

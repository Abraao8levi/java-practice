package solid.pricing;

import java.math.BigDecimal;

public class NoDiscount implements DiscountPolicy {
    @Override
    public BigDecimal apply(BigDecimal amount) {
        return amount; // mantém o contrato (LSP): nunca retorna null; não impõe novas pré-condições.
    }
}

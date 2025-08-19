package solid.pricing;

import java.math.BigDecimal;

/**
 * OCP & LSP: novas políticas de desconto podem ser adicionadas sem alterar o uso.
 */
public interface DiscountPolicy {
    BigDecimal apply(BigDecimal amount);
}

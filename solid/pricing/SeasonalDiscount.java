package solid.pricing;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SeasonalDiscount implements DiscountPolicy {
    private final BigDecimal percent; // ex.: 0.10 = 10%

    public SeasonalDiscount(BigDecimal percent) {
        if (percent.compareTo(BigDecimal.ZERO) < 0 || percent.compareTo(BigDecimal.ONE) > 0)
            throw new IllegalArgumentException("percent must be between 0 and 1");
        this.percent = percent;
    }

    @Override
    public BigDecimal apply(BigDecimal amount) {
        BigDecimal discount = amount.multiply(percent);
        return amount.subtract(discount).setScale(2, RoundingMode.HALF_UP);
    }
}

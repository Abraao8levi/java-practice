package solid.domain;

import java.math.BigDecimal;

public class OrderItem {
    private final int quantity;
    private final Product product;
    public OrderItem(Product product, int quantity) {
        if (quantity <= 0) throw new IllegalArgumentException("quantity must be > 0");
        this.product = product; this.quantity = quantity;
    }
    public Product product() { 
        return product; 
    }
    public int quantity() { 
        return quantity; 
    }
    public BigDecimal subtotal() { return product.price().multiply(BigDecimal.valueOf(quantity)); }
}

package solid.domain;

import java.math.BigDecimal;

public class Product {
    private final String sku;
    private final String name;
    private final BigDecimal price;

    public Product(String sku, String name, BigDecimal price) {
        this.sku = sku; this.name = name; this.price = price;
    }
    public String sku() { 
        return sku; 
    }
    public String name() {
         return name; 
}
    public BigDecimal price() {
         return price; 
    }
}

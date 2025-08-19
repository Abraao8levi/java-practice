package solid.domain;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * SRP: Order é responsável apenas por representar o pedido e somar itens.
 
 */
public class Order {
    private final String id;
    private final Custom custom;
    private final List<OrderItem> items = new ArrayList<>();

    public Order(String id, Custom custom) {
        this.id = id; this.custom = custom;
    }
    public void addItem(OrderItem item) { items.add(item); }
    public String id() { return id; }
    public Custom custom() { return custom;
     }
    public List<OrderItem> items() { return Collections.unmodifiableList(items); }

    public BigDecimal total() {
        return items.stream().map(OrderItem::subtotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
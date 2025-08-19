package solid.repo;

import solid.domain.Order;

import java.util.LinkedHashMap;
import java.util.Map;

public class InMemoryOrderRepository implements OrderRepository {
    private final Map<String, String> storage = new LinkedHashMap<>();

    @Override
    public void save(Order order, String paymentTransactionId) {
        storage.put(order.id(), paymentTransactionId);
        System.out.printf("[REPO] Saved order=%s tx=%s\n", order.id(), paymentTransactionId);
    }

    // utilitário para testes/demonstração
    public Map<String, String> dump() { 
        return Map.copyOf(storage); 
    }
}

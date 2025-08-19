package solid.repo;

import solid.domain.Order;

/**
 * DIP: camadas de serviço dependem da abstração do repositório.
 */
public interface OrderRepository {
    void save(Order order, String paymentTransactionId);
}

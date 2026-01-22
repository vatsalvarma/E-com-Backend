package an.E_com.web;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repo;

    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    public List<Order> getAll() {
        return repo.findAll();
    }

    public Order placeOrder(Order order) {
        order.setOrderDate(LocalDateTime.now());
        return repo.save(order);
    }

    public Order getById(Long id) {
        return repo.findById(id).orElse(null);
    }
}

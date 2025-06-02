package fr.benyghil.orderservice.repsoitories;


import fr.benyghil.orderservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}

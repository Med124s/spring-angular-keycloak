package fr.benyghil.inventoryservice.repository;

import fr.benyghil.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}

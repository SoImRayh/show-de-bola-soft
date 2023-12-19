package dev.criasltda.javafxsprintstarter.domain.repository;

import dev.criasltda.javafxsprintstarter.domain.models.Product;
import dev.criasltda.javafxsprintstarter.domain.service.ProductService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

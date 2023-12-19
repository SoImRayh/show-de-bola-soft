package dev.criasltda.javafxsprintstarter.domain.service.impl;

import dev.criasltda.javafxsprintstarter.domain.models.Product;
import dev.criasltda.javafxsprintstarter.domain.repository.ProductRepository;
import dev.criasltda.javafxsprintstarter.domain.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public void create(Product entity) {
        productRepository.save(entity);
    }

    @Override
    public Product update(Product entity) {
        return null;
    }

    @Override
    public Product getOne(Long tnity_id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public void delete(Product entity) {

    }
}

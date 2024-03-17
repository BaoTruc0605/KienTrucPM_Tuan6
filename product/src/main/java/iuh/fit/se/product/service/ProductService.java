package iuh.fit.se.product.service;

import iuh.fit.se.product.models.Product;
import iuh.fit.se.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    public Product getProductByID(Long id){
        return productRepository.findById(id).orElse(null);
    }
}


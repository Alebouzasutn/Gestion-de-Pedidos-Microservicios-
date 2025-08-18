package com.ordermanagement.productservice.service;

import java.util.List;

import com.ordermanagement.productservice.service.dto.ProductRequestDTO;
import com.ordermanagement.productservice.service.dto.ProductResponseDTO;

public interface ProductService {
    ProductResponseDTO createProduct(ProductRequestDTO request);
    ProductResponseDTO getProductById(Long id);
    List<ProductResponseDTO> getAllProducts();
    ProductResponseDTO updateProduct(Long id, ProductRequestDTO request);
    void deleteProduct(Long id);
}

package com.example.product_service.services;

import com.example.product_service.dtos.FakeStoreDto;
import com.example.product_service.dtos.ProductResponseDto;
import com.example.product_service.models.Product;

public interface ProductService {
    public ProductResponseDto getSingleProduct(int productId);
    public ProductResponseDto addProduct(String title, String description,String category,String imageUrl, double price);
}

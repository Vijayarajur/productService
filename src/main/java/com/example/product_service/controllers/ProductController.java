package com.example.product_service.controllers;

import com.example.product_service.dtos.ProductRequestDto;
import com.example.product_service.dtos.ProductResponseDto;
import com.example.product_service.models.Product;
import com.example.product_service.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    private ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/products/{id}")
    public ProductResponseDto getProductDetails(@PathVariable("id") int productid) {
            return productService.getSingleProduct(productid);
    }
    @PostMapping("products")
    public ProductResponseDto createNewProduct(@RequestBody ProductRequestDto productRequestDto) {
        return productService.addProduct(productRequestDto.getTitle(), productRequestDto.getDescription(), productRequestDto.getCategory(), productRequestDto.getImage(), productRequestDto.getPrice());

    }
}

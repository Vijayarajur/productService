package com.example.product_service.dtos;

import com.example.product_service.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreDto extends Product {
    private int id;
    private String title;
    private String description;
    private double price;
    private String image;
    private String category;


    public ProductResponseDto toProductResponseDto() {
        ProductResponseDto productResponseDto = new ProductResponseDto();
        productResponseDto.setId(id);
        productResponseDto.setTitle(title);
        productResponseDto.setDescription(description);
        productResponseDto.setPrice(price);
        productResponseDto.setImage(image);
        productResponseDto.setCategory(category);
        productResponseDto.setPrice(price);

        return productResponseDto;
    }

}

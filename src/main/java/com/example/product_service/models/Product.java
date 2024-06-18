package com.example.product_service.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private int id;
    private String title;
    private String description;
    private double price;
    private String imgUrl;
    private String category;
}

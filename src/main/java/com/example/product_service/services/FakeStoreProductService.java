package com.example.product_service.services;

import com.example.product_service.dtos.FakeStoreDto;
import com.example.product_service.dtos.ProductResponseDto;
import com.example.product_service.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService  implements ProductService{

    private RestTemplate restTemplate;
    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public ProductResponseDto getSingleProduct(int productId){
       FakeStoreDto fakeStoreDto = restTemplate.getForObject("https://fakestoreapi.com/products/"+productId, FakeStoreDto.class);
        return fakeStoreDto.toProductResponseDto();
    }
    @Override
    public ProductResponseDto addProduct(String title, String description,String category,String imageUrl, double price){

           FakeStoreDto fakeStoreDto=new FakeStoreDto();
           fakeStoreDto.setTitle(title);
           fakeStoreDto.setDescription(description);
           fakeStoreDto.setCategory(category);
           fakeStoreDto.setImage(imageUrl);
           fakeStoreDto.setPrice(price);

           FakeStoreDto response=restTemplate.postForObject("https://fakestoreapi.com/products/",fakeStoreDto,FakeStoreDto.class);
           return fakeStoreDto.toProductResponseDto();
    }

}

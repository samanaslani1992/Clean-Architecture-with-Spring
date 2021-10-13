package com.example.demo.entity;

import com.example.demo.model.request.ProductRequestModel;

import java.util.List;

public interface ProductFactory {
    Product create(Integer id, float price, float weight);

    List<Product> create(List<ProductRequestModel> productRequestModels);
}

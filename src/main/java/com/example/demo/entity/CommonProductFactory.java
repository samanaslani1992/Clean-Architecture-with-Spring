package com.example.demo.entity;


import com.example.demo.model.request.ProductRequestModel;

import java.util.List;
import java.util.stream.Collectors;

class CommonProductFactory implements ProductFactory {
    @Override
    public Product create(Integer id, float price, float weight) {
        return new CommonProduct(id, price, weight);
    }

    @Override
    public List<Product> create(List<ProductRequestModel> productRequestModels) {

        return productRequestModels.stream().map(CommonProduct::new).collect(Collectors.toList());
    }
}

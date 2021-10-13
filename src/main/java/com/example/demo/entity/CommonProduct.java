package com.example.demo.entity;


import com.example.demo.model.request.ProductRequestModel;

public class CommonProduct implements Product {


    Integer id;
    float price;
    float weight;


    CommonProduct() {
    }

    public CommonProduct(Integer id, float price, float weight) {
        this.id = id;
        this.price = price;
        this.weight = weight;
    }

    public CommonProduct(ProductRequestModel productRequestModel) {
        this.id = productRequestModel.getId();
        this.price = productRequestModel.getPrice();
        this.weight = productRequestModel.getWeight();
    }

    @Override
    public boolean productIsValid() {
        return weight <= 100 && price <= 100;
    }

    public Integer getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }
}

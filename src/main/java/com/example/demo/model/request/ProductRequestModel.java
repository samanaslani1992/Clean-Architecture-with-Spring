package com.example.demo.model.request;

public class ProductRequestModel {

    Integer id;
    float price;
    float weight;

    public ProductRequestModel() {
        super();
    }

    public ProductRequestModel(Integer id, float price, float weight) {
        super();
        this.id = id;
        this.price = price;
        this.weight = weight;
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

package com.example.demo.useCase;

import java.time.LocalDateTime;

public class ProductDsRequestModel {


    Integer id;
    float price;
    float weight;
    LocalDateTime creationTime;

    public ProductDsRequestModel(Integer id, float price, float weight, LocalDateTime creationTime) {
        this.id = id;
        this.price = price;
        this.weight = weight;
        this.creationTime = creationTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }
}

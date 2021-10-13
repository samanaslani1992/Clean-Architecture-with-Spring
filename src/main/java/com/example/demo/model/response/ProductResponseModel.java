package com.example.demo.model.response;

public class ProductResponseModel {

    int id;
    String creationTime;

    public ProductResponseModel(int id, String creationTime) {
        this.id = id;
        this.creationTime = creationTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }
}

package com.example.demo.repository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "product")
public
class ProductDataMapper {

    @Id
    Integer id;
    float price;
    float weight;
    LocalDateTime creationTime;

    public ProductDataMapper() {
    }

    public ProductDataMapper(Integer id, float price, float weight, LocalDateTime creationTime) {
        super();

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

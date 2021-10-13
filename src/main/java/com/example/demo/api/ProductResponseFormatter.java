package com.example.demo.api;

import com.example.demo.model.response.ProductResponseModel;
import com.example.demo.useCase.ProductPresenter;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ProductResponseFormatter implements ProductPresenter {



    @Override
    public List<ProductResponseModel> prepareSuccessView(List<ProductResponseModel> products) {
        List<ProductResponseModel> productResponseModels = new ArrayList<>();
        products.forEach(productResponseModel -> {
            LocalDateTime responseTime = LocalDateTime.parse(productResponseModel.getCreationTime());
            productResponseModel.setCreationTime(responseTime.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
            productResponseModels.add(productResponseModel);
        });

        return productResponseModels;
    }

    @Override
    public List<ProductResponseModel> prepareFailView(String error) {
        throw new ResponseStatusException(HttpStatus.CONFLICT, error);
    }
}

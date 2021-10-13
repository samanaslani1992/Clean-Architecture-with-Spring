package com.example.demo.useCase;


import com.example.demo.model.response.ProductResponseModel;

import java.util.List;

public interface ProductPresenter {

    List<ProductResponseModel> prepareSuccessView(List<ProductResponseModel> products);

    List<ProductResponseModel> prepareFailView(String error);
}

package com.example.demo.useCase;


import com.example.demo.model.request.ProductRequestModel;
import com.example.demo.model.response.ProductResponseModel;

import java.util.List;

public interface ProductInputBoundary {

    List<ProductResponseModel> create(List<ProductRequestModel> requestModels);
}

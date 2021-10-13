package com.example.demo.api;

import com.example.demo.model.request.ProductRequestModel;
import com.example.demo.model.response.ProductResponseModel;
import com.example.demo.useCase.ProductInputBoundary;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class ProductController {

    final ProductInputBoundary productInput;

    ProductController(ProductInputBoundary accountGateway) {
        this.productInput = accountGateway;
    }


    @PostMapping("/product")
    List<ProductResponseModel> createProducts(@RequestBody List<ProductRequestModel> requestModels) {
        return productInput.create(requestModels);
    }


}

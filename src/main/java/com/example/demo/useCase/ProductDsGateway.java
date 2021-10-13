package com.example.demo.useCase;

import java.util.List;

public interface ProductDsGateway {
    boolean existsById(List<Integer> ids);

    void save(List<ProductDsRequestModel> requestModel);
}

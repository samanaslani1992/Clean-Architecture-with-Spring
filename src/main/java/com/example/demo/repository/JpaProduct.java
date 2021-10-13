package com.example.demo.repository;

import com.example.demo.useCase.ProductDsGateway;
import com.example.demo.useCase.ProductDsRequestModel;

import java.util.List;

class JpaProduct implements ProductDsGateway {

    final JpaProductRepository repository;

    JpaProduct(JpaProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean existsById(List<Integer> ids) {
        return repository.existsAllByIdIn(ids);
    }





    @Override
    public void save(List<ProductDsRequestModel> requestModels) {

        for (ProductDsRequestModel requestModel : requestModels) {
            ProductDataMapper accountDataMapper = new ProductDataMapper(requestModel.getId(), requestModel.getPrice(), requestModel.getWeight(), requestModel.getCreationTime());

            repository.save(accountDataMapper);
        }
    }


}

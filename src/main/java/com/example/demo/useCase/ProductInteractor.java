package com.example.demo.useCase;

import com.example.demo.entity.Product;
import com.example.demo.entity.ProductFactory;
import com.example.demo.model.request.ProductRequestModel;
import com.example.demo.model.response.ProductResponseModel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ProductInteractor implements ProductInputBoundary {

    final ProductDsGateway productDsGateway;
    final ProductPresenter productPresenter;
    final ProductFactory productFactory;

    ProductInteractor(ProductDsGateway productRegisterDfGateway, ProductPresenter productPresenter,
                      ProductFactory productFactory) {
        this.productDsGateway = productRegisterDfGateway;
        this.productPresenter = productPresenter;
        this.productFactory = productFactory;
    }


    @Override
    public List<ProductResponseModel> create(List<ProductRequestModel> requestModels) {

        Stream<Integer> ids = requestModels.stream().map((Function<ProductRequestModel, Integer>) ProductRequestModel::getId);

        if (productDsGateway.existsById(ids.collect(Collectors.toList()))) {
            return productPresenter.prepareFailView("Product already exists.");
        }


        List<Product> products = productFactory.create(requestModels);


        LocalDateTime now = LocalDateTime.now();

        List<ProductDsRequestModel> productDsModel = new ArrayList<>();

        List<ProductResponseModel> productResponseModels = new ArrayList<>();

        for (Product product : products) {
            if (!product.productIsValid()) {
                return productPresenter.prepareFailView("Product weigh must have less than 100 and price less than 100.");
            } else {
                productDsModel.add(new ProductDsRequestModel(product.getId(), product.getPrice(), product.getWeight(), now));
                productResponseModels.add(new ProductResponseModel(product.getId(), now.toString()));
            }
        }


        productDsGateway.save(productDsModel);


        return productPresenter.prepareSuccessView(productResponseModels);
    }
}
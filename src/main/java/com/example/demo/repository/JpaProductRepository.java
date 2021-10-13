package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface JpaProductRepository extends JpaRepository<ProductDataMapper, Integer> {

    boolean existsAllByIdIn(List<Integer> integer);



}

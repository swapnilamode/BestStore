package com.example.beststore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beststore.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{

}

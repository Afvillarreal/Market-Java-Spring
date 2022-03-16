package com.Market.Market.persistence;

import com.Market.Market.persistence.crud.ProductoCrudRepository;
import com.Market.Market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}

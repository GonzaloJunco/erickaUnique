package com.gonzalo.erickaUnique.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gonzalo.erickaUnique.model.Producto;

@Repository
public interface IProducto extends CrudRepository<Producto, Integer> {

}

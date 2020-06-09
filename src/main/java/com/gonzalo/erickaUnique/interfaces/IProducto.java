package com.gonzalo.erickaUnique.interfaces;

import org.hibernate.cfg.JPAIndexHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gonzalo.erickaUnique.model.Producto;

@Repository
public interface IProducto extends JpaRepository<Producto, Integer> {

}

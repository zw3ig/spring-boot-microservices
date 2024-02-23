package com.formacionbdi.springboot.app.productos.springbootservicioproductos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.springboot.app.productos.springbootservicioproductos.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}

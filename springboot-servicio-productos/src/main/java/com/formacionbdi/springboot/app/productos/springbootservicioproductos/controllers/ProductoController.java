package com.formacionbdi.springboot.app.productos.springbootservicioproductos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.productos.springbootservicioproductos.models.entity.Producto;
import com.formacionbdi.springboot.app.productos.springbootservicioproductos.models.service.IProductoService;

@RestController
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> listar(){
        return productoService.findAll();
    }

    @GetMapping("/listar/{id}")
    public Producto detalle(@PathVariable Long id){
        return productoService.findById(id);
    }
}

package com.example.ms_producto.controller;

import com.example.ms_producto.entity.Producto;
import com.example.ms_producto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProductoController {

@Autowired
    private ProductoService productoService;



    @RequestMapping
    public List<Producto> listar() {
        return productoService.listar();
    }
    @RequestMapping("/id")
    public Producto buscar(Integer id) {
        return productoService.listar().get(id);
    }
    @PostMapping
    public Producto guardar (@RequestBody Producto categoria) {
        return productoService.guardar(categoria);
    }

    @PutMapping("/{id}")
    public Producto actualizar ( @PathVariable Integer id,@RequestBody Producto producto) {
        return productoService.actualizar(id, producto);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        productoService.eliminar(id);
    }
}

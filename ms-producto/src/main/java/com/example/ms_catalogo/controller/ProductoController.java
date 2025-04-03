package com.example.ms_catalogo.controller;


import com.example.ms_catalogo.entity.Categoria;
import com.example.ms_catalogo.entity.Producto;
import com.example.ms_catalogo.service.CategoriaService;
import com.example.ms_catalogo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @RequestMapping
    public List<Producto> listar() {
        return productoService.listar();
    }
    @RequestMapping("/id")
    public Categoria buscar(Integer id) {
        return categoriaService.listar().get(id);
    }
    @PostMapping
    public Categoria guardar (@RequestBody Categoria categoria) {
        return categoriaService.guardar(categoria);
    }

    @PutMapping("/{id}")
    public Categoria actualizar ( @PathVariable Integer id,@RequestBody Categoria categoria) {
    return categoriaService.actualizar(id, categoria);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        categoriaService.eliminar(id);
    }
}

package com.example.ms_producto.service.impl;

import com.example.ms_producto.entity.Producto;
import com.example.ms_producto.repository.ProductoRepository;
import com.example.ms_producto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {


    @Autowired
    private ProductoRepository productoRepository;


    @Override
    public List<Producto> listar() {
        return productoRepository.findAll();
    }

    @Override
    public Optional<Producto> buscar(Integer id) {
        return productoRepository.findById(id);
    }

    @Override
    public Producto guardar(Producto categoria) {
        return productoRepository.save(categoria);
    }

    @Override
    public Producto actualizar (Integer id , Producto categoria) {
        categoria.setId(id);
        return productoRepository.save(categoria);
    }

    @Override
    public void eliminar(Integer id) {
        productoRepository.deleteById(id);
    }
}

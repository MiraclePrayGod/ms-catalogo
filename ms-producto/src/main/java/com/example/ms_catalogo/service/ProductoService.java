package com.example.ms_catalogo.service;

import com.example.ms_catalogo.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
     List<Producto> listar();
     Optional<Producto>  buscar(Integer id);
     Producto guardar (Producto producto);
     Producto actualizar (Integer id,Producto producto);
     void eliminar (Integer id);
}
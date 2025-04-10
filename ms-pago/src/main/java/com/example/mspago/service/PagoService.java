package com.example.mspago.service;

import com.example.mspago.entity.Pago;

import java.util.List;
import java.util.Optional;

public interface PagoService {
    List<Pago> listar();
    Optional<Pago> buscar(Integer id);
    Pago guardar (Pago producto);
    Pago actualizar (Integer id,Pago producto);
    void eliminar (Integer id);

}

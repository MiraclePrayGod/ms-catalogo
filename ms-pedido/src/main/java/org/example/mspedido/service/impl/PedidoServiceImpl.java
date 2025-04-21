package org.example.mspedido.service.impl;

import org.example.mspedido.entity.Pedido;
import org.example.mspedido.repository.PedidoRepository;
import org.example.mspedido.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;
    @Override
    public List<Pedido> listar() {
        return pedidoRepository.findAll();
    }

    @Override
    public Optional<Pedido> buscar(Integer id) {
        return pedidoRepository.findById(id);
    }

    @Override
    public Pedido guardar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    public Pedido actualizar(Integer id, Pedido pedido) {
            pedido.setId(id);
        return pedidoRepository.save(pedido);
    }

    @Override
    public void Eliminar(Integer id) {
        pedidoRepository.deleteById(id);
    }
}

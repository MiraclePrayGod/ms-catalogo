package com.example.mspago.controller;

import com.example.mspago.entity.Pago;
import com.example.mspago.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/pagos")
public class PagoController {
    @Autowired
    private PagoService pagoService;



    @RequestMapping
    public List<Pago> listar() {
        return pagoService.listar();
    }


    @RequestMapping("/id")
    public Pago buscar(Integer id) {
        return pagoService.listar().get(id);
    }

    @PostMapping
    public Pago guardar (@RequestBody Pago pago) {
        return pagoService.guardar(pago);
    }

    @PutMapping("/{id}")
    public Pago actualizar (@PathVariable Integer id, @RequestBody Pago pago) {
        return pagoService.actualizar(id, pago);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        pagoService.eliminar(id);
    }

}

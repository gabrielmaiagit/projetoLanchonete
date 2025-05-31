package com.gabrielmaia.lanchonete_service.controller;

import com.gabrielmaia.lanchonete_service.model.Bebida;
import com.gabrielmaia.lanchonete_service.service.BebidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bebidas")
public class BebidaController {

    @Autowired
    private BebidaService bebidaService;

    @PostMapping
    public Bebida cadastrar(@RequestBody Bebida bebida) {
        return bebidaService.salvar(bebida);
    }

    @GetMapping
    public List<Bebida> listarTodas() {
        return bebidaService.listarTodas();
    }

    @GetMapping("/{id}")
    public Optional<Bebida> buscarPorId(@PathVariable Long id) {
        return bebidaService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        bebidaService.deletar(id);
    }
}

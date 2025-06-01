package com.gabrielmaia.lanchonete_service.controller;

import com.gabrielmaia.lanchonete_service.model.Hamburguer;
import com.gabrielmaia.lanchonete_service.service.HamburguerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hamburguer")
@RequiredArgsConstructor
public class HamburguerController {

    private final HamburguerService service;

    @GetMapping
    public List<Hamburguer> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Optional<Hamburguer> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Hamburguer salvar(@RequestBody Hamburguer hamburguer) {
        return service.salvar(hamburguer);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}

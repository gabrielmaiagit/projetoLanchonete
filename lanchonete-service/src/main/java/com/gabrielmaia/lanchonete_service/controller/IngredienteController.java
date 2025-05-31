package com.gabrielmaia.lanchonete_service.controller;

import com.gabrielmaia.lanchonete_service.model.Ingrediente;
import com.gabrielmaia.lanchonete_service.service.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ingredientes")
public class IngredienteController {

    @Autowired
    private IngredienteService ingredienteService;

    @PostMapping
    public Ingrediente cadastrar(@RequestBody Ingrediente ingrediente) {
        return ingredienteService.salvar(ingrediente);
    }

    @GetMapping
    public List<Ingrediente> listarTodos() {
        return ingredienteService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Ingrediente> buscarPorId(@PathVariable Long id) {
        return ingredienteService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        ingredienteService.deletar(id);
    }
}

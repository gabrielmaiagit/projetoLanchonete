package com.gabrielmaia.lanchonete_service.service;

import com.gabrielmaia.lanchonete_service.model.Ingrediente;
import com.gabrielmaia.lanchonete_service.repository.IngredienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredienteService {

    @Autowired
    private IngredienteRepo ingredienteRepo;

    public Ingrediente salvar(Ingrediente ingrediente) {
        return ingredienteRepo.save(ingrediente);
    }

    public List<Ingrediente> listarTodos() {
        return ingredienteRepo.findAll();
    }

    public Optional<Ingrediente> buscarPorId(Long id) {
        return ingredienteRepo.findById(id);
    }

    public void deletar(Long id) {
        ingredienteRepo.deleteById(id);
    }
}

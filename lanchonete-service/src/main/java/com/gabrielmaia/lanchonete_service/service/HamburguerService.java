package com.gabrielmaia.lanchonete_service.service;

import com.gabrielmaia.lanchonete_service.model.Hamburguer;
import com.gabrielmaia.lanchonete_service.repository.HamburguerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HamburguerService {

    private final HamburguerRepo repository;

    public List<Hamburguer> listar() {
        return repository.findAll();
    }

    public Hamburguer salvar(Hamburguer hamburguer) {
        if (hamburguer.getIngredientes() == null || hamburguer.getIngredientes().isEmpty()) {
            throw new RuntimeException("Hamburguer deve conter pelo menos um ingrediente.");
        }
        if (hamburguer.getPreco() == null || hamburguer.getPreco().compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("Preço inválido.");
        }
        return repository.save(hamburguer);
    }

    public Optional<Hamburguer> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

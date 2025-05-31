package com.gabrielmaia.lanchonete_service.service;

import com.gabrielmaia.lanchonete_service.model.Bebida;
import com.gabrielmaia.lanchonete_service.repository.BebidaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BebidaService {

    @Autowired
    private BebidaRepo bebidaRepo;

    public Bebida salvar(Bebida bebida) {
        return bebidaRepo.save(bebida);
    }

    public List<Bebida> listarTodas() {
        return bebidaRepo.findAll();
    }

    public Optional<Bebida> buscarPorId(Long id) {
        return bebidaRepo.findById(id);
    }

    public void deletar(Long id) {
        bebidaRepo.deleteById(id);
    }
}

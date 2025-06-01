package com.gabrielmaia.lanchonete_service.service;

import com.gabrielmaia.lanchonete_service.model.Pedido;
import com.gabrielmaia.lanchonete_service.repository.PedidoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoRepo repository;

    public List<Pedido> listar() {
        return repository.findAll();
    }

    public Pedido salvar(Pedido pedido) {
        return repository.save(pedido);
    }

    public Optional<Pedido> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

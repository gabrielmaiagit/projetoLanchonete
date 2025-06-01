package com.gabrielmaia.lanchonete_service.repository;

import com.gabrielmaia.lanchonete_service.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepo extends JpaRepository<Pedido, Long> {

}


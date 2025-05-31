package com.gabrielmaia.lanchonete_service.repository;

import com.gabrielmaia.lanchonete_service.model.Bebida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BebidaRepo extends JpaRepository<Bebida, Long> {
}

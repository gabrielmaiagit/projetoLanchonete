package com.gabrielmaia.lanchonete_service.repository;

import com.gabrielmaia.lanchonete_service.model.Hamburguer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HamburguerRepo extends JpaRepository<Hamburguer, Long> {
}

package com.gabrielmaia.lanchonete_service.repository;

import com.gabrielmaia.lanchonete_service.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredienteRepo extends JpaRepository<Ingrediente, Long> {
}

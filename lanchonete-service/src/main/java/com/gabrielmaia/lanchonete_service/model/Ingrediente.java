package com.gabrielmaia.lanchonete_service.model;

import jakarta.persistence.*;
        import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ingredientes")
@Data
@NoArgsConstructor
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private Double preco;

    @Column(name = "pode_ser_adicional")
    private Boolean podeSerAdicional;
}

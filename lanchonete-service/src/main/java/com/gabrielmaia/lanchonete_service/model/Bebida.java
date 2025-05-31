package com.gabrielmaia.lanchonete_service.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bebidas")
@Data
@NoArgsConstructor

public class Bebida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private Double preco;

    @Column(name = "possui_acucar")
    private Boolean possuiAcucar;
}

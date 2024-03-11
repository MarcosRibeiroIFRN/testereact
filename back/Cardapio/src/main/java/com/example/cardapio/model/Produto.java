package com.example.cardapio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)//escolhe a melhor estratégia automaticamente para incremento de id
    private Integer id;
    private String nome;
    private String image;
    private Double valor;
    private String observacao;
}

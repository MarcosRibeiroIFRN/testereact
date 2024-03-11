package com.example.cardapio.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cardapio.model.Produto;


@Repository //                                           classe,tipo do id para gerar dinamicamente 
public interface ProdutoRepository extends JpaRepository<Produto,Integer > {

    
 

    
}

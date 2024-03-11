package com.example.cardapio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cardapio.repository.ProdutoRepository;
import com.example.cardapio.model.Produto;

@Service
public class ProdutoService {
    @Autowired// devolve a instancia pronta da classe
    private ProdutoRepository produtoRepository;

    public List<Produto> obterTodos(){
        return produtoRepository.findAll();
    }

    public Optional<Produto> obterPorid(Integer id){
        return produtoRepository.findById(id);

    }

    public Produto adicionar(Produto produto){
        return produtoRepository.save(produto);
    }

    public void deletar(Integer id){
        produtoRepository.deleteById(id);
    }

    public Produto atualizar(Produto produto, Integer id){
       produto.setId(id);
       return produtoRepository.save(produto);
    }

}

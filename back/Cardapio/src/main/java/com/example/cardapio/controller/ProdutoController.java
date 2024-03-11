package com.example.cardapio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.example.cardapio.model.Produto;
import com.example.cardapio.services.ProdutoService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController //dizendo ao spring que é um Controlador
@RequestMapping("/api/produtos")
public class ProdutoController {
    
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> obterTodos(){
        return produtoService.obterTodos();
    }

    @GetMapping("/{id}")
    public Optional<Produto> obterPorId(@PathVariable Integer id){
        return produtoService.obterPorid(id);
    }

    @PostMapping
    public Produto adicionar(@RequestBody Produto produto){
        return produtoService.adicionar(produto);
    }

    @DeleteExchange("/{id}")
    public String deletar (@PathVariable Integer id){
        produtoService.deletar(id);
        return "Produto com id: " + id + " foi deletado com sucesso!";
    }

    @PutMapping("/{id}")
    public Produto atualizar(@RequestBody Produto produto,@PathVariable Integer id){
        
        return produtoService.atualizar(produto, id);
    }

}

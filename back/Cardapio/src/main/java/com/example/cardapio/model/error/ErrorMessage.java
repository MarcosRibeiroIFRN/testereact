package com.example.cardapio.model.error;

import lombok.Data;

@Data
public class ErrorMessage {
    
    public ErrorMessage(String string, int value, String message) {
        //TODO Auto-generated constructor stub
    }
    private String titulo;
    private Integer status;
    private String mensagem;
}

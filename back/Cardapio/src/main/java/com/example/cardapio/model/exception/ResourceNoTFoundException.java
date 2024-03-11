package com.example.cardapio.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class ResourceNoTFoundException extends RuntimeException {
    
    public ResourceNoTFoundException(String mensagem) {
        super(mensagem);
    }
}

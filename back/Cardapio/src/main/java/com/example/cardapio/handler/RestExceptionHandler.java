package com.example.cardapio.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.cardapio.model.error.ErrorMessage;
import com.example.cardapio.model.exception.ResourceNoTFoundException;

@ControllerAdvice
public class RestExceptionHandler {
    
    @ExceptionHandler(ResourceNoTFoundException.class)//escuta excetions dentro da api
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNoTFoundException ex){

        ErrorMessage error = new ErrorMessage("Not found",HttpStatus.NOT_FOUND.value(),ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}

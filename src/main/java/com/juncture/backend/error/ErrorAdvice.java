package com.juncture.backend.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ErrorAdvice {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<RestErrorFormat>> handleMethodArguementNotValidException(MethodArgumentNotValidException exception, WebRequest request){
        List<RestErrorFormat> errors = new ArrayList<>();
        exception.getBindingResult().getAllErrors().forEach((error)->{
            String fieldName = ((FieldError) error).getField();
            String message = error.getDefaultMessage();
            errors.add(new RestErrorFormat(message,fieldName));
        });
        return new ResponseEntity<List<RestErrorFormat>>(errors,HttpStatus.BAD_REQUEST);
    }
}

package br.com.joaopcamposs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationExcepiton extends  RuntimeException{

    private static final long serialVersionUID = 1L;

    public UnsuportedMathOperationExcepiton(String exception){
        super(exception);
    }
}

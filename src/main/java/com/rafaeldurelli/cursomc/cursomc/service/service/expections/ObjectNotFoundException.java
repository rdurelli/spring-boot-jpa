package com.rafaeldurelli.cursomc.cursomc.service.service.expections;

public class ObjectNotFoundException extends RuntimeException{

    public ObjectNotFoundException() {
    }

    public ObjectNotFoundException(String message) {
        super(message);
    }

    public ObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

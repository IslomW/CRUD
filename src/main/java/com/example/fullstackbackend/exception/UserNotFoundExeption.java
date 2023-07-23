package com.example.fullstackbackend.exception;

public class UserNotFoundExeption extends RuntimeException{

    public UserNotFoundExeption(Long id){
        super("couldn't found the user with id"+id);
    }
}

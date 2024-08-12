package com.anything.exception;

public class UserNameExistsException extends Exception{
    public UserNameExistsException(String message){
        super(message);
    }
}

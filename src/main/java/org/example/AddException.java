package org.example;

public class AddException extends Exception{
    @Override
    public String getMessage() {
        return "The group is full adding a student is not possible";
    }
}

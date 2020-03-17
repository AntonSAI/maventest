package com.myconverter.exception;

public class IllegalNumberException extends Exception {

    private double number;

    public double getNumber() {
        return number;
    }

    public IllegalNumberException(String message, double number) {
        super(message);
        this.number = number;
    }
}

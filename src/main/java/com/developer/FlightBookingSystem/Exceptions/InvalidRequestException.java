/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.developer.FlightBookingSystem.Exceptions;

/**
 *
 * @author HP
 */
public class InvalidRequestException extends RuntimeException{
     private int status;
    private String message;

    public InvalidRequestException() {
        super();
    }

    public InvalidRequestException(int status, String message) {
        super();
        this.status = status;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "InvalidRequestException{" +
                "status=" + status +
                "message='" + message + '\'' +
                '}';
    }
}

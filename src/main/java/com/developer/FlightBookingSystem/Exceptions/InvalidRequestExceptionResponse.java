/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.developer.FlightBookingSystem.Exceptions;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 *
 * @author HP
 */

public class InvalidRequestExceptionResponse {
      private int status;
    private String message;

    public InvalidRequestExceptionResponse(InvalidRequestException ex)
    {
        this.status = ex.getStatus();
        this.message = ex.getMessage();
    }

    public InvalidRequestExceptionResponse(int status, String message)
    {
        this.status = status;
        this.message = message;
    }
}

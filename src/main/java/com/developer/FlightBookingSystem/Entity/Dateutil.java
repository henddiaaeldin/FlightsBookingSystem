/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.developer.FlightBookingSystem.Entity;

/**
 *
 * @author HP
 */

    import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dateutil {
	public static final DateTimeFormatter GlobalDateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	
	public static LocalDateTime toLocalDateTime(String strDate) {
		return LocalDateTime.parse(strDate, GlobalDateFormatter);
	}
	

}

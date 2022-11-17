/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.developer.FlightBookingSystem.Entity.Service;

import com.developer.FlightBookingSystem.Entity.FlightEntity;
import java.util.List;

/**
 *
 * @author HP
 */
public interface AdminService {
    List<FlightEntity> getAllFlights();
    FlightEntity getFlightById(Long FlightID);
    FlightEntity saveFlight(FlightEntity flightEntity);
    FlightEntity updateFlight(FlightEntity flightEntity);
    void deleteFlight(Long FlightID);
}

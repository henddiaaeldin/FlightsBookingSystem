/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.developer.FlightBookingSystem.Entity.Controller;

import com.developer.FlightBookingSystem.Entity.FlightEntity;
import com.developer.FlightBookingSystem.Entity.Service.FlightService;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping("flight")
public class FlightController {
    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }
    
    @GetMapping
public List<FlightEntity> getAllFlights() {
    return flightService.getAllFlights();
    }

@GetMapping("/{id}")  
    public FlightEntity getFlightById(@PathVariable("id") Long FlightId) {
        return flightService.getFlightById(FlightId);
        }

@PostMapping  
    public FlightEntity saveFlight(@RequestBody FlightEntity flightEntity) {
    return flightService.saveFlight(flightEntity);
    }

 @PutMapping
    public FlightEntity updateFlight(@RequestBody FlightEntity flightEntity) {
    return flightService.updateFlight(flightEntity);
    }

 @DeleteMapping("/{id}")  
    public void deleteFlight(@PathVariable("id") Long FlightID) {
    flightService.deleteFlight(FlightID);
    }

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.developer.FlightBookingSystem.Impl;

import com.developer.FlightBookingSystem.Entity.FlightEntity;
import com.developer.FlightBookingSystem.Entity.Service.FlightService;
import com.developer.FlightBookingSystem.Repository.FlightRepository;
import java.util.List;

/**
 *
 * @author HP
 */
public class AdminServiceImpl implements FlightService{
    private final FlightRepository flightRepository;

    public AdminServiceImpl(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    
    /**
     *
     * @return
     */
    @Override
    public List<FlightEntity> getAllFlights() {
    return flightRepository.findAll();
    }

    @Override
    public FlightEntity getFlightById(Long FlightID) {
        return flightRepository.getById(FlightID);
        }

    @Override
    public FlightEntity saveFlight(FlightEntity flightEntity) {
    return flightRepository.save(flightEntity);
    }
    
    
    @Override
    public FlightEntity updateFlight(FlightEntity flightEntity) {
    return flightRepository.save(flightEntity);
    }

    @Override
    public void deleteFlight(Long FlightID) {
    flightRepository.deleteById(FlightID);
    }
}

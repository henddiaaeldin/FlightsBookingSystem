/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unusable;

import com.developer.FlightBookingSystem.Entity.AirportEntity;
import Unusable.AirportRepository;
import java.util.List;

/**
 *
 * @author HP
 */
public class AirportServiceImpl implements AirportService {

    private final AirportRepository airportRepository;

    public AirportServiceImpl(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }
            
    @Override
    public AirportEntity getAirportById(Long AirportId) {
        return airportRepository.getById(AirportId);
    }

    @Override
    public List<AirportEntity> getAllAirports() {
         return airportRepository.findAll();
    }
    
}

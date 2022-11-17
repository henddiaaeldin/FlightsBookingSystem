/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unusable;

import com.developer.FlightBookingSystem.Entity.PassengerEntity;
import Unusable.PassengerRepository;
import java.util.List;

/**
 *
 * @author HP
 */
public class PassengerServiceImpl implements PassengerService{
 private final PassengerRepository passengerRepository;

    public PassengerServiceImpl(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }
    
    @Override
    public PassengerEntity getPassengerById(Long PassengerId) {
    return passengerRepository.getById(PassengerId);
    }

    @Override
    public List<PassengerEntity> getAllPassengers() {
    return passengerRepository.findAll();
    }
    
}

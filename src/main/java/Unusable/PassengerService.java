/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unusable;

import com.developer.FlightBookingSystem.Entity.PassengerEntity;
import java.util.List;

/**
 *
 * @author HP
 */
public interface PassengerService {
    PassengerEntity getPassengerById(Long PassengerId);
	List<PassengerEntity> getAllPassengers();
}

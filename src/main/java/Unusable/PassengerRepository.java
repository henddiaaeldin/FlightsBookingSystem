/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unusable;

import com.developer.FlightBookingSystem.Entity.PassengerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author HP
 */
public interface PassengerRepository extends JpaRepository<PassengerEntity, Long> {
    
}

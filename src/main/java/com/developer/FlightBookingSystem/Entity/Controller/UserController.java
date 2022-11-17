/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.developer.FlightBookingSystem.Entity.Controller;

import com.developer.FlightBookingSystem.Entity.ReservationEntity;
import com.developer.FlightBookingSystem.Entity.Service.ReservationService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author HP
 */
public class UserController {
    private final ReservationService reservationService;

    public UserController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    
    
    @GetMapping("/{id}")  
    public ReservationEntity getReservationById(@PathVariable("id") Long ReservationId) {
    return reservationService.getReservationById(ReservationId);
    }

    @GetMapping
    public List<ReservationEntity> getAllReservations() {
    return reservationService.getAllReservations();
    }

    @PostMapping  
    public ReservationEntity saveReservation(@RequestBody ReservationEntity reservationEntity) {
    return reservationService.saveReservation(reservationEntity);
    }

   @PutMapping
    public ReservationEntity updateReservation(@RequestBody ReservationEntity reservationEntity) {
    return reservationService.updateReservation(reservationEntity);
    }

    @DeleteMapping("/{id}")  
    public void deleteReservation(@PathVariable("id") Long ReservationID) {
    reservationService.deleteReservation(ReservationID);
    }
}

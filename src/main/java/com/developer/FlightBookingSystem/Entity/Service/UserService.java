/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.developer.FlightBookingSystem.Entity.Service;

import com.developer.FlightBookingSystem.Entity.ReservationEntity;

/**
 *
 * @author HP
 */
public interface UserService {
     ReservationEntity getReservationById(Long ReservationId);
    ReservationEntity saveReservation(ReservationEntity reservationEntity);
    ReservationEntity updateReservation(ReservationEntity reservationEntity);
    void deleteReservation(Long ReservationID);
}

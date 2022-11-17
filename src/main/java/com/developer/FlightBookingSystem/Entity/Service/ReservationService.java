/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.developer.FlightBookingSystem.Entity.Service;

import com.developer.FlightBookingSystem.Entity.ReservationEntity;
import java.util.List;

/**
 *
 * @author HP
 */
public interface ReservationService {
    ReservationEntity getReservationById(Long ReservationId);
	List<ReservationEntity> getAllReservations();
         ReservationEntity saveReservation(ReservationEntity reservationEntity);
    ReservationEntity updateReservation(ReservationEntity reservationEntity);
    void deleteReservation(Long ReservationID);
}

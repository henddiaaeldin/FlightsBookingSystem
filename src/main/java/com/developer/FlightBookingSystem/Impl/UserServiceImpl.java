/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.developer.FlightBookingSystem.Impl;

import com.developer.FlightBookingSystem.Entity.ReservationEntity;
import com.developer.FlightBookingSystem.Entity.Service.ReservationService;
import com.developer.FlightBookingSystem.Repository.ReservationRepository;
import java.util.List;

/**
 *
 * @author HP
 */
public class UserServiceImpl implements ReservationService{
      private final ReservationRepository reservationRepository;

    public UserServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public ReservationEntity getReservationById(Long ReservationId) {
    return reservationRepository.getById(ReservationId);
    }

    @Override
    public List<ReservationEntity> getAllReservations() {
    return reservationRepository.findAll();
    }

    @Override
    public ReservationEntity saveReservation(ReservationEntity reservationEntity) {
    return reservationRepository.save(reservationEntity);
    }

    @Override
    public ReservationEntity updateReservation(ReservationEntity reservationEntity) {
    return reservationRepository.save(reservationEntity);
    }

    @Override
    public void deleteReservation(Long ReservationID) {
    reservationRepository.deleteById(ReservationID);
    }
   
}

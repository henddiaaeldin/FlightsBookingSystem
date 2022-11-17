/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.developer.FlightBookingSystem.Entity;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

/**
 *
 * @author HP
 */
@Entity
@Component
@Table(name = "Reservation")
public class ReservationEntity {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ReservationID")
	private Long id;
	
	@Column(name = "FlightID")
        @NotNull
        @JoinColumn(name = "FlightID", referencedColumnName = "FlightID")
	private long FlightID;
        @Column(name = "PassengerID")
        @NotNull
        @JoinColumn(name = "PassengerID", referencedColumnName = "PassengerID")
	private Long PassengerID;
        @Column(name = "NumberOfSeats")
        @NotNull
	private Long NoOfSeats;
        @Column(name = "Amount")
        @NotNull
	private Double Amount;
        
        public static enum Class {economic, business};
@Column(name = "TicketClass")
  @Enumerated(EnumType.STRING)
Class c;
                public static enum Status{available, cancelled};
@Column(name = "Status")
  @Enumerated(EnumType.STRING)
Status s;
}

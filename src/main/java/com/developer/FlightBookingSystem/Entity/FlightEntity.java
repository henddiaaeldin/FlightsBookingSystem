/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.developer.FlightBookingSystem.Entity;

import com.sun.istack.NotNull;
import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters.LocalDateTimeConverter;
import com.developer.FlightBookingSystem.Entity.Dateutil;
import org.springframework.stereotype.Component;

/**
 *
 * @author HP
 */
@Component
@Entity
@Table(name = "Flight")
public class FlightEntity {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FlightID")
	private Long id;
    @Column(name = "DepartureDate")
    @NotNull
    @Convert(converter = LocalDateTimeConverter.class)
	private LocalDateTime departureDate;
    @Column(name = "ArrivalDate")
    @NotNull
    @Convert(converter = LocalDateTimeConverter.class)
	private LocalDateTime arrivalDate;
    @Column(name = "Fare")
    @NotNull
        private Double fare;
    @JoinColumn(name = "AirportID", referencedColumnName = "AirportID")
        private Long departure_AirportID;
    @JoinColumn(name = "AirportID", referencedColumnName = "AirportID")
        private Long destination_PortID;

    public FlightEntity() {
    }

    public FlightEntity(Long id, LocalDateTime departureDate, LocalDateTime arrivalDate, Double fare, Long departure_AirportID, Long destination_PortID) {
        this.id = id;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.fare = fare;
        this.departure_AirportID = departure_AirportID;
        this.destination_PortID = destination_PortID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }

    public Long getDeparture_AirportID() {
        return departure_AirportID;
    }

    public void setDeparture_AirportID(Long departure_AirportID) {
        this.departure_AirportID = departure_AirportID;
    }

    public Long getDestination_PortID() {
        return destination_PortID;
    }

    public void setDestination_PortID(Long destination_PortID) {
        this.destination_PortID = destination_PortID;
    }
 
     
}
	
   
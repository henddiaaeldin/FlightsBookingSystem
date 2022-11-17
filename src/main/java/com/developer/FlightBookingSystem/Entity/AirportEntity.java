/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.developer.FlightBookingSystem.Entity;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

/**
 *
 * @author HP
 */
@Component
@Entity
@Table(name = "Airport")
public class AirportEntity {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "AirportID")
	private Long AirportID;
   @NotNull
   @Column(name = "AirportName")
	private String name;
   @NotNull
   @Column(name = "City")
	private String city;
   @NotNull
   @Column(name = "Country")
        private String country;

    public AirportEntity() {
    }

    public AirportEntity(Long AirportID, String name, String city, String country) {
        this.AirportID = AirportID;
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public Long getAirportID() {
        return AirportID;
    }

    public void setAirportID(Long AirportID) {
        this.AirportID = AirportID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
   
   
}

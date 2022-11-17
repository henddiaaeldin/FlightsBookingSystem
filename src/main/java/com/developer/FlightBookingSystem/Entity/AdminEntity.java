/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.developer.FlightBookingSystem.Entity;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.stereotype.Component;


/**
 *
 * @author HP
 */
@Component
@Entity
public class AdminEntity {
      @Id
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdminEntity)) return false;
        AdminEntity admin = (AdminEntity) o;
        return getUsername().equals(admin.getUsername()) &&
                getPassword().equals(admin.getPassword());
    }

    public int hashCode() {
        return Objects.hash(getUsername(), getPassword());
    }

    public String toString() {
        return "Admin{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

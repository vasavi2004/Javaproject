package com.vsm.vehicleservicemanagement.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ServiceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serviceType;
    private LocalDate serviceDate;
    private double cost;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")  // This column links to the 'vehicle' table
    private Vehicle vehicle;

    // Default Constructor
    public ServiceRecord() {
    }

    // Parameterized Constructor
    public ServiceRecord(Long id, String serviceType, LocalDate serviceDate, double cost, Vehicle vehicle) {
        this.id = id;
        this.serviceType = serviceType;
        this.serviceDate = serviceDate;
        this.cost = cost;
        this.vehicle = vehicle;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public LocalDate getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(LocalDate serviceDate) {
        this.serviceDate = serviceDate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

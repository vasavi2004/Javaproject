package com.vsm.vehicleservicemanagement.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String registrationNumber;
    private String model;
    private String ownerName;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;  // Link to Customer

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL)
    private List<ServiceRecord> serviceRecords;

    // Constructors
    public Vehicle() {}

    public Vehicle(Long id, String registrationNumber, String model, String ownerName, Customer customer) {
        this.id = id;
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.ownerName = ownerName;
        this.customer = customer;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<ServiceRecord> getServiceRecords() {
        return serviceRecords;
    }

    public void setServiceRecords(List<ServiceRecord> serviceRecords) {
        this.serviceRecords = serviceRecords;
    }
}

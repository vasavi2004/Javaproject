package com.vsm.vehicleservicemanagement.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;
    private String paymentMethod;
    private LocalDate paymentDate;
    private String paymentStatus; // e.g., "Paid", "Pending"

    @ManyToOne
    @JoinColumn(name = "service_record_id")
    private ServiceRecord serviceRecord; // Link to the service record

    public Payment() {
    }

    public Payment(Long id, double amount, String paymentMethod, LocalDate paymentDate, String paymentStatus, ServiceRecord serviceRecord) {
        this.id = id;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
        this.paymentStatus = paymentStatus;
        this.serviceRecord = serviceRecord;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public ServiceRecord getServiceRecord() {
        return serviceRecord;
    }

    public void setServiceRecord(ServiceRecord serviceRecord) {
        this.serviceRecord = serviceRecord;
    }
}

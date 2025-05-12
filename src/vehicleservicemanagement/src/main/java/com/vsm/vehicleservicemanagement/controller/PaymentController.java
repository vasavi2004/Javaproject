package com.vsm.vehicleservicemanagement.controller;

import com.vsm.vehicleservicemanagement.entity.Payment;
import com.vsm.vehicleservicemanagement.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    // Create a payment
    @PostMapping
    public ResponseEntity<Payment> createPayment(@RequestBody Payment payment) {
        Payment savedPayment = paymentService.createPayment(payment);
        return ResponseEntity.status(201).body(savedPayment);
    }

    // Get all payments
    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    // Get payment by ID
    @GetMapping("/{id}")
    public ResponseEntity<Payment> getPaymentById(@PathVariable Long id) {
        Optional<Payment> payment = paymentService.getPaymentById(id);
        return payment.map(ResponseEntity::ok)
                      .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Update payment status
    @PutMapping("/{id}")
    public ResponseEntity<Payment> updatePaymentStatus(@PathVariable Long id, @RequestBody Payment payment) {
        Optional<Payment> updatedPayment = paymentService.updatePaymentStatus(id, payment);
        return updatedPayment.map(ResponseEntity::ok)
                             .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Delete a payment
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePayment(@PathVariable Long id) {
        paymentService.deletePayment(id);
        return ResponseEntity.noContent().build();
    }
}

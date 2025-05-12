package com.vsm.vehicleservicemanagement.service;

import com.vsm.vehicleservicemanagement.entity.Payment;
import com.vsm.vehicleservicemanagement.repo.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    // Create a payment
    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    // Get all payments
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    // Get payment by ID
    public Optional<Payment> getPaymentById(Long id) {
        return paymentRepository.findById(id);
    }

    // Update payment status
    public Optional<Payment> updatePaymentStatus(Long id, Payment payment) {
        if (paymentRepository.existsById(id)) {
            payment.setId(id);
            return Optional.of(paymentRepository.save(payment));
        }
        return Optional.empty();
    }

    // Delete payment
    public void deletePayment(Long id) {
        paymentRepository.deleteById(id);
    }
}

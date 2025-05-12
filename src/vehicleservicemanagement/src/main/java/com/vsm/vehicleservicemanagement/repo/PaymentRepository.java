package com.vsm.vehicleservicemanagement.repo;

import com.vsm.vehicleservicemanagement.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    // Custom queries can be added if necessary
}

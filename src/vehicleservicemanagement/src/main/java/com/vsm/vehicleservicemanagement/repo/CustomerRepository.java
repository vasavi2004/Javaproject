package com.vsm.vehicleservicemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vsm.vehicleservicemanagement.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Custom query methods can be added here if needed
}

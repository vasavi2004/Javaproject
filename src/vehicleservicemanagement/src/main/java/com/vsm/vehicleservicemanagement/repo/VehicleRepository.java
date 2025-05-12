package com.vsm.vehicleservicemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vsm.vehicleservicemanagement.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    // Custom query methods can be added here if needed
}

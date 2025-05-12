package com.vsm.vehicleservicemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vsm.vehicleservicemanagement.entity.ServiceRecord;

public interface ServiceRecordRepository extends JpaRepository<ServiceRecord, Long> {
    // Custom query methods can be added here if needed
}

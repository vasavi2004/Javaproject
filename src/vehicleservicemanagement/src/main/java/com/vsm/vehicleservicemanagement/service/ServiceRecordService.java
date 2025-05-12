package com.vsm.vehicleservicemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vsm.vehicleservicemanagement.entity.ServiceRecord;
import com.vsm.vehicleservicemanagement.repo.ServiceRecordRepository;

@Service
public class ServiceRecordService {

    @Autowired
    private ServiceRecordRepository serviceRecordRepository;

    public List<ServiceRecord> getAllServices() {
        return serviceRecordRepository.findAll();
    }

    public Optional<ServiceRecord> getServiceById(Long id) {
        return serviceRecordRepository.findById(id);
    }

    public ServiceRecord saveOrUpdateService(ServiceRecord serviceRecord) {
        return serviceRecordRepository.save(serviceRecord);
    }

    public void deleteService(Long id) {
        serviceRecordRepository.deleteById(id);
    }
}

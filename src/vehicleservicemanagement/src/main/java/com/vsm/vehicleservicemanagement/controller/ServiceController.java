package com.vsm.vehicleservicemanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.vsm.vehicleservicemanagement.entity.ServiceRecord;
import com.vsm.vehicleservicemanagement.service.ServiceRecordService;

@RestController
@RequestMapping("/services")
public class ServiceController {

    @Autowired
    private ServiceRecordService serviceRecordService;

    @PostMapping("/service-records")
    public ResponseEntity<ServiceRecord> createOrUpdateService(@RequestBody ServiceRecord service) {
        ServiceRecord savedService = serviceRecordService.saveOrUpdateService(service);
        return new ResponseEntity<>(savedService, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ServiceRecord>> getAllServices() {
        List<ServiceRecord> services = serviceRecordService.getAllServices();
        return new ResponseEntity<>(services, HttpStatus.OK);
    }

    @GetMapping("/service-records/{id}")
    public ResponseEntity<ServiceRecord> getServiceById(@PathVariable Long id) {
        Optional<ServiceRecord> service = serviceRecordService.getServiceById(id);
        return service.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                      .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/service-records/{id}")
    public ResponseEntity<Void> deleteService(@PathVariable Long id) {
        serviceRecordService.deleteService(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

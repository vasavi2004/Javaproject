package com.vsm.vehicleservicemanagement.controller;

import com.vsm.vehicleservicemanagement.entity.Vehicle;
import com.vsm.vehicleservicemanagement.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    // Create a new vehicle
    @PostMapping
    public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.saveOrUpdateVehicle(vehicle);
    }

    // Get all vehicles
    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    // Get vehicle by ID
    @GetMapping("/{id}")
    public ResponseEntity<Vehicle> getVehicleById(@PathVariable Long id) {
        Optional<Vehicle> vehicle = vehicleService.getVehicleById(id);
        if (vehicle.isPresent()) {
            return ResponseEntity.ok(vehicle.get()); // Return 200 OK with the vehicle
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body(null); // Return 404 Not Found if vehicle doesn't exist
        }
    }

    // Delete vehicle by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteVehicle(@PathVariable Long id) {
        Optional<Vehicle> vehicle = vehicleService.getVehicleById(id);
        if (vehicle.isPresent()) {
            vehicleService.deleteVehicle(id);
            return ResponseEntity.ok("Vehicle deleted successfully"); // Return 200 OK for successful deletion
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body("Vehicle not found"); // Return 404 Not Found if vehicle doesn't exist
        }
    }
}

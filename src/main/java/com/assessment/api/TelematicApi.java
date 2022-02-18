package com.assessment.codeexercise.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("bb/telematics/v1")
public class HealthController {

    @Autowired private VehicleRequestService vehicleRequestService;

    @GetMapping("/vehicle/")
    public static ResponseEntity<VehicleResponse>  getVehcileDetails(String vin, 
    String model, String make, String color) {
        return vehicleRequestService.getVehcileDetails(vin, model, make, color);
    }

    @GetMapping("/vehicle/")
    public static ResponseEntity<VehicleResponse>  getVehcileDetails(String vin, Timestamp start, Timestamp end) {
        return vehicleRequestService.getVehcileTelematics(vin, start, end);
    }
}
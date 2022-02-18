package com.assessment.codeexercise.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("bb/telematics/v1")
public class HealthController {

    @GetMapping("/vehicle/")
    public static ResponseEntity<VehicleResponse>  getVehcileDetails(String vin, String model, String make) {
        return "pong";
    }
}
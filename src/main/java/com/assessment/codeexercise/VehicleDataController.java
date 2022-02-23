package com.assessment.codeexercise;

import com.assessment.codeexercise.dto.VehicleDataRequest;
import com.assessment.codeexercise.dto.VehicleDataResponse;
import com.assessment.codeexercise.dto.VehicleTripDataResponse;
import com.assessment.codeexercise.service.VehicleDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleDataController {

    @Autowired
    VehicleDataService service;

    /*
    http://localhost:8080/fetchVehicleAndTelematicsData
    body=JSON
     */
    @GetMapping(path="fetchVehicleAndTelematicsData", consumes = "application/json", produces = "application/json")
    public VehicleDataResponse fetchVehicleAndTelematicsData(@RequestBody VehicleDataRequest dataRequest) {
        return service.getVehicleAndTelematicsData(dataRequest.getMake(), dataRequest.getModel(),
                dataRequest.getColor());
    }

    /*
    http://localhost:8080/fetchTripDataForVehicle?vin=INPUTVIN
    body=No Body
     */
    @GetMapping(path="fetchTripDataForVehicle", produces = "application/json")
    public VehicleTripDataResponse fetchTripDataForVehicle(@RequestParam String vin) {
        return service.getTripDataForVehicle(vin);
    }

}

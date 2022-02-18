package com.assessment.codeexercise.serviceimpl;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;


@Service
public class VehicleRequestService {
    private final TelematicRepository telematicRepository;

    @Autowired
    public VehicleRequestService(TelematicRepository telematicRepository) {
        this.telematicRepository = telematicRepository;
    }

    public ResponseEntity<VehicleResponse> getVehcileDetails(String vin, String model, 
    String make, String color) {
       TelematicEntity telematicEntity = telematicRepository
        .findFirstByVehicleEntityVinAndModelAndMakeAndColorOderByRequestEntityEventTimestampDesc(vin, model, make, color)
        .orElseThrow(() -> new IllegatArgumentException("Could not retrieve the vehicle"));
        LocationPoint locationPoint = new LocationPoint(telematicEntity.getRequestEntity().getEventTimestamp(),
        telematicEntity.getLatitude(), telematicEntity.getLongitude());
        VehicleResponse vehicleResponse = new VehicleResponse(telematicEntity.getVin(), telematicEntity.getModel(), 
        //the rest of the attributes,
        locationPoint
        );
        return new ResponseEntity<>(vehicleResponse);
    
    }

    
}
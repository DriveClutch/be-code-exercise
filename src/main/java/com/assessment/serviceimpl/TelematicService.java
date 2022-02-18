package com.assessment.codeexercise.serviceimpl;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;


@Service
public class TelematicService {
    private final TelematicRepository telematicRepository;

    @Autowired
    public TelematicService(TelematicRepository telematicRepository) {
        this.telematicRepository = telematicRepository;
    }

    public ResponseEntity<TelematicsResponse> getVehcileTelematics(String vin, Timestamp start, Timestamp end) {
       TelematicEntity telematicEntity = telematicRepository
        .findFirstByVehicleEntityVinAndModelAndMakeAndColorOderByRequestEntityEventTimestampDesc(vin, model, make, color)
        .orElseThrow(() -> new IllegatArgumentException("Could not retrieve the vehicle"));
        LocationPoint locationPoint = new LocationPoint(telematicEntity.getRequestEntity().getEventTimestamp(),
        telematicEntity.getLatitude(), telematicEntity.getLongitude());
        TelematicsResponse TelematicsResponse = new VehicleResponse(telematicEntity.getVin(), telematicEntity.getModel(), 
        //the rest of the attributes,
        locationPoint
        );
        return new ResponseEntity<>(vehicleResponse);
    
    }

    
}
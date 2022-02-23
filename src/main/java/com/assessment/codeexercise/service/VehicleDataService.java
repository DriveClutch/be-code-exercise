package com.assessment.codeexercise.service;

import com.assessment.codeexercise.dto.VehicleDataResponse;
import com.assessment.codeexercise.dto.VehicleTripDataResponse;
import org.springframework.stereotype.Service;

@Service
public class VehicleDataService {

    public VehicleDataResponse getVehicleAndTelematicsData(String make, String model, String color){
        VehicleDataResponse vehicleData = new VehicleDataResponse();
        vehicleData.setMake(make);
        vehicleData.setModel(model);
        vehicleData.setColor(color);
        return vehicleData;
    }

    public VehicleTripDataResponse getTripDataForVehicle(String vin){
        VehicleTripDataResponse tripData = new VehicleTripDataResponse();
        tripData.setVin(vin);
        return tripData;
    }

}

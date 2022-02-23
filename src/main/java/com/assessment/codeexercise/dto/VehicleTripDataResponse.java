package com.assessment.codeexercise.dto;

import java.util.List;

public class VehicleTripDataResponse {
    String vin;
    String make;
    String model;
    Integer topSpeed;
    Integer avgSpeed;
    List<Float> latPoints;
    List<Float> lonPoints;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Integer topSpeed) {
        this.topSpeed = topSpeed;
    }

    public Integer getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(Integer avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public List<Float> getLatPoints() {
        return latPoints;
    }

    public void setLatPoints(List<Float> latPoints) {
        this.latPoints = latPoints;
    }

    public List<Float> getLonPoints() {
        return lonPoints;
    }

    public void setLonPoints(List<Float> lonPoints) {
        this.lonPoints = lonPoints;
    }
}

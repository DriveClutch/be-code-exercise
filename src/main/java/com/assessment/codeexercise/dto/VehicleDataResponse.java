package com.assessment.codeexercise.dto;

public class VehicleDataResponse {
    String vin;
    String make;
    String model;
    String color;
    Integer lastRecordedLat;
    Integer lastRecordedLon;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getLastRecordedLat() {
        return lastRecordedLat;
    }

    public void setLastRecordedLat(Integer lastRecordedLat) {
        this.lastRecordedLat = lastRecordedLat;
    }

    public Integer getLastRecordedLon() {
        return lastRecordedLon;
    }

    public void setLastRecordedLon(Integer lastRecordedLon) {
        this.lastRecordedLon = lastRecordedLon;
    }

}

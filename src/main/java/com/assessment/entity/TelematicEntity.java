package com.assessment.codeexercise.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Table(name="Telematic")
public class TelematicEntity {

    @EmbeddedId private RequestEntity requestEntity;
    
    @ManyToOne
    @JoinColumn(name = "VIN")
    private VehicleEntity vehicleEntity;

    @Column(name = "SPEED")
    private int speed;

    @Column(name = "LATITUDE")
    private float latitude;

    @Column(name = "LONGITUDE")
    private float longitude;

    public VehicleEntity getVehcileEntity() {
        return vehicleEntity;
    }

    public void setVehicleEntity(VehicleEntity vin) {
        this.vehicleEntity = vehicleEntity;
    }

    public RequestEntity getRequestEntity() {
        return requestEntity;
    }

    public void setRequestEntity(RequestEntity requestEntity) {
        this.requestEntity = requestEntity;
    }

    public int getSpeed() {
        return eventTimestamp;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    

}
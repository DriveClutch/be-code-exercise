package com.assessment.codeexercise.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Table(name="Vehicle")
public class VehicleEntity {
    
    @Id
    @Column(name = "VIN", unique = true, nullable = false)
    private String vin;

    @Column(name = "Make")
    private String make;

    @Column(name = "MODEL")
    private String model;

    @Column(name = "COLOR")
    private String color;

    @Column(name = "CREATED_USERID")
    private String createdUserId;

    @Column(name = "CREATEF_TIMESTAMP")
    private Timestamp createdTimestamp;

    @Column(name = "YEAR")
    private int year;


    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

   //create getters and setters

}
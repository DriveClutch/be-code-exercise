package com.assessment.codeexercise.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Table(name="Telematic")
public class TelematicEntity {

    @Id
    @Column(name = "ID")
    private String Id;

    @Column(name = "EVENT_TIMESTAMP")
    private Timestamp eventTimestamp;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getEventTimestamp() {
        return eventTimestamp;
    }

    public void setEventTimestamp(Timestamp eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }


    

}
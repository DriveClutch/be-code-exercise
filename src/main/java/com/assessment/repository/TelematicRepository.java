package com.assessment.codeexercise.repository;

import java.sql.Timestamp;
import java.util.Optional;
import org.springframework.data.repository.CrudeRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelematicRepository extends CrudeRepository<TelematicEntity, RequestEntity> {
    List<TelematicEntity> findAllByVehicleEntityVinAndEventTimestampBetween(String vin, Timestamp start, Timestamp end);
    //select * from temelatic where vin = ? and event_timestamp between ? and ?
    Optional<TelematicEntity> findFirstByVehicleEntityVinAndModelAndMakeAndColorOderByRequestEntityEventTimestampDesc(String vin, String model, 
    String make, String color);
    //select * from telematic where vin = ? and model = ? and make = ? and color=? order by event_timestamp desc limit 1;
}
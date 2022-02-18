package com.assessment.codeexercise.repository;

import java.sql.Timestamp;
import java.util.Optional;
import org.springframework.data.repository.CrudeRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends CrudeRepository<VehicleEntity, String> {
    
}
package com.wati.graphql.repository;

import com.wati.graphql.entity.EmployeeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface EmployeeRespository extends MongoRepository<EmployeeEntity, String> {

    @Query(value ="{ _id : { $eq : ?0 }}" )
    Optional<EmployeeEntity> findEmployeeById(String employeeId );
}

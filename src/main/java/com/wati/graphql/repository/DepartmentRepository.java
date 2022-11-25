package com.wati.graphql.repository;

import com.wati.graphql.entity.DepartmentEntity;
import com.wati.graphql.entity.EmployeeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface DepartmentRepository  extends MongoRepository<DepartmentEntity, String> {

    @Query(value ="{_id : {{ $eq : ?0 }}" )
    Optional<DepartmentEntity> findDepartmentById(String  departmentId );

    @Query(value ="{departmentName : {{ $eq : ?0 }}" )
    Optional<DepartmentEntity> findDepartmentByName(String departmentName );
}

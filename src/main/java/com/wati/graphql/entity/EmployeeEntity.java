package com.wati.graphql.entity;


import com.wati.graphql.graph.schema.Address;
import com.wati.graphql.graph.schema.Department;
import com.wati.graphql.graph.schema.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "employee")
public class EmployeeEntity {

    @Id
    private String _id;

    private String fullName;

    private Gender gender;

    private List<AddressEntity> addressList;

    private Department department;
}
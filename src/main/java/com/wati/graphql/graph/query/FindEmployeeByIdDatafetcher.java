package com.wati.graphql.graph.query;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.wati.graphql.entity.EmployeeEntity;
import com.wati.graphql.graph.schema.Employee;
import com.wati.graphql.repository.DepartmentRepository;
import com.wati.graphql.repository.EmployeeRespository;
import graphql.schema.DataFetchingEnvironment;
import lombok.AllArgsConstructor;
import org.dozer.DozerBeanMapper;

@DgsComponent
@AllArgsConstructor
public class FindEmployeeByIdDatafetcher {

  private DepartmentRepository departmentRepository;
  private EmployeeRespository employeeRespository;

  @DgsData(
      parentType = "Query",
      field = "findEmployeeById"
  )
  public Employee getFindEmployeeById(DataFetchingEnvironment dataFetchingEnvironment) {
    String employeeId = dataFetchingEnvironment.getArgument("employeeId");
//   EmployeeEntity employeeEntity = employeeRespository.findEmployeeById(employeeId).orElse(new EmployeeEntity());

    EmployeeEntity employeeEntity = employeeRespository.findById(employeeId).get();
//            findEmployeeById(employeeId).orElse(new EmployeeEntity());
//    EmployeeEntity employeeEntity = employeeRespository.findAll().get(0);

    return new DozerBeanMapper().map(employeeEntity,Employee.class);
  }
}

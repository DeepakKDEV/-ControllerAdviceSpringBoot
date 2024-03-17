package com.example.demoSprinboot.Repo;

import com.example.demoSprinboot.Model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeService {


    Employee PostEmploy(Employee employee);

    List<Employee> getEmp();

    List<Employee> getByIdEmp(String id);

    String deleteEmployees(String id);
}

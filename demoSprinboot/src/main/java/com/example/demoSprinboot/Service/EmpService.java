package com.example.demoSprinboot.Service;

import com.example.demoSprinboot.Model.Employee;
import com.example.demoSprinboot.Repo.EmployeeService;
import com.example.demoSprinboot.error.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



@Service
public class EmpService implements EmployeeService {

    List<Employee> employees = new ArrayList<>();

    @Override
    public Employee PostEmploy(Employee employee) {
        if (employee.getId() == null) {
            // Generate a new ID if ID is null or email is empty
            employee.setId(UUID.randomUUID().toString());
        }
        // Add the employee to the list of employees
        employees.add(employee);
        // Return the added employee
        return employee;
    }

    @Override
    public List<Employee> getEmp() {
        return employees;
    }

    @Override
    public List<Employee> getByIdEmp(String id) {
        List<Employee> emp = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                emp.add(employee);
            }
        }
        if (!emp.isEmpty()) {
            return emp;
        }
        throw new RuntimeException("No employee found with ID: " + id);
    }

    @Override
    public String deleteEmployees(String id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                employees.remove(employee); // Change 'employee' to 'employees'
                return "Employee deleted successfully";
            }
        }
        throw new EmployeeNotFoundException("No employee found with ID: " + id);
    }
}



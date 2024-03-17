package com.example.demoSprinboot.Controller;


import com.example.demoSprinboot.Model.Employee;
import com.example.demoSprinboot.Repo.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {


    @Autowired
    EmployeeService   employeeService;

     @PostMapping("/EEmployee")
     public Employee  PostEmploy(@RequestBody  Employee  employee){
         return  employeeService. PostEmploy(employee);
     }

     @GetMapping("/get/emp")
      public List<Employee>   getEmp(){
         return  employeeService.getEmp();
     }

     @GetMapping("get/emp/id/{id}")
    public List<Employee>  getByIdEmp(@PathVariable   String  id){
         return  employeeService.getByIdEmp(id);
     }

     @DeleteMapping("delete/emp/id/{id}")

    public String  deleteEmployees(@PathVariable   String  id){
         return  employeeService. deleteEmployees(id);
     }






}

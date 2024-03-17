package com.example.demoSprinboot.error;

public class EmployeeNotFoundException  extends  RuntimeException{

        public EmployeeNotFoundException(String  message){
            super(message);
        }
}

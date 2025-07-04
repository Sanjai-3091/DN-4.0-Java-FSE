package com.cognizant.demoApplication.service;

import com.cognizant.demoApplication.model.Employee;
import com.cognizant.demoApplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    public void addemployee(Employee employee){
        employeeRepository.save(employee);
    }

}

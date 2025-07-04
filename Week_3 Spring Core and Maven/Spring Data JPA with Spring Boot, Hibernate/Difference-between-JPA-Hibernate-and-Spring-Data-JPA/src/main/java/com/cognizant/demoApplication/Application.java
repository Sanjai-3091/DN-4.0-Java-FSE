package com.cognizant.demoApplication;

import com.cognizant.demoApplication.model.Employee;
import com.cognizant.demoApplication.service.EmployeeService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application {
	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@PostConstruct
	public void runatStartup(){
		employeeService.addemployee(new Employee("Sanjai",5000.00));
		employeeService.addemployee(new Employee("Sakthi",70000.00));
		List<Employee> employees = employeeService.getAllEmployees();
		employees.forEach(System.out::println);
	}


}

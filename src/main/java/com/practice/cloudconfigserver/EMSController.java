package com.practice.cloudconfigserver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EMSController {
	
	@GetMapping("/employees")
	public List<String> getAllEmployees(){
		List<String> employees=new ArrayList<>();
		employees.add("Anurag");
		employees.add("Abhik");
		employees.add("Rajeev");
		employees.add("Rohit");
		employees.add("Vivek");
		employees.add("Naveen");
		employees.add("Neeraj");
		return employees;
	}

}

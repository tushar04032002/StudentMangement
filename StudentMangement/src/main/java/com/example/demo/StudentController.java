package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
 
	@PostMapping("/addStudent")
	String addStudent(@RequestBody Student s)
	{
	System.out.println();
	
	return "student added:"+s.getName();
	}
	 
	@GetMapping("/getstudent")
	
	Student getstudent() {
 
		Student s = new Student();
		
		s.setName("john");
		s.setGender("male");
		s.setEmail("john@123");
		s.setContactNo(445566);
		s.setAge(22);
		s.setAddress("pune");
		
		return s;
		
	}
	 
}

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.myservice;

@RestController
public class mycontroller {
	
	@Autowired
	myservice myser;
	
	@GetMapping("/getall")
	public List<Employee> getAlldetails() {
		
		return myser.getAllDetails();
	}
	
	@GetMapping("/getbyone/{id}")
	public Employee getDetailsbyone(@PathVariable int id) {
		return myser.getdetailsbyone(id);
	}
}

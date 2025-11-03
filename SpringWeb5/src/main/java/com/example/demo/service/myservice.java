package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class myservice {
	
	@Autowired
	EmployeeRepository emprepo;
	
	public List<Employee> getAllDetails() {
		return emprepo.findAll();
	}
	
	public Employee getdetailsbyone(int id) {
		return emprepo.findById(id).orElse(null);
	}
	
}

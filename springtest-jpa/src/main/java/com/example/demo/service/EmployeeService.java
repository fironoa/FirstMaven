package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository emprepo;
	
	
	public List<Employee> getAll(){
		List<Employee> empl=new ArrayList<>();
		Iterable<Employee> it=emprepo.findAll();
		for(Employee emp:it) {
			empl.add(emp);
			System.out.println(emp.getDescription()+" "+emp.getName()+" "+emp.getId());
		}
		return empl;
	}
	
	public void add(Employee emp) {
		 emprepo.save(emp);
	}
	
	public void delete(String id) {
		emprepo.deleteById(id);
	}
	public void update(Employee emp) {
		emprepo.save(emp);
	}
}

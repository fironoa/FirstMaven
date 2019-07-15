package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empserv;
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public List<Employee> sayHi() {
		
		return empserv.getAll();
	}
	
	@RequestMapping(value="/employee", method=RequestMethod.POST)
	public String add(@RequestBody Employee emp) {
		empserv.add(emp);
		return "Success";
	}
	@RequestMapping(value="/employee/{id}", method=RequestMethod.DELETE)
	public String delete(@PathVariable String id) {
		empserv.delete(id);
		return "Deleted";
	}
	@RequestMapping(value="/employee", method=RequestMethod.PUT)
	public String update(@RequestBody Employee emp) {
		empserv.update(emp);
		return "updated";
	}
}

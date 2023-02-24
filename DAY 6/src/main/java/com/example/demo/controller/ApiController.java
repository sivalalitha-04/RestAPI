package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Child;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
	@Autowired
	ApiService service;
	
	@PostMapping("/child")
	public boolean addChild(@RequestBody Child child) {
		return service.addChild(child);
	}
	
	@GetMapping("/child")
	public List<Child> getChild(){
		return service.getChild();
	}
	
	@GetMapping("/child/{field}")
	public List<Child> childWithSort(@PathVariable String field){
		return service.getChildSorted(field);
	}
	
	@GetMapping("/child/{offset}/{pagesize}")
	public List<Child> childWithPagination(@PathVariable int offset, @PathVariable int pagesize){
		return service.getChildWithPagination(offset,pagesize);
	}
	
	public List<Child> getWithSortedPagination(@PathVariable int offset,@PathVariable int pagesize, @PathVariable String field){
		return service.getChildWithPaginationAndSorting(offset,pagesize,field);
	}
}

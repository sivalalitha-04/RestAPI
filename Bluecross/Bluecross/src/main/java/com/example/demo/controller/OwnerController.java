package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Owner;
import com.example.demo.service.OwnerService;

@RestController
@CrossOrigin("*")
public class OwnerController {
	@Autowired
	OwnerService service;
	@CrossOrigin("*")
	@PostMapping("/owner/Create")
	public String addOwner(@RequestBody Owner owner) {
		return service.addOwner(owner);
	}
	
	@GetMapping("/owner")
	public List<Owner> read(){
		return service.getOwner();
	}
	
	@GetMapping("/owner/{id}")
	public Optional<Owner> readById(@PathVariable int id){
		return service.getOwnerById(id);
	}
	
//	@GetMapping("/owner/{field}")
//	public List<Owner> ownerWithSort(@PathVariable String field){
//		return service.getOwnerSorted(field);
//	}
	
	@GetMapping("/owner/{offset}/{pagesize}")
	public List<Owner> ownerWithPagination(@PathVariable int offset,@PathVariable int pagesize){
		return service.getOwnerWithPagination(offset,pagesize);
	}
	
	public List<Owner> getWithSortedPagnination(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field){
		return service.getOwnerWithPaginationAndSorting(offset, pagesize, field);
	}
	
	@PutMapping("/owner/{id}")
	public Owner update(@RequestBody Owner owner) {
		return service.updateOwner(owner);
	}
	
	@DeleteMapping("/owner/{id}")
	public String delete(@PathVariable int id) {
		return service.deleteOwnerById(id);
	}
}

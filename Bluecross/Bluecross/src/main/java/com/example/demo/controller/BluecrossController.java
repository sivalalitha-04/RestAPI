package com.example.demo.controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bluecross;
import com.example.demo.service.BluecrossService;

@RestController
public class BluecrossController {
	@Autowired
	BluecrossService service;
	
	@PostMapping("/bluecross")
	public String create(@RequestBody Bluecross bluecross) {
		return service.addAnimal(bluecross);
	}
	
	@GetMapping("/bluecross")
	public List<Bluecross> read(){
		return service.getAnimal();
	}
	
//	@GetMapping("/bluecross/{id}")
//	public Optional<Bluecross> readById(@PathVariable int id){
//		return service.getAnimalById(id);
//	}
	
	@GetMapping("/bluecross/{field}")
	public List<Bluecross> animalWithSort(@PathVariable String field){
		return service.getAnimalSorted(field);
	}
	
	@GetMapping("/bluecross/{offset}/{pagesize}")
	public List<Bluecross> animalWithPagination(@PathVariable int offset,@PathVariable int pagesize){
		return service.getAnimalWithPagination(offset,pagesize);
	}
	
	public List<Bluecross> getWithSortedPagnination(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field){
		return service.getAnimalWithPaginationAndSorting(offset, pagesize, field);
	}
	
	@PutMapping("/bluecross")
	public Bluecross update(@RequestBody Bluecross bluecross) {
		return service.updateAnimal(bluecross);
	}
	
	@DeleteMapping("/bluecross")
	public String delete(@RequestParam int id) {
		return service.deleteAnimalById(id);
	}
}

package com.example.demo.service;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bluecross;
import com.example.demo.repository.BluecrossRepo;

@Service
public class BluecrossService {
	@Autowired
	BluecrossRepo repository;
	
	public String addAnimal(Bluecross bluecross) {
		repository.save(bluecross);
		return "Rescued";
	}
	
	public List<Bluecross> getAnimal() {
		return repository.findAll();
	}
	
//	public Optional<Bluecross> getAnimalById(int id){
//		return repository.findById(id);
//	}
	
	public List<Bluecross> getAnimalSorted(String field){
		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	
	public List<Bluecross> getAnimalWithPagination(int offset,int pagesize){
		Page<Bluecross> page=repository.findAll(PageRequest.of(offset,pagesize));
		return page.getContent();
	}
	
	public List<Bluecross> getAnimalWithPaginationAndSorting(int offset,int pagesize,String field){
		Pageable paging=PageRequest.of(offset, pagesize,Sort.by(field));
		Page<Bluecross> page=repository.findAll(paging);
		return page.getContent();
	}
	
	public Bluecross updateAnimal(Bluecross bluecross) {
		repository.save(bluecross);
        return bluecross;
	}
	
	public String deleteAnimalById(int id) {
		repository.deleteById(id);
		return "Deleted";
	}
}

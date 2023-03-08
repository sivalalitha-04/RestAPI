package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Owner;
import com.example.demo.repository.OwnerRepo;

@Service
public class OwnerService {
	@Autowired
	OwnerRepo repository;
	
	public String addOwner(Owner owner) {
		repository.save(owner);
		return "Added";
	}
	
	public List<Owner> getOwner() {
		return repository.findAll();
	}
	
	public Optional<Owner> getOwnerById(int id){
		return repository.findById(id);
	}
	
//	public List<Owner> getOwnerSorted(String field){
//		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
//	}
	
	public List<Owner> getOwnerWithPagination(int offset,int pagesize){
		Page<Owner> page=repository.findAll(PageRequest.of(offset,pagesize));
		return page.getContent();
	}
	
	public List<Owner> getOwnerWithPaginationAndSorting(int offset,int pagesize,String field){
		Pageable paging=PageRequest.of(offset, pagesize,Sort.by(field));
		Page<Owner> page=repository.findAll(paging);
		return page.getContent();
	}
	
	public Owner updateOwner(Owner owner) {
		repository.save(owner);
        return owner;
	}
	
	public String deleteOwnerById(int id) {
		repository.deleteById(id);
		return "Deleted";
	}
}

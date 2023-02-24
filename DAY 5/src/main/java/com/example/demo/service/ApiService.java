package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepo;



@RestController
public class ApiService {
	@Autowired
	BookRepo repository;
	
	public boolean addBook(Book book) {
		repository.save(book);
		return true;
	}
	
	public List<Book> getBook(){
		return repository.findAll();
	}
	
	public Optional<Book> getBookById(int id){
		return repository.findById(id);
	}
	
	public Book updateBook(Book book) {
		repository.save(book);
        return book;
	}
	
	public String deleteBookById(int id) {
		repository.deleteById(id);
		return "Deleted";
	}
}

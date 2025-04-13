package com.manohar.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manohar.entity.Books;
import com.manohar.service.BookService;

@RestController
@RequestMapping("/Books")
public class BooksController {
	
	@Autowired
	private BookService service;
	
	@GetMapping("/getAll")
	public List<Books> getAll()
	{
		return service.getAll();
	}
	
	@GetMapping("/getBookByID/{id}")
	public Optional<Books> getBookByID(@PathVariable int id)
	{
		return service.getBookByID(id);
	}
	
	@PostMapping("/saveBook")
	public Books saveBook(@RequestBody Books Book)
	{
		return service.saveBook(Book);
	}
	
	@PostMapping("/saveBooks")
	public List<Books> saveBooks(@RequestBody List<Books> Books)
	{
		return service.saveBooks(Books);
	}
	
	@GetMapping("/getBooksByAuthor/{author}")
	public List<Books> getBooksByAuthor(@PathVariable String author)
	{
		return service.getBooksByAuthor(author);
	}
	
	@GetMapping("/findBooksByPrice/{price}")
	public List<Books> findBooksByPrice(@PathVariable double price)
	{
		return service.findBooksByPrice(price);
	}

	

}

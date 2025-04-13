package com.manohar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.manohar.dao.BooksDao;
import com.manohar.entity.Books;

@Service
public class BookService {
	
	private BooksDao repo;
	
	public BookService(BooksDao repo)
	{
		this.repo=repo;
	}
	
	
	public List<Books> getAll()
	{
		return repo.findAll();
	}
	
	public Optional<Books> getBookByID(int id)
	{
		return Optional.ofNullable(repo.findBookByid(id));
	}
	
	
	public Books saveBook(Books Book)
	{
		return repo.save(Book);
	}
	
	public List<Books> saveBooks(List<Books> Books)
	{
		return repo.saveAll(Books);
	}
	
	
	public List<Books> getBooksByAuthor(String author)
	{
		return repo.findBooksByAuthor(author);
	}
	
	public List<Books> findBooksByPrice(double price)
	{
		return repo.findBooksByPrice(price);
	}


}

package com.manohar.dao;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.manohar.entity.Books;

@Repository
public interface BooksDao extends JpaRepository<Books,Integer> {
	
	@Query("SELECT b FROM Books b WHERE b.id = :id")
	Books findBookByid(@Param("id") int id);

	
	@Query("SELECT b FROM Books b WHERE b.author = :author")
	List<Books> findBooksByAuthor(@Param("author") String author);
	
	@NativeQuery(value = "select * from Books b where b.price = :price")
	List<Books> findBooksByPrice(@Param("price") double price);

//Felipe Gutierrez
}

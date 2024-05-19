package com.library.LibraryManagementSystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library.LibraryManagementSystem.model.Book;

@Repository
public class Dao {
	
	@Autowired
    BookRepository repository;
	
	public String addBook(Book book) { 
		repository.save(book);
		return "book Added Succesfully";
	}
	
	public List<Book> searchBook(String bookName) {
		return repository.findByBookName(bookName);
	}
	
}

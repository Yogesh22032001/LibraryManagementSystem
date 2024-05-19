package com.library.LibraryManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.library.LibraryManagementSystem.dao.Dao;
import com.library.LibraryManagementSystem.model.Book;

@org.springframework.stereotype.Service
public class BookService {

	@Autowired 
	Dao dao;
	
	
	public String addBook(Book book) {
		return dao.addBook(book);
	}

	
	public List<Book> searchBook(String bookName) {	
		return dao.searchBook(bookName);
	}

}

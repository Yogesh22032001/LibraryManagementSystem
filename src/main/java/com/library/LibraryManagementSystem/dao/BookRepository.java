package com.library.LibraryManagementSystem.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.library.LibraryManagementSystem.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	public List<Book> findByBookName(String bookName);
}

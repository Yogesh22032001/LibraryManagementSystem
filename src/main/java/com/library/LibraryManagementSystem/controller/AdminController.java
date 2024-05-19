package com.library.LibraryManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.library.LibraryManagementSystem.model.Book;
import com.library.LibraryManagementSystem.service.BookService;


@Controller
public class AdminController {

	@Autowired
	BookService bookService;

	@GetMapping("/home-page")
	public String homePage() {
		return "home-page";
	}

	@RequestMapping("/add-book-page")
	public String bookPage() {
		return "add-book";
	}
	
	@RequestMapping("/add-book")
	public String addBook(@ModelAttribute Book book) {
		bookService.addBook(book);
		return "home-page";
	}

	@RequestMapping("/search-book")
	public String searchBook(@RequestParam String bookName, Model model) {
		model.addAllAttributes(bookService.searchBook(bookName));
		return "home-page";
	}

}

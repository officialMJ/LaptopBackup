package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
@RestController
@RequestMapping("/book")

public class BookController {

	@Autowired
	private BookService bookService;
	
	
	@GetMapping("/getbooks")
	public List<Book> getAllBooks() {
		System.out.println(" got  request  ");
		return bookService.getAllBooks();
	}
	
	 
	@GetMapping("/getbookbyid/{id}")
	public Book getBookById(@PathVariable Long id ) {
		System.out.println(" got  request for bookid "+id);
		return bookService.getBookById(id);
	}
	
	//---------------------------------------------------
	
	@PostMapping("/addbook")
	public Book createBook(@RequestBody Book book)
	{
		System.out.println(" got  request for Book Author "+book.getAuthor());
		return bookService.addBook(book);
	}
	
	//------------------------------------------------------------
	
	@GetMapping("/getbookbyname")
	public List<Book> getBookByName(@RequestParam String bookname ) {
		System.out.println(" got  request for book "+bookname);
		return bookService.getBookByTitle(bookname);
	}
	//------------------------------------------------------------
	
		@GetMapping("/getbookslike")
		public List<Book> getBookByNameLike(@RequestParam String bookname ) {
			System.out.println(" got  request for book "+bookname);
			return bookService.getBookByTitleLike(bookname);
		}
	
	
}

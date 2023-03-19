package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;

@Service

public class BookService {
	@Autowired
	private BookRepository bookRepository;
 public List<Book> getAllBooks ()
 {
	 return bookRepository.findAll();
 }

 
 public Book getBookById(Long id) {
	 return bookRepository.findByIdBook(id);
 }


public Book addBook(Book book) {
	
	Book b1 = bookRepository.save(book);
	return b1;
}


public List<Book> getBookByTitle(String bookname) {
	// TODO Auto-generated method stub
	return bookRepository.findByBookName(bookname);
}


public List<Book> getBookByTitleLike(String bookname) {
	// TODO Auto-generated method stub
	return bookRepository.findByBookNameContainingIgnoreCase(bookname);
}
 
 
}

package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	public Book findByIdBook(long id);

	public List<Book> findByBookName(String bookname);

	public List<Book> findByBookNameContainingIgnoreCase(String bookname);      
}

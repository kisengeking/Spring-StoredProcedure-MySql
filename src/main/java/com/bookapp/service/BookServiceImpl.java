package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.model.Book;
import com.bookapp.repository.IBookRepository;

import jakarta.transaction.Transactional;

@Service
public class BookServiceImpl implements IBookService {
	
	@Autowired
	private IBookRepository bookRepository;



	@Override
	public int getCountOfBooks(String author) {
		
		return this.bookRepository.get_count_of_books(author);
	}

	@Override
	public int getBookCount(String author) {
		
		return this.bookRepository.getBookCount(author);
	}

	@Override
	@Transactional
	public int getCountByAuthor(String author) {
		
		return this.bookRepository.getCountByAuthor(author);
	}

	@Override
	public List<Book> getBookListByAuth(String author) {
		
		return this.bookRepository.getBookListByAuth(author);
	}

}

package com.bookapp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringStoredProcedureApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringStoredProcedureApplication.class, args);
	}

	@Autowired	
	private IBookService bookService;
	@Override
	public void run(String... args) throws Exception {
		int total = bookService.getCountOfBooks("author1");
		System.out.println(total);
		total = bookService.getBookCount("author3");
		System.out.println(total);
		total = bookService.getCountByAuthor("author4"); //named Query
		System.out.println(total);
		List<Book> books = bookService.getBookListByAuth("author1");
		books.forEach(System.out::println);
		
		
		
	}

}

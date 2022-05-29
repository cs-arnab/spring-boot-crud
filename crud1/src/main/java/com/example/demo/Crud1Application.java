package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Books;
import com.example.demo.service.BooksService;

@SpringBootApplication
public class Crud1Application implements CommandLineRunner {
	@Autowired
	BooksService booksService;

	public static void main(String[] args) {
		SpringApplication.run(Crud1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("crud1 running	.	.	.");

		Books book1 = new Books();
		book1.setBookid(11);
		book1.setBookname("aaN");
		book1.setAuthor("aaAu");
		book1.setPrice(110);
		booksService.saveOrUpdate(book1);

		Books book2 = new Books();
		book2.setBookid(22);
		book2.setBookname("bbN");
		book2.setAuthor("bbAu");
		book2.setPrice(220);
		booksService.saveOrUpdate(book2);

		Books book3 = new Books();
		book3.setBookid(33);
		book3.setBookname("ccN");
		book3.setAuthor("ccAu");
		book3.setPrice(330);
		booksService.saveOrUpdate(book3);

		Books book4 = new Books();
		book4.setBookid(44);
		book4.setBookname("ddN");
		book4.setAuthor("ddAu");
		book4.setPrice(440);
		booksService.saveOrUpdate(book4);

	}

}

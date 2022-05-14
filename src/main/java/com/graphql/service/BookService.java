package com.graphql.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.graphql.model.Author;
import com.graphql.model.Book;

@Service
public class BookService {
	
	private static List<Book> books = Arrays.asList(
            new Book("book-1", "Harry Potter and the Philosopher's Stone",  "223", "author-1"),
            new Book("book-2", "Moby Dick", "635", "author-2")
    );

    private static List<Author> authors = Arrays.asList(
            new Author("author-1", "Joanne", "Rowling"),
            new Author("author-2", "Herman", "Melville")
    );

	public List<Book> getBooks() {
		return books;
	}

	public List<Author>  getAuthors() {
		return authors;
	}
    
    

}

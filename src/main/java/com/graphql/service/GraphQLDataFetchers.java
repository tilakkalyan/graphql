package com.graphql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.graphql.model.Book;

import graphql.schema.DataFetcher;

@Component
public class GraphQLDataFetchers {

	@Autowired
	BookService bookService;


	public DataFetcher getBookByIdDataFetcher() {
		return dataFetchingEnvironment -> {
			String bookId = dataFetchingEnvironment.getArgument("id");
			return bookService.getBooks()
					.stream()
					.filter(book -> bookId.equals(book.getId()))
					.findFirst()
					.orElse(null);
		};
	}

	public DataFetcher getAuthorDataFetcher() {
		return dataFetchingEnvironment -> {
			Book book = dataFetchingEnvironment.getSource();
			String authorId = book.getAuthorId();
			return bookService.getAuthors()
					.stream()
					.filter(author -> authorId.equals(author.getId()))
					.findFirst()
					.orElse(null);
		};
	}
}
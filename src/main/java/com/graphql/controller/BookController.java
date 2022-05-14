package com.graphql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import graphql.GraphQL;

@RestController
public class BookController {
	
	@Autowired
	GraphQL gService;

	@GetMapping("/gello")
  String hello() {
		return gService.execute("query {"
				+ "  bookById(id:\"book-1\") {"
				+ "    name"
				+ "    id"
				+ "    author {"
				+ "        firstName"
				+ "    }"
				+ "  }"
				+ "}").getData().toString();
    
  }
}
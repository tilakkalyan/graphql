package com.graphql.model;

public class Book {
	
	private String id;
	private String name;
	private String pageCount;
	private String authorId;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPageCount() {
		return pageCount;
	}

	public void setPageCount(String pageCount) {
		this.pageCount = pageCount;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public Book(String id, String name, String pageCount, String authorId) {
		super();
		this.id = id;
		this.name = name;
		this.pageCount = pageCount;
		this.authorId = authorId;
	}
	
	

}

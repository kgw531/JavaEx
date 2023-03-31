package com.library;

import java.util.ArrayList;
import java.util.List;

public class Library_bk {
	List<Book> bookList = new ArrayList<Book>();

	
	public Library_bk() {
		
	}

	public Library_bk(List<Book> bookList) {
		super();
		this.bookList = bookList;
	}
	
	// 책 추가
	public void addBook(String title, String author) {
		Book book = new Book(title,author);
		bookList.add(book);
	}
	
	@Override
	public String toString() {
		String res = "";
		for(Book b : bookList) {
			res = res + b.getTitle() + "/" + b.getAuthor() + "/" + b.isRent() + "\n";
			
		}
		return res;
		
	}
	
	
	
}

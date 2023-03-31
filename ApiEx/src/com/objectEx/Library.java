package com.objectEx;

public class Library {
	private Book[] bookArry = new Book[5];
	
	public void addBook() {
		bookArry[0]= new Book("혼공자", "신용권");
		bookArry[1] = new Book("자바의 정석","...");
		bookArry[2] = new Book("노인과 바다","---");
		bookArry[3] = new Book("데미안","---");
		bookArry[4] = new Book("수학의 정석","---");
	}
	
	@Override
	public String toString() {
		String str = "";
		for(Book b : bookArry) {
			str = str + b.getTitle() + "\n" + " " + b.getAuthor();
		}
		return str;
	}
	
}

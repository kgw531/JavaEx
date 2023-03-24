package com.kh.object;

import com.kh.object.practice.Book;

public class Application {

	public static void main(String[] args) {
		Book book = new Book();
		System.out.println(book.information1());
		Book book1 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		System.out.println(book1.information());
		System.out.println("========================================");
		
		System.out.println("수정된 결과 확인");
		book.setTitle("c언어");
		book.setPrice(30000);
		book.setDiscountRate(0.1);
		book.setAuthor("윤상섭");
		System.out.println(book.information());
		System.out.println("=========================================");
		
		
		
		System.out.println("도서명 = " + book.getTitle());
		System.out.println("할인된 가격 = " + book.discount());
		System.out.println("도서명 = " + book1.getTitle());
		System.out.println("할인된 가격 = " + book1.discount());
		
	}

}

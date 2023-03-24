package com.kh.object.practice;

public class Book {
	
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	// 생성자
	public Book() {
//		title = null;
//		price = 0;
//		discountRate = 0;
//		author = null; 적고 보니까 이미 초기값이네 ㅋㅋㅋㅋ
	}
	public Book(String title,int price,double discountRate,String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
		
		
	}
	
	// 메서드
	public String information1() {

		return getTitle() + "\t" + getPrice() + "\t" + getDiscountRate() + "\t" + getAuthor();
	} 
	public String information() {
		
		return getTitle() + " " + getPrice() + " " + getDiscountRate() + " " + getAuthor();
	} 
	
	public int discount() {
		return (int) (getPrice() - (getPrice() * getDiscountRate()));
	}
	
	//getter/setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}

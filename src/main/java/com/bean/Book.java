package com.bean;

public class Book {

	private int book_id;
	private String name;
	private String publisher;
	private double price;

	public Book() {

	}

	public Book(int book_id, String name, String publisher, double price) {
		super();
		this.book_id = book_id;
		this.name = name;
		this.publisher = publisher;
		this.price = price;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", name=" + name + ", publisher=" + publisher + ", price=" + price + "]";
	}

}

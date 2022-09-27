package com.sh.oop.book.model.vo;

import java.util.Objects;

public class Book {
	private String title;
	private String author;
	private int price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book(Book other) {
		this.title = other.title;
		this.author = other.author;
		this.price = other.price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [title = " + title + ", author = " + author + ", price = " + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(!(obj instanceof Book))
			return false;
		
		Book other = (Book)obj;
		if(!title.equals(other.title))
			return false;
		if(!author.equals(other.author))
			return false;
		if(price != other.price)
			return false;
		
		return true;
			
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.title,this.author,this.price);
	}
	
	@Override
	public Book clone() {
		return new Book(this);
	}
}

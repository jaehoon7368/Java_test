package com.sh.oop.book.controller;

import com.sh.oop.book.model.vo.Book;

public class TestBook {

	public static void main(String[] args) {
		Book b1 = new Book("자바","홍길동",50_000);
		Book b2 = new Book("자바","홍길동",50_000);
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		System.out.println(b1.equals(b2));
		
		Book b3 = b1.clone();
		System.out.println(b1.hashCode()==b3.hashCode());
		System.out.println(b1.equals(b3));

	}

}

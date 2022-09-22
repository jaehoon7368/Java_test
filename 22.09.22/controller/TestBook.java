package com.oop.book.controller;

import com.oop.book.medel.Book;

public class TestBook {

	public static void main(String[] args) {

		Book book = new Book();
		book.bookInfomation();
		
		Book book2 = new Book("뇌를 자극하는 JAVA", 20000, 0.2, "김윤영");
		book2.bookInfomation();
		
		book.setTitle("자바의 정석");
		book.setPrice(35000);
		book.setDiscountRate(0.1);
		book.setAuthor("윤상섭");
		System.out.println("수정된 결과 확인");
		book.bookInfomation();
		
		
		System.out.println("도서명 : " + book2.getTitle());
		System.out.println("할인된 가격 : " + (book2.getPrice() - (book2.getPrice()*book2.getDiscountRate()))+ "원");
		System.out.println("도서명 : " + book.getTitle());
		System.out.println("할인된 가격 : " + (book.getPrice() - (book.getPrice()*book.getDiscountRate()))+ "원");
		
	}

}

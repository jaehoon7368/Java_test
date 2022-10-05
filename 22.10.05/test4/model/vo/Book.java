package com.sh.io.test4.model.vo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * * Field
    - title:String        //도서명
    - author:String        //저자
    - price:int            //가격
    - dates:Calendar    //출판날짜

    * Constructor
    + 디폴트 생성자
    + 매개변수 있는 생성자

    * Method
    + Setters ans Getters 작성
    + toString():String        //Override
        : 날짜에 포맷 적용함 ("yyyy'년' MM'월' dd'일 출간')
 *
 */
public class Book implements Serializable{

	private static final long serialVersionUID = 1L;
	private String title;
	private String author;
	private int price;
	private LocalDate dates;
	
	public Book() {
		super();
	}

	

	public Book(String title, String author, int price, LocalDate dates) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
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



	public LocalDate getDates() {
		return dates;
	}



	public void setDates(LocalDate dates) {
		this.dates = dates;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", dates=" + dates.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 출간"))+ "]";
	}

	
	
	
	
}

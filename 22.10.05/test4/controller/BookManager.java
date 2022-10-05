package com.sh.io.test4.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Scanner;

import com.sh.io.test4.model.vo.Book;

public class BookManager {
	
	Scanner sc = new Scanner(System.in); ////초기화 객체 생성함

	public BookManager() { //default 생성자
		super();
	}
	
	public void fileSave() {
		
		 //Book 객체 배열 선언, 5개 초기화함 //샘플데이터 임의 작성
		Book[] book = {
				new Book("잘될 수밖에 없는 너에게","최서영",14000,LocalDate.of(2022, 8, 18)),
				new Book("하얼빈","김훈",14000,LocalDate.of(2022, 8, 3)),
				new Book("아버지의 해방일지","정지아",13000,LocalDate.of(2022, 9, 2)),
				new Book("트렌드 코리아 2023","김난도",17000,LocalDate.of(2022, 10, 5)),
				new Book("역행자","자청",15000,LocalDate.of(2022, 6, 3))
		};
		
		//"books.dat" 파일에 객체 기록 저장함
        //try with resource 문 사용할 것
        //"books.dat 에 저장 완료!" 출력
		File file = new File("book.dat");
		try(ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(file))){
			oss.writeObject(book);
			System.out.println("book.dat 에 저장 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
			
	}
	
	public void fileRead() {
		//"books.dat" 파일에서 데이터 읽어서 배열에 저장함
		File file = new File("book.dat");
		//try with resource 문 사용할 것
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){ //객체사용을 위한 ObjectInputStream
			//Book 객체 배열 선언
			Object obj = ois.readObject();
			Book[] book = (Book[]) obj;
			
			for(Book books : book) {
			System.out.println(books); //객체 정보를 화면에 출력함
			}
			System.out.println("book.dat 읽기 완료!"); //"books.dat 읽기 완료!" 출력
		} catch (ClassNotFoundException | IOException e) { //multi - catch절(부모자식 관계에선 안된다.)
			e.printStackTrace();
		}
	}
}

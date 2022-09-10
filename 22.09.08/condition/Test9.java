package com.sh.test.condition;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		Test9 t9 = new Test9();
		t9.test();

	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		String input = "********** 주메뉴 *******\n"
						+ "a. 불고기버거 ----5000원\n"
						+ "b. 새우버거 ----4000원\n"
						+ "c. 치킨버거 ----4500원\n"
						+ "d. 한우버거----10000원\n"
						+ "e. 디버거 ----7000원\n"
						+"***********************";
		String input2 = "********** 사이드메뉴 *********\n"
						+ "1. 콜라 ----1500원\n"
						+ "2. 사이다 ----1500원\n"
						+ "3. 밀크쉐이크 ----2500원\n"
						+ "4. 레드불----3000원\n"
						+"***********************";
						
		
		System.out.println(input);
		System.out.println(input2);
		System.out.print("주메뉴 선택 : ");
		String order = sc.next();
		
		
		int mainOrder = 0;
		int sideOrder = 0;
		
		switch(order) {
		case "a":
			order = "불고기버거";
			mainOrder += 5000; break;
		case "b":
			order = "새우버거";
			mainOrder += 4000; break;
		case "c":
			order = "치킨버거";
			mainOrder += 4500; break;
		case "d":
			order = "한우버거";
			mainOrder += 10000; break;
		case "e":
			order = "디버거";
			mainOrder += 7000; break;
		default : 
			System.out.println("번호를 잘못누르셨습니다.영업을 종료합니다."); return;
		}
		System.out.print("사이드 메뉴 선텍 : ");
		String side = sc.next(); 
		
		switch(side) {
		case "1":
			side = "콜라";
			sideOrder += 1500; break;
		case "2":
			side = "사이다";
			sideOrder += 1500; break;
		case "3":
			side = "밀크쉐이크";
			sideOrder += 2500; break;
		case "4":
			side = "레드불";
			sideOrder += 3000; break;
		default : 
			System.out.println("번호를 잘못누르셨습니다.영업을 종료합니다.."); return;
		}
		System.out.printf("%s,%s은 총 %d원입니다.",order,side,(mainOrder+sideOrder));
	}
}

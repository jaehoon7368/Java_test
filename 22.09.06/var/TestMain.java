package com.sh.var;

import java.util.Scanner;


public class TestMain {
	public static void main(String[] args) {
		TestMain tm = new TestMain();
		//tm.example1();
		//tm.example2();
		tm.example3();
	}
	
	
	public void example1() {
		int a = 23;
		int b = 7;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}
	
	public void example2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double a = sc.nextDouble();
		System.out.print("세로 : ");
		double b = sc.nextDouble();
		
		System.out.println("면적 : " + (a * b));
		System.out.println("둘레 : " + (a + b) * 2);
	}
	
	public void example3() {
		Scanner sc = new Scanner(System.in);
		
		

		System.out.print("문자열 입력 : ");
		String abc = sc.nextLine();
		
		
		
		System.out.println("첫번째 문자 : " + abc.charAt(0));
		System.out.println("두번째 문자 : " + abc.charAt(1));
		System.out.println("세번째 문자 : " + abc.charAt(2));
		
	}
	
	
}

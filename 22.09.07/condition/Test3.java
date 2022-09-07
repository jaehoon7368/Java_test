package com.sh.test.condition;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();

	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		int num1 = inputNumber(1);
		int num2 = inputNumber(2);
		System.out.print("연산자 > ");
		String i = sc.next();
		
	if(num1 < 0 || num2 <0) {
		System.out.println("잘못입력하셨습니다.");
	}
	else if(i.equals("+")) {
		System.out.printf("%d+%d=%d",num1,num2,num1+num2);
	}
	else if(i.equals("-")) {
		System.out.printf("%d-%d=%d",num1,num2,num1-num2);
	}
	else if(i.equals("*")) {
		System.out.printf("%d*%d=%d",num1,num2,num1*num2);
	}
	else if(i.equals("/")) {
		System.out.printf("%d/%d=%d",num1,num2,num1/num2);
	}
	else {
		System.out.println("잘못입력 하셨습니다.프로그램을 종료합니다.");
	}
	}
	
	public int inputNumber(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수%d> ", n);
		return sc.nextInt(); // return value
	}

}

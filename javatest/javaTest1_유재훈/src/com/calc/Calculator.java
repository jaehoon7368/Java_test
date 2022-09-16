package com.calc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("합 : "+(a+b));
		System.out.println("차 : "+(a-b));
		System.out.println("곱 : "+(a*b));
		System.out.println("나누기 : "+(a/b));
	}


}

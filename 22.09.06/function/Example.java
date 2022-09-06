package com.sh.function;

import java.util.Scanner;

public class Example {
	public void opSample3() {
		Scanner sc = new Scanner(System.in);
		
		String x = "양수";
		String y = "음수";
		
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.println(a > 0 ? x + "이다" : y + "이다");
		
	}
	
	public void opSample4() {
Scanner sc = new Scanner(System.in);
		
		String x = "짝수";
		String y = "홀수";
		
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.println(a %2 == 0 ? x + "다" : y + "다");
	}
}

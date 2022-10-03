package com.exception.number;

import java.util.Scanner;

public class Run {
	Scanner sc = new Scanner(System.in);
	NumberProcess np = new NumberProcess();

	public static void main(String[] args) {
		Run run = new Run();
		run.test();
	}

	private void test() {
		System.out.print("정수1 : ");
		int a = sc.nextInt();
		System.out.print("정수2 : ");
		int b = sc.nextInt();
		
		if(np.checkDouble(a, b) == true)
			System.out.println(b + "의 배수이다.");
		else
			System.out.println(b + "의 배수가 아니다.");
		
		
	}

}

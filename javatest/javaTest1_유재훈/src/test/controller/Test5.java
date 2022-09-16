package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 t5 = new Test5();
		t5.test();
	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 : ");
		int n1 = sc.nextInt();
		System.out.print("정수 2 : ");
		int n2 = sc.nextInt();
		int num = n1*n2;
		
		if((n1 > 0 && n1 < 10) && (n2 > 0 && n2 < 10)) {
			if(num < 10)
				System.out.println("한자리 수 입니다.");
			else
				System.out.println("두자리 수 입니다.");
		}
		else {
			System.out.println("한자리의 정수만 입력하세요.");
		}
	}
}

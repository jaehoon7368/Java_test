package test.controller;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test();
	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		if(num >=1 && num <= 100) {
			if(num % 2 == 0)
				System.out.println("2의 배수입니다.");
			
			else
				System.out.println("2의 배수가 아닙니다.");
		}
		else {
			System.out.println("다시 입력하세요.");
		}
	}
}

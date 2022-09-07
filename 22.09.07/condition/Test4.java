package com.sh.test.condition;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Test4 t4 = new Test4();
		t4.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 > ");
		int number = sc.nextInt();
		
		if(0 < number && number <= 10) {
			if(number % 2 == 0) {
				System.out.println("짝수다.");
			}
			else {
				System.out.println("홀수다.");
			}
		}
		else {
			System.out.println("1 ~ 10사이의 정수를 입력해야 합니다.");
		}
	}
}

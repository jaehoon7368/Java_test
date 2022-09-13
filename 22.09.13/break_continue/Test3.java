package com.sh.test.break_continue;

import java.util.Scanner;

import org.w3c.dom.bootstrap.DOMImplementationRegistry;

public class Test3 {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		do {
		System.out.print("정수를 입력하세요 : ");
		int i = sc.nextInt();
		if(i <= 2) {
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
		}
		
		int count = 0;
		
		for(int j = 2; j < i; j++) {
			if(i % j == 0) {
				count++;
			}	
		}
		
		if(count >= 1) {
			System.out.println("소수가 아니다.");
			break;
		}else {
			System.out.println("소수다.");
			break;
		}
		}while(true);
	}
}

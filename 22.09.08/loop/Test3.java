package com.sh.test.loop;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		if(num < 10) {
			for(int i = 0; i < 10; i++) {
				System.out.printf("%d X %d = %d\n",num,i,num*i);
			}
		}
		else {
			System.out.println("잘못입력하셨습니다. 프로그램종료합니다.");
		}
	}
}

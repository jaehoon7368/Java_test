package com.sh.test.loop;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.test();
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		String abc = "";
		
		for(int i = 0; i <= num;i++) {
				if(i%2 == 0) {
				System.out.print("박");
		
				}
				else {
				System.out.print("수");
				}
				
		}
		System.out.print(abc);
	}
}

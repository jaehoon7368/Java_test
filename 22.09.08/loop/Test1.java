package com.sh.test.loop;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test();

	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num;i++) {
			if(i % 2 == 0) {
				sum += i ;
			}
		}
		System.out.println("합계 : "+sum);
	}
}

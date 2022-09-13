package com.sh.test.break_continue;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
//		t1.test1();
		t1.test2();
	}

	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		int sum = 1;
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) continue;
			
			sum *= i;
		}
		System.out.println(sum);
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요. => ");
		int n1 = sc.nextInt();
		System.out.print("다른 정수를 하나 입력하세요. => ");
		int n2 = sc.nextInt();
		
	
		int sum = 0;
		
		if(n1 > n2) {
			for(int i = n2; i <= n1;i++) {
				if(i % 2 == 0) continue;
				sum += i;
			}
			System.out.printf("%d부터 %d까지의 홀수합은 %d입니다.",n2,n1,sum);
		}
		else {
			for(int j = n1;j <= n2;j++) {
				if(j % 2 == 0) continue;
				sum += j;
			}
			System.out.printf("%d부터 %d까지의 홀수합은 %d입니다.",n1,n2,sum);
		}
			
		}
	
}

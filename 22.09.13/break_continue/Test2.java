package com.sh.test.break_continue;

import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Test2 {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.test();
	}
	public void test() {
		Random rad = new Random();
		int num = rad.nextInt(100) + 1;
		int count = 0;
		int input;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("하나의 정수 입력 : ");
			input = sc.nextInt();
			count++;
		
			if(num > input) {
				System.out.println("입력하신 정수보다 큽니다.");
			}
			if(num < input) {
				System.out.println("입력하신 정수보다 작습니다.");
			}
		}while(input != num);
		
		System.out.printf("정답입니다.%d번째만에 정답을 맞추셨습니다.",count);
		
	}

}

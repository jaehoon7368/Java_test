package com.sh.test.array;

import java.awt.AWTKeyStroke;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}

	public void test() {
		int[] arr = new int[26];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력값 : ");
		String input = sc.nextLine();
		System.out.print("검색값 : ");
		char output = sc.next().charAt(0);
		int count = 0;
		
		for(int i = 0; i < input.length();i++) {
			if(output == input.charAt(i)) {
				count++;
			}
			
		}
		System.out.printf("입력하신 문자열 %s에서 찾으시는 문자 %s는 %d개입니다.",input,output,count);
	}
		
}

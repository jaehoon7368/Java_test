package com.sh.api.string;

import java.util.Scanner;

public class StringTest {
	
	public static void main(String[] args) {
		StringProcess sp = new StringProcess();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String s = sc.nextLine();
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		System.out.println(sp.preChar(s));
		System.out.println(sp.charSu(s, ch));
	}

}

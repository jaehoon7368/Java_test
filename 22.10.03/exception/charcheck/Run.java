package com.exception.charcheck;

import java.util.Scanner;

public class Run {

	Scanner sc = new Scanner(System.in);
	CharacterProcess cp = new CharacterProcess();
	
	public static void main(String[] args) {
		Run run = new Run();
		run.test1();
	}

	private void test1() {
		System.out.print("문자를 입력하세요. : ");
		String s = sc.nextLine();
		cp.countAlpha(s);
		
	}

}

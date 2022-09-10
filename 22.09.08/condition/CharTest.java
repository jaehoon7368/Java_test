package com.sh.test.condition;

import java.util.Scanner;


public class CharTest {

	public static void main(String[] args) {
		CharTest ct = new CharTest();
		ct.test();
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.next();
		
		int unicode = str.charAt(0);
		String abc = "(int)unicode";
		
		if(unicode > 96 && unicode < 123 
				|| unicode > 64 && unicode < 91) {
			abc = "알파벳";
		}
		else if(unicode > 47 && unicode < 58) {
			abc = "숫자";
		}
		else if(unicode > 32 && unicode < 48
				|| unicode > 57 && unicode < 65
				|| unicode > 90 && unicode <97
				|| unicode > 122 && unicode < 127) {
			abc = "특수문자";
		}
		System.out.printf("입력하신 문자 %s은/는 %s입니다.",str,abc);
	}
}

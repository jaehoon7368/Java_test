package com.sh.test;

public class Test2 {

	public static void main(String[] args) {
		String name = "홍길동";
		int age = 22;
		char gender = '남';
		String number = "01012341234";
		String email = "hgd@naver.com";
		String adress = "경기도 광주시";
		
		System.out.println("===========================================================================");
		System.out.printf("%s %10s %10s %10s %10s %15s\n","이름","나이","성별","전화번호","이메일","주소");
		System.out.println("===========================================================================");
		System.out.printf("%s %10s %10s %15s %15s %10s\n",name,age,gender,number,email,adress);
		
		name = "홍길순";
		age = 20;
		gender = '여';
		number = "010123412341";
		email = "hgs@gmail.com";
		adress = "전라남도 광주시";
		System.out.printf("%s %10s %10s %15s %15s %10s\n",name,age,gender,number,email,adress);
		
	}

}

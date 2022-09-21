package com.sh.oop.method.static_;

import java.util.Arrays;

/**
 * //static method
    //1. 전달한 문자열을 모두 대문자로 바꾸는 static 메소드
    //메소드명 : toUpper(String) : String
    
    
    //2. 문자열(1)에서 전달받은 인덱스(2)의 문자를 전달받은 문자(3)로 변경하는 static 메소드
    //메소드명 : setChar(String, int, char) : String
    

    //3. 전달한 문자열에서 영문자의 개수를 리턴하는 static 메소드
    //메소드명 : getAlphabetLength(String) : int
    
    
    //4. 전달한 문자열값을 하나로 합쳐서 리턴 
    //메소드명 : concat(String, String) : String
    
 *
 */
public class StaticMethod {
	public static String toUpper(String tar) {
		return tar.toUpperCase();
	}
	
	public static String setChar(String str,int num, char ch) {
		char[] arr = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		arr[num] = ch;
		
		String a = String.valueOf(arr);
		return a;

		
	}
	
	public static int getAlphabetLength(String alp) {
		int a = 0;
		
		for(int i = 0; i < alp.length();i++) {
			char ch = alp.charAt(i);
			if(( ch>='a' &&  ch<='z') || ( ch>='A' &&  ch<='Z'))
			a++;
		}
		return a;
	}
	
	public static String concat(String n1,String n2) {
//		String result = n1 + n2;
//		System.out.println(result);
		String result = n1.concat(n2);
		return result;
	}
}

package com.sh.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		TokenTest tt = new TokenTest();
		tt.test1();
	}

	private void test1() {
		String str = "J a v a P r o g r a m ";
		System.out.println("토큰 처리전 글자 : " + str);
		System.out.println("전 글자갯수 : " + str.length());
		
		StringTokenizer st = new StringTokenizer(str," ");
		System.out.println("토큰 처리 후 글자갯수 : " + st.countTokens());
		
		char[] ch = new char[st.countTokens()];
		int index = 0;
		
		while(st.hasMoreTokens()) {
			ch[index++] = st.nextToken().charAt(0);
		}
		System.out.println(ch);
		
		String str2 = new String(ch);
		System.out.println(str2.toUpperCase());
	}

}

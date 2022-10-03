package com.sh.api.string;


public class StringProcess {
	
	public String preChar(String s) {
		
		
		String str = s;
		String first = str.substring(0, 1);
		String end = str.substring(1,str.length());
		
		first = first.toUpperCase();
		str = first + end;

		return str;
	}
	
	public int charSu(String s, char ch) {
		
		int count = 0;
		
		for(int i = 0; i < s.length();i++) {
			if(s.charAt(i)==ch)
				count++;
		}
		return count;
	}

}

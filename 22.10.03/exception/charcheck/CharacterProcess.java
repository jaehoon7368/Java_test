package com.exception.charcheck;

public class CharacterProcess {

	
	
	public CharacterProcess() {
		super();
	}
	
	

	public int countAlpha(String s){
		int count = 0;
		
		try {
			for(int i = 0; i < s.length();i++) {
				if(s.charAt(i) == ' ')
					throw  new CharCheckException(s);
				else
					count++;
			} System.out.println("영문자 갯수 : " + count);
		}catch(CharCheckException e) {
			System.out.println("체크할 문자열 안에 공백 포함할 수 없습니다.");
		}
		
		
		return 0;
	}
}

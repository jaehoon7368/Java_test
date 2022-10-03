package com.exception.number;

public class NumberProcess {

	public NumberProcess() {
		super();
	}

	public boolean checkDouble(int a, int b){
		
		try {
			if((a < 1 || a > 100) || (b < 1 || b > 100)) {
				throw new NumberRangeException();
			}
			else {
				if( a % b == 0) {
					return true;
				}
				else {
					return false;
				}
			}
		}catch(NumberRangeException e) {
			System.out.println("1~100사이의 숫자만 입력가능합니다.");
		}
		
		
		return true;
	}
	
}

package ncs.test6;


public class Calculator {
	
	public double getSum(int data) {
		double sum = 0;
			
		try{
			if(data < 2 || data > 5)
				throw new InvalidException();
			else {
			for(int i = 0; i <= data ;i++) {
				sum += i;
				}
			}System.out.println("결과값 : " + sum);
		}catch(InvalidException e) {
			System.out.println("입력 값에 오류가 있습니다.");
		}
		
		return 0;
	}
}

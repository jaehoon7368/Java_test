package test.controller;

public class Test3 {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}

	public void test() {
		int i = 1;
		double sum = 0;
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+ sum/100);
	}
}

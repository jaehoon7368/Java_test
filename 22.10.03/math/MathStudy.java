package math;

public class MathStudy {

	public static void main(String[] args) {
		MathStudy study = new MathStudy();
//		study.test1();
		study.test2();
	}
	
	
	/**
	 *  1. 3456.5324     => 올림해서 소수점첫째자리까지 표현
		2. 577.26784     => 반올림해서 소수점둘째자리까지 표현
		3. 552.2987      => 올림해서 소수점셋째자리까지 표현
		4. -845.215      => 내림해서 소수점첫째자리까지 표현
		5. 324456.24497  => 올림해서 소수점둘째자리까지 표현
	 */
	public void test2() {
		System.out.println(Math.round(3456.5324*10)/10.0);
		System.out.println(Math.round(577.26784*100)/100.0);
		System.out.println(Math.ceil(552.2987 * 1000)/1000);
		System.out.println(Math.floor(-845.215 * 10)/10);
		System.out.println(Math.ceil(324456.24497 * 100)/100);
	}

	/**
	 * 올림 Math.ceil(double):double
	 * 버림 Math.floor(double) :double
	 * 반올림 Math.round(double):long
	 * 
	 */
	private void test1() {
		// 올림 7.8
		System.out.println(Math.ceil(7.8)); // 8.0
		
		//3.453 올림해서 소수점이하 둘째자리까지 표현 -> 3.46
		//3.452 -> 345.3 -> 346.0 -> 3.46
		double dnum = 3.453;
		System.out.println(Math.ceil(dnum * 100)/100); 
		
		//버림
		System.out.println(Math.floor(7.8)); //7.0
		//3.453 버림해서 소수점이하 둘째자리까지 표현 -> 3.45
		System.out.println(Math.floor(dnum * 100)/100); 
		
		//반올림 7.5 
		System.out.println(Math.round(7.5)); //8
		System.out.println(Math.round(7.4)); //7
		
		//94.527 반올림해서 소수점이후 둘째자리까지 표현 94.53
		// 94.527 -> 9452.7 -> 9453 -> 94.53
		System.out.println(Math.round(94.527*100)/100.0);
	}

	
}

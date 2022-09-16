package test.controller;

public class Test8 {

	public static void main(String[] args) {
		Test8 t8 = new Test8();
		
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		double sum = 0;
		int cnt = 0;
		
		for(int i=0; i < array.length;i++) {
			for(int j = 0; j < array[0].length;j++) {
				sum += array[i][j];
				cnt++;
			}
		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+sum/cnt);
	}

}

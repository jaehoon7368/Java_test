package Workshop4;
/**
 	2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성 하시오.
 */
public class Test01 {

	public static void main(String[] args) {
		Test01 test = new Test01();
		test.test();
	}

	private void test() {
		int sum = 0;
		
		int[][] arr2 = {
				{ 5, 5},
				{10,10,10,10,10},
				{20,20,20},
				{30,30,30,30}
				};
		for(int i = 0; i< arr2.length;i++) {
			for(int j = 0; j < arr2[i].length;j++) {
				sum += arr2[i][j];
			}
		}
		System.out.println("total = " + sum);
		double avg = sum / 14;
		System.out.println("average = " + avg);
	}
	
}

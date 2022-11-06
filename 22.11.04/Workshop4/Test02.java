package Workshop4;
/**
 	다음과 같이 선언되어 있는 배열에 1~10까지의 랜덤한 숫자(중복허용)를 넣고 이 배열에 어떤
	값이 셋팅 되었는지 출력 하고 배열 데이터의 합과 평균을 구하는 프로그램을 작성 하시오.
	int[] arr3 = new int[5]
 */
import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		Test02 test = new Test02();
		test.test();
	}

	private void test() {
		int[] arr3 = new int[5];
		int sum = 0;
		
		for(int i = 0; i < arr3.length;i++) {
			arr3[i] = (int)(Math.random()*10+1);
			sum += arr3[i];
		}
		System.out.println(Arrays.toString(arr3));
		System.out.println("sum = " + sum);
		System.out.println("avg = " + (double)(sum/arr3.length));
	}

}

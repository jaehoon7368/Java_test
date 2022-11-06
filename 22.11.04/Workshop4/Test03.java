package Workshop4;
/**
 	다음 배열의 내용을 실행 결과와 같이 출력 되도록 프로그램을 작성 하시오.
	int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
 */
import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		Test03 test = new Test03();
		test.test();
	}

	private void test() {
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		int[] arr2 = new int[arr.length];
		for(int i = 0; i < arr.length;i++) {
			arr2[arr.length - i -1] = arr[i];
		}
		System.out.println(Arrays.toString(arr2));
	}

}

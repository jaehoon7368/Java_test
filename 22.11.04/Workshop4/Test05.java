package Workshop4;
/**
    eclipse에서 argument로 1~5까지의 정수형 데이터 하나를 입력 받아 입력 받은 수부터 10까지 합을 구한다.
	단, 3의 배수와 5의 배수는 합에서 제외 한다
 */
public class Test05 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 0;
		
		if (num >= 1 && num <= 5) {
			for (int i = num; i < 10; i++) {
				if (i % 3 != 0 && i % 5 != 0) {
					sum += i;
					if (i < 8) {
						System.out.print(i + "+");
					} else {
						System.out.println(i);
					}
				} 
			} 
			
			System.out.println("결과 : " + sum);
		} 
		else {
			System.out.println("다시 입력하세요.");
		} 
	}
}

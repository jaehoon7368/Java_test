package Workshop4;
/**
 프로그램 실행 시 eclipse argument로 5~10까지의 정수형 데이터를 입력 받는다.
 입력 받은 정수 값을 Calc class의 calculate()함수를 이용하여 1부터 입력 받은 숫자까지
 짝수만 더하는 프로그램을 작성 한다.
 */
public class Test04 {

	public static void main(String[] args) {
		Calc cal = new Calc();
		int data = Integer.parseInt(args[0]);
		
		if (data >= 5 && data <= 10 && args.length == 1) {
			System.out.println("결과: " + cal.calculate(Integer.parseInt(args[0])));
		} else {
			System.out.println("(5~10)사이 숫자를 다시 입력해주세요");
		}
		
	} 

} 

class Calc {
	public int calculate(int data) {
		int num = data;
		int sum = 0;
		
		System.out.print("짝수: ");
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				sum += i;
				System.out.print(i + " ");
			} 
		} 
		
		System.out.println();
		return sum;
		
	} 
} 


package account;

public class AccountTest {

	public static void main(String[] args) {
		// 객체생성
		Account acc = new Account("441-0290-1203", 500000, 7.3);
		//기본정보 출력
		System.out.println("계좌정보 : " + acc.getAccount() + " 현재잔액 : " + acc.getBalance());
		// 20000원 입금
		acc.deposit(20000);
		// 변경 정보 출력
		System.out.println("계좌정보 : " + acc.getAccount() + " 현재잔액 : " + acc.getBalance());
		// 이자 출력 – 현재 잔고를 기준으로 고객에게 줄 이자 금액을 출력 한다
		System.out.println(acc.calculateInterset());
		
	}

}

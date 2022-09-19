package sh.java.oop.encapsulation;

/**
 * 접근제한자
 *  - priavte 해당클래스 밖에서 직접 접근 불가
 *  - default(package) 아무것도 작성하지 않은 경우, 같은 패키지에서 접근 가능
 *  - protected 같은 패키지에서 접근가능. 자식클래스인 경우, 다른패키지에서도 접근가능
 *  - public 어디에서든 접근 가능
 *  
 *  
 *  
 *  
 * getter
 *  - 필드를 제어하는 기본 메소드
 *  - 필드값을 제공하는 메소드
 *  - public 필드타입 get필드명(){ return 필드값;}
 * setter
 * - 필드를 제어하는 기본 메소드
 * - 필드값을 설정하는 메소드
 * - public void set필드명(필드타입 변수명) {this.필드 = 변수;}
 */
public class Account {

	private String name;
	private long balance;
	
	/**
	 * 지역변수와 필드명이 같다면, 지역변수 우선 접근한다.
	 * @param _name
	 */
	public void setName(String name) {
		// this는 현재객체를 가리키는 메소드내 숨은 참조변수
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setBalace(long balance) {
		this.balance = balance;
	}
	
	public long getBalance() {
		return this.balance;
	}
	
	public void status() {
		System.out.printf("[%s]님의 현재 잔액은 [%d]원입니다.\n",name,balance);
	}
	
	/**
	 * 입금메소드
	 *  - 0원 초과의 금액만 입금가능
	 * @param money
	 */
	public void deposit(long money) {
		if(money > 0) {
		this.balance += money;
		System.out.println("입금이 정상적으로 처리되었습니다.");
		}
		else {
			System.out.println("올바른 금액을 입금해주세요 : " + money);
		}
	}
	
	/**
	 * 출금메소드
	 * @param money
	 */
	public void withdraw(long money) {
		if(money <= 0) {
			System.out.println("올바른 금액을 출금해주세요 : " + money);
		}
		else if(money > balance) {
			//출금액이 잔액보다 많은 경우
			System.out.println("잔액이 부족합니다. : (현재잔액 " + balance + ")");
		}
		else {
			this.balance -= money;
			System.out.println("출금이 정상적으로 처리되었습니다.");
		}
		
	}
}

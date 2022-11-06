package account;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {}

	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	// 현재 잔액을 기준으로 이자를 계산 한다
	public double calculateInterset() {
		double cal = this.balance * this.interestRate / 100;
		return cal;
	}
	
	//입금을 통해 잔액정보를 증가 시킨다
	public void deposit(int money) {
		if(money > 0) {
			this.balance += money;
		}
		else {
			System.out.println("금액을 다시 넣어주세요.");
		}
	}
	
	//출금을 통해 잔액정보를 감소 시킨다
	public void withdraw(int money) {
		if(money > 0 && money < balance) {
			this.balance -= money;
		}
		else {
			System.out.println("금액이 부족합니다.");
		}
	}
	
	//Account class에 Account의 모든 정보를 출력 할 수 있는 accountInfo()를 만든다.
	public String accountInfo() {
		return "계좌번호 : " + getAccount() + " 잔액 : " + getBalance() + "원 이자율 : " + getInterestRate() + "%";
	}
	
}

package ex08class;
/*
시나리오] 은행계좌를 추상화 해보자.
멤버변수 : 예금주
	계좌번호
	잔고
멤버메서드 : 입금하다
	출금하다
	계좌잔고조회
조건1 : 입금은 무제한으로 가능함
조건2 : 잔고가 부족한 경우에는 출금불능 처리
*/
//은행계좌를 추상화하여 만든 클래스

class BackAccount {
	String name;
	String accountNum;
	int balance;
	
	void init(String name, String accountNum, int balance) {
		this.name = name;
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	void deposit(int money) {
		balance += money;
	}
	
	void withdraw(int money) {
		if(balance>money) {
			balance -= money;
		}
		else {
			System.out.println("잔액이 부족하여 출금할 수 없습니다.");
		}
	}
	
	void showAccount() {
		System.out.println("예금주 : "+name);
		System.out.println("계좌번호 : "+accountNum);
		System.out.println("잔액 : "+balance);
	}
	
}

public class E04AccountMainTr {

	public static void main(String[] args) {

		//첫번째 계좌 인스턴스 생성
		Account account = new Account();
		//초기화 메서드를 통해 객체를 초기화한다.
		account.init("장동건", "111-21-8888", 1000);
		//입금과 출금을 진행한 후 계좌정보를 확인한다.
		account.deposit(9000);
		account.withdraw(5000);
		account.showAccount();
		
		//두번재 계좌 인스턴스 생성
		Account account2 = new Account();
		//멤버변수에 직접 접근하여 인스턴스를 초기화한다.
		account2.name = "정우성";
		account2.accountNumber = "123-45-67890";
		account2.balance = 900000;
		account2.showAccount();
	}

}

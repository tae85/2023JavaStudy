package ex08class;

//은행계좌를 추상화하여 만든 클래스
class Account {
	//멤버변수
	String name;
	
	//계좌번호는 연산의 대상이 아니므로 String으로 선언한다.
//	String accountNumber;
	
	/*
	만약 계좌번호를 정수형태로 표현하고 싶다면 아래와 같이 long타입으로
	선언하면 된다. 이 경우 가독성을 위해 숫자 사이에 _(언더바)를 사용하는
	것이 허용된다.
	 */
	long accountNumber;
	/* 계좌번호나 전화번호 같은 데이터를 표현할 때는 위와 같이 String타입이나
	long타입을 통해 표현할 수 있다. */
	
	//잔고의 경우 입출금을 위한 연산이 필요하므로 int로 선언한다.
	int balance;
	
	//멤버메서드
	void deposit(int money) {
		balance += money;
		System.out.println(money + "원이 입금됨");
	}
	
	void withdraw(int money) {
		if(balance >= money) {
			balance -= money;
			System.out.println("계좌에서 " + money + "원이 출금 됨");
		} else {
			System.out.println("잔고부족으로 출금 불능");
		}
	}
	
	void showAccount() {
		System.out.println("계좌주:" + name);
		System.out.println("계좌번호:" + accountNumber);
		System.out.println("잔고:" + balance);
	}
	
	void init(String n, long a, int b) {
		name = n;
		accountNumber = a;
		balance = b;
	}
}



public class E04AccountMain {

	public static void main(String[] args) {

		Account account = new Account();
		account.init("장동건", 111_21_8888, 1000);
		account.deposit(9000);
		account.withdraw(5000);
		account.showAccount();
		
		Account account2 = new Account();
		account2.name = "정우성";
		account2.accountNumber = 123_45_67890;
		account2.balance = 900000;
		account2.showAccount();
	}

}

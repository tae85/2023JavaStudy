package ex08class;

class FruitSeller2 {
	int numOfApple;
	int myMoney;
	int apple_price;
	/* 사과의 단가를 표현하는 멤버변수가 상수로 선언되면 선언과 동시에 초기화해야 한다. 
	또한 초기값이 없는 상태로 선언 자체가 불가능하다. 따라서 기존의 상수를 일반 변수로
	변경해야 한다.*/
	
	/* 초기화 메서드를 선언하여 인스턴스 생성 후 다양한 형태의 초기화가 가능하다.*/
	public void initMembers(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		apple_price = price;
	}
	
	public int saleApple(int money) {
		int num = money / apple_price;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은사과개수:" + numOfApple);
		System.out.println("[판매자]판매수익:" + myMoney);
	}
}

class FruitBuyer2 {
	int myMoney;
	int numOfApple;
	
	//멤버변수의 초기화를 위한 멤버메서드를 생성한다.
	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	
	public void buyApple(FruitSeller2 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:" + myMoney);
		System.out.println("[구매자]사과개수:" + numOfApple);
	}
}

public class E06FruitSalesMain2 {

	public static void main(String[] args) {
		
		FruitSeller2 seller1 = new FruitSeller2();
		seller1.initMembers(0, 100, 1000);
		
		FruitSeller2 seller2 = new FruitSeller2();
		seller2.initMembers(0, 80, 500);
		
		FruitBuyer2 buyer = new FruitBuyer2();
		buyer.initMembers(10000, 0);
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
	}

}















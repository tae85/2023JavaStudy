package ex08class;

//과일 판매자를 추상화한 클래스
class FruitSeller {
	//멤버변수
	int numOfApple = 100;
	int myMoney = 0;
	final int APPLE_PRICE = 1000;
	/* 멤버상수는 인스턴스 생성과 상관없이 정의하는 시점에 반드시 초기화해야 한다. */
	
	//멤버메서드
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은사과개수:" + numOfApple);
		System.out.println("[판매자]판매수익:" + myMoney);
	}
}

class FruitBuyer {
	//멤버변수
	int myMoney = 5000;
	int numOfApple = 0;
	
	//멤버메서드
	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:" + myMoney);
		System.out.println("[구매자]사과개수:" + numOfApple);
	}
}

public class E06FruitSalesMain1 {

	
	public static void main(String[] args) {
		
		/* 판매자와 구매자의 인스턴스를 생성한다. 여기서는 우리가 직접 생성자를 만들지 
		않았으므로 자동으로 생성되는 디폴트 생성자를 통해 인스턴스를 생성하게 된다. */
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyApple(seller, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
		
	}

}



















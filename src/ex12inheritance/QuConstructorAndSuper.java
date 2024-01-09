package ex12inheritance;

class Car {
	int gasoline;
	
	public Car(int g) {
		this.gasoline = g;
	}
}

class HybridCar extends Car {
	int electric;
	
	public HybridCar(int g, int e) {
		super(g);
		this.electric = e;
	}
}

class HybridWaterCar extends HybridCar {
	int water;

	public HybridWaterCar(int g, int e, int w) {
		super(g, e);
//		super.gasoline = g;	// 변수가 private 일 때는 안 됨
//		super.electric = e;
		this.water = w;
	}

	public void showNowGauge() {
		System.out.println("남은가솔린:" + gasoline);
		System.out.println("남은전기량:" + electric);
		System.out.println("남은워터량:" + water);
	}
}

public class QuConstructorAndSuper {

	public static void main(String[] args) {
		HybridWaterCar hcar = new HybridWaterCar(10, 20, 30);
		hcar.showNowGauge();

	}

}

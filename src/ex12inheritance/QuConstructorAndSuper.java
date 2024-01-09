package ex12inheritance;

class Car
{
       	int gasoline;
}
class HybridCar extends Car
{
       	int electric;
}
class HybridWaterCar extends HybridCar
{
       	int water;
       	
       	public HybridWaterCar(int g, int e, int w) {
       		gasoline = g;
       		electric = e;
       		water = w;
       	}
 
       	public void showNowGauge()
       	{
                 	System.out.println("남은가솔린:"+gasoline);
                 	System.out.println("남은전기량:"+electric);
                 	System.out.println("남은워터량:"+water);
       	}
}

public class QuConstructorAndSuper {

	public static void main(String[] args) {
		HybridWaterCar hcar = new HybridWaterCar(10,20,30);
		hcar.showNowGauge();


	}

}

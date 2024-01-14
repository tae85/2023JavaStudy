package ex15usefulclass;

/*
Java의 규칙 : java.lang 패키지 하위의 모든 클래스는 자동으로 import된다. 또한 정의하는 모든 클래스는
	Object를 상속받게 되어있다. 따라서 java.lang 패키지의 모든 클래스는 별도의 선언없이 사용할 수 있고,
	Object에서 제공하는 메서드는 오버라이딩이 가능하다.
 */

//생략가능
import java.lang.*;

//extends도 생략가능
public class E03MathClass extends Object {

	/*
	Math클래스
	-java.lang 패키지에 정의된 클래스
	-수학과 관련된 일련의 작업들을 처리하는 메서드가 정의되어있다.
	-메서드는 static으로 선언되어 있어 인스턴스 생성없이 클래스명으로 호출할 수 있다.
	 */
	public static void main(String[] args) {
		
		// 제공되는 정적 상수
		System.out.println("원주율:" + Math.PI);
		
		float f = -3.14f;
		double d = -100.9;
		int num = -10;
		
		System.out.println("### 절대값 ###");
		System.out.println("Math.abs:" + Math.abs(f));
		System.out.println("Math.abs:" + Math.abs(d));
		System.out.println("Math.abs:" + Math.abs(num));
		
		System.out.println("### 올림 ###");
		System.out.println("Math.ceil:" + Math.ceil(3.4));
		System.out.println("Math.ceil:" + Math.ceil(-3.4));
		System.out.println("Math.ceil:" + Math.ceil(3.9));
		
		System.out.println("### 내림 ###");
		System.out.println("Math.floor:" + Math.floor(3.4));
		System.out.println("Math.floor:" + Math.floor(-3.4));
		System.out.println("Math.floor:" + Math.floor(3.9));
		
		/*
		round의 경우 가장 가까운 정수 쪽으로 올림/버림을 결정한다. x.5 이상이면 올림처리,
		미만이면 버림처리를 한다. 따라서 3.4xxxx라면 버림처리를 하게 된다.
		 */
		System.out.println("### 반올림 ###");
		System.out.println("Math.round:" + Math.round(3.49999));
		System.out.println("Math.round:" + Math.round(3.54444));
		System.out.println("Math.round:" + Math.round(-1.4));
		System.out.println("Math.round:" + Math.round(-1.5));
		System.out.println("Math.round:" + Math.round(-1.51));
		System.out.println("Math.round:" + Math.round(-3.51));
		
		System.out.println("### 최대/최소 ###");
		System.out.println("Math.max:" + Math.max(100, 99));
		System.out.println("Math.min:" + Math.min(100, 99));
		
		/*
		0~1사이의 실수를 랜덤하게 반환한다. 따라서 정수값을 만들 때는 특정 수를 곱한 후 정수로
		형변환하면 된다.
		 */
		System.out.println("### 난수 ###");
		System.out.println((int)(Math.random()*45)+1);
		
		System.out.println("### 거듭제곱 ###");
		System.out.println("2의 10승은? " + Math.pow(2, 10));
				
	}

}






















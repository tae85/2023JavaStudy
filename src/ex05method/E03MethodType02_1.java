package ex05method;

/*
메서드형태2] 매개변수는 없지만 반환값은 있는 경우
: 사용자로부터 입력값을 받은 후 연산을 진행하고, 결과값을 반환하는 형태의
기능이 필요할 때 사용한다. 즉 값을 자체적으로 생산한다.
 */
public class E03MethodType02_1 {

	/* 현재 상태에서는 메서드 정의시 public은 붙여도 되고, 붙이지 않아도 된다. */
	static int sum1To10() {
		int sum = 0 ;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		/*
		반환값이 있는 메서드는 주로 print()문의 일부로 사용하거나 변수의 할당을
		위해 코드의 우측항에 기술한다.
		 */
		System.out.println("1~10까지의 합:" + sum1To10());
		
		int sum10 = sum1To10();
		System.out.printf("1에서 10까지의 합은 %d입니다.", sum10);
		
	}

}

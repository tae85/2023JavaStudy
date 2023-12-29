package ex05method;

import java.util.Scanner;

/*
메서드형태3] 매개변수는 있으나 반환값은 없는 경우
: 값을 전달 받은 후 연산하고 해당 결과를 반환하지 않고 즉시 출력하는 경우에 사용한다.
즉 값을 소비하는 형태의 메서드이다.
 */
public class E04MethodType03_1 {

	public static void main(String[] args) {

		//입력값을 받기 위해 Scanner 인스턴스를 생성한다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("시작값:");
		int s = scanner.nextInt();
		System.out.println("종료값:");
		int e = scanner.nextInt();
		/* 반환값이 없는 메서드이므로 단독적으로 호출한다. 앞에서 입력받은 
		2개의 정수를 인수(Argument)로 전달한다. */
		myWantSum(s, e);
	}

	/*
	main 메서드에서 호출시 전달한 2개의 정수를 매개변수가 순서대로 값을 받게 된다. 
	매개변수는 해당 메서드에 즉시 사용할 수 있는 지역변수가 된다.
	 */
	static void myWantSum(int startNum, int endNum) {
		/* 1에서 10까지의 합을 구하는 수열프로그램을 시작값과 종료값만 변수로 변경하여 
		원하는 구간의 합을 구하는 프로그램으로 커스터마이징하여 재정의 하였다. */
		int sum = 0;
		for(int i = startNum; i <= endNum; i ++) {
			sum += i;
		}
		System.out.printf("%d ~ %d 까지의 합은 : %d", startNum, endNum, sum);
	}
}

package ex05method;

import java.util.Scanner;

/*
메서드형식4] 매개변수도 있고 반환값도 있는 형식으로 4가지 형식 중에 가장 많이 사용된다.
 */
public class E05MethodType04_1 {

	public static void main(String[] args) {
		/* 3명의 나이를 입력 받은 후 합을 반환받아 출력한다. 
		반환값이 있는 메서드는 주로 문장의 우측항이나 출력문의 일부로 작성하게 된다. */
		int sumOfAge = getTotalAge(3);
		System.out.println("입력받은 나이의 합은?" + sumOfAge);
	}

	static int getTotalAge(int personCnt) {
		Scanner scanner = new Scanner(System.in);
		int sumAge = 0;
		
		for(int i = 1; i <= personCnt; i++) {
			System.out.print(i + "번째 사람의 나이:");
			int age = scanner.nextInt();
			
			sumAge += age;
		}
		return sumAge;
	}
}

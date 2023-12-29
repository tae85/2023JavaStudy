package ex05method;

import java.util.Scanner;

public class E03MethodType02_2 {

	//반환타입이 String이므로 문자열의 결과를 반환한다.
	static String getHakjum() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수:");
		int kor = scanner.nextInt();
		System.out.print("영어점수:");
		int eng = scanner.nextInt();
		System.out.print("수학점수:");
		int math = scanner.nextInt();
		
		double avg = (kor+eng+math) / 3.0;
		String hakjum = "";
		int result = (int)avg / 10;
		switch(result) {
		case 10: case 9:
			hakjum = "A학점";break;
		case 8: 
			hakjum = "B학점";break;
		case 7: 
			hakjum = "C학점";break;
		case 6: 
			hakjum = "D학점";break;
		default: 
			hakjum = "F학점";break;
		}
		/* 결과값을 return하면 해당 메서드는 메모리에서 소멸 되고 호출한 지점으로
		값을 반환하게 된다.*/
		return hakjum;
	}
	public static void main(String[] args) {
		System.out.println("너의 학점은 " + getHakjum() + " 이얌~!");
		
		String h = getHakjum();
		System.out.printf("당신의 학점은 %s 입니다.", h);
	}

}















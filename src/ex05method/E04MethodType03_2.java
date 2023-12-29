package ex05method;

import java.io.IOException;
import java.util.Scanner;

public class E04MethodType03_2 {
	/*
		연습문제] 사용자로부터 2~9사이의 숫자중 2개를 입력받아 이에 해당하는 구구단을 
		출력하는 메서드를 작성하시오. 무조건 첫번째 입력받는 수가 작아야한다.
		입력예]
			첫번째숫자 : 3
			두번째숫자 : 12
			3*1=3 3*2=6........
			........
			...................12*9=108
		메서드명 : inputGugudan(int sNum, int eNum)
	 */

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫번째 숫자:");
			int s = scanner.nextInt();
			System.out.print("두번째 숫자:");
			int e = scanner.nextInt();
			if(s < e) {
				inputGugudan1(s, e);
				break;
			} else {
				System.out.println("첫번째 입력받는수가 작아야합니다.");
			}
		}
		
	}
	
	//while문
	static void inputGugudan1(int sNum, int eNum) {
		int dan = sNum;
		while(dan<=eNum) {
			int su = 1;
			while(su<=9) {
				if(su==9) {
					System.out.printf("%d*%d=%2d", dan, su, (dan*su));
				}
				else {
					System.out.printf("%d*%d=%2d,", dan, su, (dan*su));
				}
				System.out.print(" ");
				su++;
			}
			System.out.println();
			dan++;
		}
		System.out.println("\n=============================================\n");
	}

	//for문
	static void inputGugudan2(int sNum, int eNum) {
		for(int dan = sNum; dan <= eNum; dan++) {
			for(int su = 1; su < 10; su++) {
				System.out.printf("%2d*%2d=%3d ", dan, su, (dan*su));
			}
			System.out.println();
		}
		
	}
	
	
	

}

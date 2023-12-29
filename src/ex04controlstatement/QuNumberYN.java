package ex04controlstatement;

import java.io.IOException;

public class QuNumberYN {

	public static void main(String[] args) throws IOException {

//		System.out.print("하나의 문자를 입력하세요");
//		int index = System.in.read();
//		String result = index >= 48 && index <= 57 ? "숫자입니다" : "숫자가아닙니다";
//		System.out.println(result);
//		
//		int num = 120;
//		if(num > 0 && num%2 == 0) {
//				System.out.println("양수이면서 짝수");
//		}
		
		int num1=50, num2=100;
		int big, diff;

		if(num1>num2) {
			big = num1;
		} else {
			big = num2;
		}
		System.out.println(big);
		
		if(num1>num2) {
			diff = num1 - num2;
		} else {
			diff = num2 - num1;
		}
		System.out.println(diff); 
		
		int i = 0, sum = 0;
		while(i<=100) {
			if(i%3==0 || i%7==0) {
				sum += i;
				System.out.println(sum);
			}
			i++;
		}
		
		int x, y;
		x = 1;
		while(x<=5) {
			y = 1;
			while(y<=5){
				if(y<=x) {
					System.out.print("*");
				}
				y++;
			}
			System.out.println();
			x++;
		}
		
		x = 1;
		do {
			y = 1;
			do {
				if(x+y<7) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				y++;
			} while (y<=5);
			x++;
			System.out.println();
		} while (x<=5);
		
		for( x = 1; x <= 5; x++) {
			for( y = 1; y < 10; y++) {
				if(y+x<7) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		
//		
//		for( x = 1; x <= 5; x++) {
//			for( y = 1; y <= 5; y++) {
//				if(y>=x) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
	}

}

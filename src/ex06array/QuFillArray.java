package ex06array;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] intArr1 = new int[10];
		int[] intArr2 = new int[10];
		int idxStart = 0;
		int idxEnd = intArr2.length - 1;
		
		for(int i = 0; i < intArr1.length; i++) {
			System.out.print(i+1+"번째 정수를 입력하세요:");
			intArr1[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < intArr1.length; i++) {
			if(intArr1[i]%2 == 0) {
				intArr2[idxEnd--] = intArr1[i];
//				idxEnd--; //위 배열에서 한번에 처리
			} else {
				intArr2[idxStart++] = intArr1[i];
//				idxStart++; //위 배열에서 한번에 처리
			}
		}
		
		System.out.println("순서대로입력된결과");
		for(int i = 0; i < intArr1.length; i++) {
			System.out.print(intArr1[i] + " ");
		}
		System.out.println();
		
		System.out.println("홀수/짝수 구분입력결과");
		for(int i = 0; i < intArr1.length; i++) {
			System.out.print(intArr2[i] + " ");
		}
		System.out.println();

	}

}

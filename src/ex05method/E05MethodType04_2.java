package ex05method;

import java.util.Scanner;

public class E05MethodType04_2 {

	public static void main(String[] args) {
		
		int maxValue1 = returnMaxNumber(4);
		System.out.println("최대값1:" + maxValue1);
		
		int maxValue2 = returnMaxNumber(6);
		System.out.println("최대값2:" + maxValue2);
	}
	
	/*
	main에서 전달한 인수의 크기만큼 반복해서 정수를 입력받는다.
	그 중에 최대값을 찾아 반환한다.
	 */
	static int returnMaxNumber(int numberCnt) {
		Scanner scanner = new Scanner(System.in);
		//최대값을 저장할 변수 
		int maxVal = 0;
		for(int i = 1; i <= numberCnt; i++) {
			System.out.print("정수를 입력하세요:");
			int inputNum = scanner.nextInt();
			
			if( i == 1) {
				/* 입력받은 정수 중에서 최대값을 찾아야 하므로, 첫번째 입력값을
				비교를 위한 기준값으로 설정한다. 즉 비교의 대상이 없으므로 무조건
				최대값이 된다. */
				maxVal = inputNum;
			} else {
				/* 두번째 입력값부터는 기존의 최대값과 비교해서 더 큰 값이
				발견되면 교체한다. */
				if(maxVal<inputNum) {
					maxVal = inputNum;
				}
			}
		}
		return maxVal;
	}
}

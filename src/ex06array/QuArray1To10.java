package ex06array;

public class QuArray1To10 {

	public static void main(String[] args) {
		int[] iArr = new int[10];
		int sum = 0;
		
		for(int i = 0; i < iArr.length - 1; i++) {
			iArr[i] = i + 1;
			System.out.println("iArr["+i+"]=" + iArr[i]);
			sum += iArr[i];
		}
		System.out.println("sum="+sum);

	}

}

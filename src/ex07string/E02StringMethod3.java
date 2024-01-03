package ex07string;

public class E02StringMethod3 {

	public static void main(String[] args) {

		System.out.println("String 클래스의 주요 메소드3");

		String str1 = "Welcome to java";
		String str2 = "자바야 놀자!";

		/*
		11] lastIndexOf()
		 */
		System.out.println("### 11 ###");
		System.out.println(str1.lastIndexOf("ava"));
		System.out.println(str1.lastIndexOf("J")); 
		System.out.println("indexOf:"+ str1.indexOf("a")); 
		System.out.println("lastIndexOf:"+ str1.lastIndexOf("a")); 
		
		/*
		12] replace
		 */
		System.out.println("### 12 ###"); 
		System.out.println("J를 G로 변경하기");
		//찾는 문자열이 없을 때 변경만 되지 않을 뿐 에러가 발생하진 않는다.
		System.out.println(str1.replace("J", "G")); 
		System.out.println("java를 Korea로 변경하기");
		System.out.println(str1.replace("java", "Korea"));

		/*
		13] split() : 문자열을 구분자를 통해 분리해서 String타입의 배열로
			반환한다. 해당 구분자가 없는 경우에는 크기가 1인 배열로 반환한다.
		 */
		System.out.println("### 13 ###");
		String phoneNumber = "010-1234-5678"; 
		String[] phoneArr = phoneNumber.split("-");
		for(int i=0 ; i<phoneArr.length ; i++) {
			System.out.printf("phoneArr[%d]=%s\n",
					i, phoneArr[i]);
		}
	 
		phoneArr = phoneNumber.split("%");
		for(int i=0 ; i<phoneArr.length ; i++) {
			System.out.printf("phoneArr[%d]=%s\n",
					i, phoneArr[i]);
		}
		
		/*
		14] substring() 
		 */
		System.out.println("### 14 ###");
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3,7));

	}

}

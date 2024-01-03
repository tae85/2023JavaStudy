package ex07string;

public class E02StringMethod4 {

	public static void main(String[] args) {
		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		System.out.println("### 시나리오1 ###");
		String juminNum1 = "190419-3000000";
		String juminNum2 = "190419-4000000";
		
		/* char로 추출했기 때문에 '(싱글쿼테이션)으로 비교해야한다. */
		char gender = juminNum1.charAt(7);
		if(gender == '1' || gender == '3')
			System.out.println("남자");
		else if (gender == '2' || gender == '4')
			System.out.println("여자");
		else if (gender == '5' || gender == '6')
			System.out.println("외국인입니다.");
		else
			System.out.println("주민번호가 잘 못 되었습니다.");
		
		
		
		/*
		시나리오2] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		System.out.println("### 시나리오2 ###");
		String email1 = "hong@daum.net";
		String email2 = "not@naver";
		
		/* 이메일은 아이디와 도메인을@(엣)으로 구분한다. 또한 도메인에는
		하나 이상의 .(닷)이 포함된다. */
		if(email1.contains("@") && email1.contains(".")) {
			System.out.println("이메일 형식임");
		} else {
			System.out.println("이메일 형식이 아님");
		}
		
		
		
		/*
		시나리오3]주민등록번호로 성별을 구분하는 프로그램을 indexOf()와
		charAt()을 이용해서 작성하시오.
		*/	
		System.out.println("### 시나리오3 ###");
		int genderIndex = juminNum1.indexOf("-") + 1;
		gender = juminNum1.charAt(genderIndex);
		if(gender == '1' || gender == '3')
			System.out.println("남자");
		else if (gender == '2' || gender == '4')
			System.out.println("여자");
		else if (gender == '5' || gender == '6')
			System.out.println("외국인입니다.");
		else
			System.out.println("주민번호가 잘 못 되었습니다.");
		
		
		
		/*
		시나리오4] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		System.out.println("### 시나리오4 ###");
		String fileName = "my.file.images.jpg";

		System.out.println("방법1 - lastIndexOf() 사용");
		int extIndex = fileName.lastIndexOf(".") + 1;
		String ext1 = fileName.substring(extIndex);
		System.out.println("확장자명1: " + ext1);
		
		System.out.println("방법2 - split() 사용");
		/* Java에서 split() 메서드 사용시 구분자로 .(닷)을 사용하는 경우에는
		[] 또는 \\를 사용해야 한다. */
//		String[] fileNameArr = fileName.split("\\.");
		String[] fileNameArr = fileName.split("[.]");
		String ext2 = fileNameArr[fileNameArr.length - 1];
		System.out.println("확장자명2: " + ext2);
		
	}

}









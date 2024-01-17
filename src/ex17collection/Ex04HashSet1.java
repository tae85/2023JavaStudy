package ex17collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import common.Teacher;

/*
HashSet<E> : set 계열의 컬렉션
-set계열의 인터페이스를 구현한 컬렉션
-인스턴스가 순서없이 저장된다.
-중복저장을 기본적으로 허용하지 않는다.
-기본클래스(String, Integer등)인 경우 별도의 오버라이딩 없이도 중복이 제거된다.
-하지만 개발자가 정의한 클래스라면 hashCode(), equals()를 적절히 오버라이딩해야만 중복을 제거할 수 있다.
-List가 배열의 특성을 가진다면, Set은 집합의 특성을 가진다.
 */
public class Ex04HashSet1 {

	public static void main(String[] args) {
		/* Object를 기반으로 set컬렉션을 생성했으므로 모든 인스턴스를 저장할 수 있다. */
		HashSet<Object> set = new HashSet<Object>();
		
		/* 3가지의 기본클래스와 우리가 정의한 Teacher클래스의 인스턴스를 생성한다. */
		String varString1 = "JAVA";
		String varString2 = new String("개발자");
		Date varDate = new Date();
		int varInt = 100; // 차후 저장시 Integer로 Boxing처리 됨
		Teacher varTeacher = new Teacher("김봉두", 55, "체육");
		
		/*
		객체저장 : add()를 통해 저장한다. 만약 저장에 성공하면 true, 실패하면 false를 반환한다.
		 */
		System.out.println("add결과:" + set.add(varString1));
		set.add(varString2);
		set.add(varDate);
		set.add(varInt); // 인스턴스 추가시 Integer로 Boxing처리됨
		set.add(varTeacher);
		
		// size()를 통해 저장된 인스턴스 개수를 반환한다. 5개 출력됨.
		System.out.println("[중복 저장 전 객체수]:" + set.size());
		
		/*
		기본클래스의 중복저장 : 기본 클래스를 통해 생성한 인스턴스인 경우 별도의 오버라이딩 없이도 중복을
			제거할 수 있다. 따라서 아래 추가하는 부분에서는 false가 반환된다.
		 */
		System.out.println(set.add(varString2) ? "저장성공" : "저장실패");
		// 저장에 실패했으므로 5개가 출력된다.
		System.out.println("[중복 저장 후 객체수]:" + set.size());
		
		/*
		이터레이터를 통한 출력 : 순서없이 저장되므로 출력의 순서도 정할 수 없다.
		 */
		//1.set참조변수를 통해 Iterator 인스턴스를 생성
		Iterator itr = set.iterator();
		//2.추출할 데이터가 있는지 확인
		while(itr.hasNext()) {
			//3.있다면 next()로 추출
			Object object = itr.next();
			/*
			Object형으로 자동형변환되어 저장되므로 우리가 직접 정의한 클래스에 대해서만 instanceof를
			통해 타입을 확인한 후 다운캐스팅해준다.
			 */
			if(object instanceof Teacher) {
				/* 다운캐스팅 하지 않으면 자식영역에 접근할 수 없으므로 아래와 같이 getter를 
				호출할 수 없게 된다. */
				System.out.println("Teacher 객체 => " + ((Teacher)object).getName());
			}
			else {
				System.out.println("저장된 객체:" + object);
			}
		}
		
		/*
		포함여부확인 : set컬렉션 내에 해당 인스턴스가 저장되어 있는지 여부만 확인한다.
		 */
		System.out.println(set.contains(varString1) ? 
				"varString1이 있음" : "varString1 없음");
		
		/*
		인스턴스삭제 : 참조값을 통해 삭제한다.
		 */
		System.out.println(set.remove(varString2) ? 
				"varString2 삭제 성공" : "varString2 삭제 실패");
		
		/*
		전체삭제 : List컬렉션과 동일하다.
		 */
		set.clear();
		System.out.println("전체삭제:" + set.removeAll(set));
		System.out.println("[전체 삭제 후 객체 수]:" + set.size());

	}

}


























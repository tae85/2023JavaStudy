package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

/*
ArrayList<E> : List계열의 컬렉션
-데이터의 중복 저장이 허용된다.
-데이터의 저장 순서를 보장한다.
-Array라는 이름처럼 "배열"의 특성을 가지고 있어 index를 통한 저장 및 접근이 가능하다.
 */
public class Ex03ArrayList1 {

	public static void main(String[] args) {
		/*
		String 인스턴스를 저장할 수 있는 List컬렉션 생성한다. ArrayList와 나머지 컬렉션들은 데이터를
		저장하는 내부적인 자료구조만 다를뿐 사용법은 100% 동일하다.
		 */
		ArrayList<String> list = new ArrayList<String>();
//		LinkedList<String> list = new LinkedList<String>();
//		Vector<String> list = new Vector<String>();
		
		/*
		객체저장 : add()
			add(인스턴스) : 순차적으로 저장하면서 인덱스는 0부터 자동으로 부여한다.
			add(인덱스, 인스턴스) : 데이터 저장시 인덱스를 직접 부여한다. 단 인덱스를 건너뛰면 에러가
				발생하므로 주의해야 한다. 만약 중복된 인덱스가 있다면 삽입(끼워넣기)이 된다.
		 */
		list.add("소녀시대");
		list.add("빅뱅");
		list.add("트와이스");
		list.add(3, "워너원");
//		list.add(5, "소방차");
		
		/*
		저장된 객체수(리스트의 크기) : size()
			컬렉션에 저장된 인스턴스의 개수를 반환한다. 배열에서 사용하는 length와 동일한 값을 반환한다.
		 */
		list.add(list.size(), "오마이걸");
		list.add(list.size(), "방탄소년단");
		System.out.println("중복 저장전 객체수:" + list.size());
		
		/*
		중복저장 : List는 배열의 특성을 가지므로 데이터를 중복저장 할 수 있다. 동일한 데이터라도 index로
			구분할 수 있기 때문이다. add()는 추가에 성공할 경우 true를 반환한다.
		 */
		System.out.println(list.add("트와이스") ? "중복 저장 됨":"중복 저장 안 됨");
		System.out.println("중복 저장 후 객체수:" + list.size());

		/*
		컬렉션 출력시에는 아래 3가지 방법 중 하나를 사용하면 된다.
		방법1 : 일반 for문 사용. 이때는 인덱스를 통해 접근해야 하므로 get() 메서드를 사용한다.
		 */
		System.out.println("\n[일반for문 사용]");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		/*
		방법2 : 확장 for문의 경우 인덱스없이 전체 원소를 반복해주므로 좀 더 간단한 표현이 가능하다.
			따라서 가장 많이 사용된다.
		 */
		System.out.println("\n[확장for문 사용]");
		for(String obj : list) {
			System.out.print(obj + " ");
		}
		
		/*
		방법3 : iterator 사용
			1.컬렉션에 저장된 내용을 Iterator 객체에게 알려주기 위해 인스턴스를 생성한다.
			2.hasNext()로 출력할 인스턴스가 있는지 검사한다. 만약 인스턴스가 없다면 false를 반환한다.
			3.next()를 통해 인스턴스를 반환한다.
		 */
		System.out.println("\n[반복자(Iterator 사용]");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println("\n=================================\n");
		
		/*
		수정하기(덮어쓰기)
		: 기존의 내용을 변경한다. 즉 기존의 내용은 삭제한 후 새로운 내용으로 갱신한다.
		 */
		list.set(4, "오마이걸>덮어쓰기");
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println("\n=================================\n");
		
		/*
		삽입하기(끼워넣기) : add(삽입할인덱스, 인스턴스)
			해당 인덱스에 인스턴스를 삽입한다. 기존 인스턴스는 뒤로 1칸씩 밀려난다.
			즉, 자동으로 인덱싱된다.
		 */
		list.add(4, "블랙핑크>삽입하기");
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println("\n=================================\n");
		
		/*
		포함여부확인
			contains(인스턴스) : 특정 인스턴스가 저장되어 있는지 확인할 때 사용한다. 존재한다면
			true를 반환한다.
		 */
		System.out.println(list.contains("빅뱅") ? "빅뱅 있음" : "빅뱅 없음");
		System.out.println(list.contains("블랙핑크") ? "블랙핑크 있음" : "블랙핑크 없음");
		
		/*
		삭제하기
		방법1 : 인덱스로 삭제
			remove(인덱스) : 인덱스를 통해 삭제를 진행한 후 삭제가 완료되면 해당 인스턴스를 반환한다.
				삭제 후에는 인덱스가 자동으로 부여된다. 삭제 성공시 삭제된 인스턴스를 반환하므로 삭제 후
				즉시 확인할 수 있다.
		 */
		Object obj = list.remove(2);
		
		// 2번 인덱스를 삭제했으므로 트와이스를 반환한다.
		System.out.println("삭제된 객체:" + obj);
		
		/*
		위치를 모르는 경우에는 indexOf()를 통해 해당 인스턴스의 인덱스를 찾은 후 삭제한다.
		 */
		int index = list.indexOf("빅뱅");
		System.out.println("빅뱅의 index=" + index);
		list.remove(index);
		
		/*
		방법2 : 인스턴스의 참조값을 통해 삭제한다. 이 경우에는 삭제에 성공하면 true가 반환된다. 즉
			boolean 타입의 반환값을 가진다.
		 */
		System.out.println(list.remove("방탄소년단") ? "삭제성공(방탄)" : "삭제실패(방탄)");
		System.out.println(list.remove("오마이걸") ? "삭제성공(마이걸)" : "삭제실패(마이걸)");
		System.out.println("삭제 후 출력");
		for(Object ob : list) {
			System.out.print(ob + " ");
		}
		System.out.println();
		
		/*
		전체삭제 : 아래 2개의 메서드를 통해 컬렉션에 저장된 전체 데이터를 삭제할 수 있다.
		 */
		list.removeAll(list);
		list.clear();
		System.out.println("전체삭제 후 객체수:" + list.size());
	}

}



























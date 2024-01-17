package ex17collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

import common.Teacher;

class Avengers {
	String name;
	String heroName;
	String weapon;

	public Avengers(String name, String heroName, String weapon) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", "
				+ "능력=" + weapon +"]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(heroName, name, weapon);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("중복 제거용 equals()메소드 호출");
		Avengers other = (Avengers) obj;
		if((other.name == this.name) && 
				(other.heroName == this.heroName) && 
				(other.weapon == this.weapon)) {
			return true;
		}
		else {
			return false;
		}
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		System.out.println("equals() 호출됨");
//		Teacher teacher = (Teacher)obj;
//		
//		if ((teacher.getAge() == super.getAge()) && 
//				teacher.subject.equals(this.subject))
//			return true;
//		else {
//			return false;
//		}
//	}
}

public class QuHashSet {

	public static void main(String[] args) {
		HashSet<Avengers> set = new HashSet<Avengers>();

		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);		 
		
		System.out.println("[최초 전체 정보출력]");
		for(Avengers av : set)
		{
			System.out.println(av.toString());			
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세욤:");
		String searchName = scan.nextLine();
		boolean isFind = true;
		
		Iterator<Avengers> itr = set.iterator();
		while(itr.hasNext()) {
			Avengers hero = itr.next();
			if(searchName.equals(hero.name)) {
				System.out.println(hero.toString());
			}
		}

		if(isFind) {
			System.out.println("요청하신 정보를 찾았습니다.");
		}
		else {
			System.out.println("해당 영웅은 없어요ㅜㅜ");
		}

	}

}

package ex12inheritance;

public class Animal {
	
	private String species;
	public int age;
	public String gender;
	
	public void showAnimal() {
		System.out.println("동물의 종류:" + species + ", 나이:" + age + ", 성별:" + gender);
	}
	
	public void barkExt(String name) {
		System.out.println("이름이 " + name + "이고 종이 " + species + "인 강아지가 짖는다.");
	}
	
	public void showDogExt(String dogKind, String name) {
		System.out.println("species:" + species + ", age:" + age + ", gender:" + gender 
				+ ", dogKind:" + dogKind + ", name:" + name);
	}
	
	public Animal(String species, int age, String gender) {
		this.species = species;
		this.age = age;
		this.gender = gender;
	}

	/*
	부모클래스의 멤버가 private인 경우 자식클래스에서 접근이 불가능하므로 반드시 getter/setter 메소드를 통해
	접근해야 한다.
	-getter : private멤버를 반환할 때 사용
	-setter : 값을 설정할 때 사용
	 */
	public String getSpecies() {
		return species;
	}
	
	
}

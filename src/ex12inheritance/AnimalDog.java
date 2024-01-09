package ex12inheritance;

public class AnimalDog extends Animal {
	
	public String dogKind;
	public String name;
	
	/* 부모클래스의 멤버변수를 public으로 선언하면 자식클래스에서 접근할 수 있으므로 아래와 같이 직접
	변수명을 사용할 수 있다.*/
//	public void bark() {
//		System.out.println("이름이 " + name + "이고 종이 " + super.species + "인 강아지가 짖는다.");
//		barkExt(name);
//	}
	/*
	부모클래스의 species 멤버변수는 private으로 선언되어 자식에서는 접근이 불가능하므로, 이때는
	public으로 선언된 getter 메서도를 통해 접근해야 한다.
	 */
	public void bark() {
		System.out.println("이름이 " + name + "이고 종이 " + super.getSpecies() + "인 강아지가 짖는다.");
		barkExt(name);
	}
	
	public void showDog() {
		/*
		여기서 사용된 super는 부모클래스의 객체를 가리키는 의미로 부모클래스의 showAnima() 메소드를 호출한다.
		 */
		super.showAnimal();
		System.out.printf("강아지의 종류:%s, 이름:%s", dogKind, name);
		System.out.println();
		showDogExt(dogKind, name);
	}

	public AnimalDog(String species, int age, String gender, String dogKind, String name) {
		/*
		자식 클래스에서는 반드시 부모클래스의 객체를 먼저 생성해야 한다. 여기서 사용된 super()는 부모클래스의 생성자
		메소드를 호출하는 용도로 사용된다.
		 */
		super(species, age, gender);
		this.dogKind = dogKind;
		this.name = name;
	}
	

}

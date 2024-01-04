package ex08class;

/*
생성자(Constructor)
-클래스를 인스턴스화 할 때 자동으로 호출되는 메서드
-자동으로 호출되며, 개발자가 임의로 호출할 수 업다.
-반환값이 없다. 따라서 선언시 void를 사용하면 에러가 발생한다.
-생성자 내부에서 또 다른 생성자를 호출할 수 있다.
-오버로딩이 가능하다.
 */
public class PersonConstructor {
	String name;
	int age;
	String addr;
	
	/*
	디폴트 생성자 : 해당 클래스에 생성자를 정의하지 않으면 아래와 같이 매개변수,
		실행부가 없는 생성자가 컴파일러에 의해 자동으로 삽입된다. 지금까지 우리가
		new 클래스명() 과 같이 사용했던 문장이 바로 디폴트 생성자를 호출하여
		인스턴스를 생성하는 것이었다.
	 */
//	public PersonConstructor() {}
	
	//생성자1 : 매개변수가 없는 형태로 정의
	public PersonConstructor() {
		// 항상 고정된 값으로만 초기화할 수 있다.
		name="이름없음";
		age = 1;
		addr = "미상";
		System.out.println("나는 기본생성자 입니다");
	}
	
	//생성자2 : 매개변수가 있는 형태로 정의
	public PersonConstructor(String name) {
		/* 해당 this는 멤버변수와 매개변수를 구분하기 위한 용도로 사용된다.*/
		this.name = name;
		age = 1;
		addr = "출처불명";
		System.out.println("나는 인자생성자[1] 입니다");
	}
	
	//생성자3
	public PersonConstructor(String name, int age) {
		/* this()는 생성자에서 다른 생성자를 호출할 때 사용한다.
		단, 생성자 내에서만 사용할 수 있고 일반 멤버메서드에서는 사용할 수 없다.*/
		this(name, age, "미상");
		System.out.println("나는 인자생성자[2] 입니다");
	}
	
	//생성자4
	public PersonConstructor(String _name, int age, String addr) {
		//변수 구분이 쉬워 this 사용 안함
		name = _name;
		this.age = age;
		this.addr = addr;
		System.out.println("나는 인자생성자[3] 입니다");
	}
	
	//멤버메서드 : 멤버변수 초기화를 목적으로 정의한다.
	void initialize(String name, int age, String addr) {
		/* 해당 코드는 생성자 내에서만 사용 가능. 생성자는 인스턴스 생성시
		딱 한번만 호출되고, 개발자가 임의로 호출할 수 없다.*/
//		this(name, age, "미상");
		
		//멤버변수 구분을 위한 this는 멤버메서드에서도 사용할 수 있다.
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	void showPersonInfo() {
		System.out.printf("%s 님의 정보 \n", this.name);
		System.out.printf("나이:%d\n", age);
		System.out.printf("주소:%s\n", addr);
	}
}


















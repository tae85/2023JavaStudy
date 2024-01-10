package ex12inheritance;

class Rectangle {
	int a;
	int b;
	
	public Rectangle() {}
	
	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void showAreaInfo() {
		System.out.println("직사각형 면적:" + a*b);
	}
}

//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle {
	int a;
	
	public Square(int a) {
		super();
		this.a = a;
	}

	public void showAreaInfo() {
		System.out.println("정사각형 면적:" + a*a);
	}
}

public class QuRectangleMain {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(4, 3);
		rec.showAreaInfo();

		Square sqr = new Square(7);
		sqr.showAreaInfo();
	}

}

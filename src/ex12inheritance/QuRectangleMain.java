package ex12inheritance;

class Rectangle {
	int width;
	int height;
	
	public Rectangle() {}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void showAreaInfo() {
		System.out.println("직사각형 면적:" + (width*height));
	}
}

//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle {
	/* 직사각형은 가로, 세로 두 변의 길이가 서로 다르기 때문에 2개의 멤버변수가 필요하다. 하지만
	정사각형은 길이가 동일하므로 1개의 값으로 2개의 멤버변수를 초기화할 수 있다. 즉 해당 클래스는
	멤버변수의 확장이 필요하지 않다. */
	public Square(int w) {
		super(w, w);
	}

	public void showAreaInfo() {
		System.out.println("정사각형 면적:" 
				+ (super.width*super.height)); // 자식이기 때문에 super 없어도 됨
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

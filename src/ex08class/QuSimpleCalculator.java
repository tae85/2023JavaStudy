package ex08class;

public class QuSimpleCalculator {

	public static void main(String[] args) {
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();

	}

}

class CalculatorEx {
	int addCnt;
	int minCnt;
	int mulCnt;
	int divCnt;
	
	void init() {
		addCnt = 0;
		minCnt = 0;
		mulCnt = 0;
		divCnt = 0;
	}
	int add(int a, int b) {
		addCnt++;
		return a + b;
	}
	double min(double a, double b) {
		minCnt++;
		return a - b;
	}
	double mul(double a, double b) {
		mulCnt++;
		return a * b;
	}
	double div(int a, int b) {
		divCnt++;
		return a / b;
	}
	void showOpCount() {
		System.out.println("덧셈횟수:" + addCnt);
		System.out.println("뺄셈횟수:" + minCnt);
		System.out.println("곱셈횟수:" + mulCnt);
		System.out.println("나눗셈횟수:" + divCnt);
	}
}
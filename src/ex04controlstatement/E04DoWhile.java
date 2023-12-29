package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

/*
do~while문
: 반드시 한번은 실행해야 할 경우 사용하는 반복문으로 조건검사없이 무조건 한번은 실행된다.
형식]
	반복을 위한 변수;
	do{
		실행문;
		증감식;
	}while(조건식); <= 문장의 끝에 세미클론이 들어간다.
 */
public class E04DoWhile {

	public static void main(String[] args) throws IOException {

		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		}while(i<=10);
		System.out.println("1~10까지의 누적합:" + sum);
		
		int total = 0;
		int j = 1;
		do {
			if(j%4==0 || j%7==0) {
				total +=j;
			}
			j++;
		} while(j<=1000);
		System.out.println("1~1000사이 4or7의 배수합:"+total);
		
		/*
		연습문제) 다음과 같은 피라미드를 출력하는 프로그램을 
			do~while문으로 작성하시오.
		 *****
		 *****
		 *****
		 *****
		 *****
		*/
		int x=1;
		do {
			int y=1;
			do {
				System.out.print("* ");
				y++;
			} while (y<=5);
			x++;
			System.out.println();
		} while(x<=5);
		System.out.println();
		
		/*
		연습문제) 다음과 같은 피라미드를 출력하는 프로그램을 
			do~while문으로 작성하시오.
		 *
		 **
		 ***
		 ****
		 *****
		*/
		int a=1;
		do {
			int b=1;
			do {
				System.out.print("* ");
				b++;
			} while (b<=a);
			a++;
			System.out.println();
		} while(a<=5);
		
		System.out.println();
		
		int c=1;
		do {
			int d=1;
			do {
				if(d<=c) {
					System.out.print("* ");
				}
				d++;
			} while (d<=5);
			c++;
			System.out.println();
		} while(c<=5);
		
		System.out.println("#######################################");
		
		int e=1;
		do {
			int f=1;
			do {
				if((e+f)>5) {
					System.out.print("* ");
//					System.out.println("e:"+e+", f:"+f);
				} else {
					System.out.print("  ");
				}
				f++;
			} while (f<=5);
			e++;
			System.out.println();
		} while(e<=5);
		
		
		
		
		//사용자로부터 입력을 받기 위해 Scanner 인스턴스 생성
		Scanner scanner = new Scanner(System.in);
		int kor, eng, math, avg;
		int exitCode;
		do {
			System.out.println("국어점수:");
			kor = scanner.nextInt();
			System.out.println("영어점수:");
			eng = scanner.nextInt();
			System.out.println("수학점수:");
			math = scanner.nextInt();
			
			/*
			switch문은 조건식은 사용할 수 없고 산술식만 사용할 수 있으므로 이와 같이 처리해야 한다.
			 */
			avg = (kor+eng+math) / (3 * 10);
			switch(avg) {
			case 10: case 9:
				System.out.println("A학점");break;
			case 8: 
				System.out.println("B학점");break;
			case 7: 
				System.out.println("C학점");break;
			case 6: 
				System.out.println("D학점");break;
			default: 
				System.out.println("F학점");break;
			}
			
			//사용자로부터 문자 1개를 입력받는다.
			System.out.println("종료하려면 x(X)를 입력하세요.");
			System.out.println("계속하려면 아무키나 입력하세요.");
			exitCode = System.in.read();
			
		}while(!(exitCode=='x' || exitCode=='X'));
		/*
		x를 입력한 경우
			!(true || false) => !(true) => false반환
			따라서 반복문을 탈출한다.
		a를 입력한 경우
			!(false || false) => !(false) => true반환
			따라서 반복문의 처음으로 돌아간다.
		 */
		
	}

}








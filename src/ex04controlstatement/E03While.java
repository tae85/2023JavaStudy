package ex04controlstatement;

/*
while문
: 반복의 횟수가 명확히 정해져 있지 않았을 때 주로 사용하는 반복문으로 반복을 위한
초기값, 조건식, 증감식을 따로 작성하는 형식을 가지고 있다.
형식]
	반복을 위한 변수의 초기값;
	while(반복의 조건) {
		실행문장;
		증감식; <= 반복문 탈출을 위한 조건을 위함.
	}
 */
public class E03While {

	public static void main(String[] args) {
		
		int i = 1;
		while (i<=10) {
			System.out.println("변수i=" + i);
			i++;
		}
		
		int sum = 0;
		int j = 1;
		while(j<=10) {
			sum += j;
			j++;
		}
		System.out.println("1~10까지의 합 sum=" + sum);
		
		int total = 0;
		int k = 1;
		while(k<=100) {
			//3의 배수 혹은 4의 배수이므로 논리OR를 사용한다.
			if(k%3==0 || k%4==0) {
				total += k;
				System.out.println("k="+k);
			}
			k++;
		}
		System.out.println("3또는 4의 배수의 합"+total);
		
		int dan = 2;
		while(dan<=9) {
			int su = 1;
			while(su<=9) {
				if(su==9) {
					System.out.printf("%d*%d=%2d", dan, su, (dan*su));
				}
				else {
					System.out.printf("%d*%d=%2d,", dan, su, (dan*su));
				}
				System.out.print(" ");
				su++;
			}
			System.out.println();
			dan++;
		}
		System.out.println("\n=============================================\n");
		
		
		/*
		시나리오] 아래와 같은 모양을 출력하는 while문을 작성하시오.
			출력결과
				1 0 0 0
				0 1 0 0
				0 0 1 0
				0 0 0 1
		 */
		int x=1;
		while(x<=4) {
			int y=1;
			while(y<=4) {
				if(x==y) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
				y++;
			}
			System.out.println();
			x++;
		}
		
		System.out.println();
		
		/*
		연습문제] 아래와 같은 모양을 출력하는 while문을 작성하시오.
			출력결과
				0 0 0 1
				0 0 1 0
				0 1 0 0
				1 0 0 0
		*/
		
		int a=1;
		while(a<=4) {
			int b=1;
			while(b<=4) {
				if((a+b)==5) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
				b++;
			}
			System.out.println();
			a++;
		}
		
	}
	
}



















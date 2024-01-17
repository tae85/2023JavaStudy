package quiz;

import java.util.Random;
import java.util.Scanner;

public class QuUpDownGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int gamer;
		int com;
		int gameCnt = 1;
		int gameContinue;
		boolean play = true;
		boolean success = true;
		
		while(play) {
			if(gameCnt < 7) {
				System.out.print("숫자를 입력해 주세요 : ");
				com = random.nextInt(99) + 1;
				System.out.println("컴퓨터:" + com);
				while(success) {
					gamer = sc.nextInt();
					if(gamer > 100) {
						System.out.println("100이하의 숫자를 입력해주세요.");
					}
					else if(gameCnt == 7) {
						break;
					}
					else {
						gameCnt++;
						if(gamer == com) {
							System.out.println("성공");
							success = false;
							gameCnt = 8;
							break;
						}
						else if(gamer > com) {
							System.out.println("컴퓨터는 더 낮은 번호입니다.");
						}
						else if(gamer < com) {
							System.out.println("컴퓨터는 더 높은 번호입니다.");
						}
					}
				}
			}
			else if (gameCnt == 7){
				System.out.println("실패하셨습니다.");
				System.out.println("게임을 계속하시겠습니까? 재시작(1), 종료(0)");
				gameContinue = sc.nextInt();
				if(gameContinue == 0) {
					System.out.println("게임종료!");
					play = false;
					break;
				}
				else if(gameContinue == 1) {
					gameCnt = 0;
					success = true;
					continue;
				}
				else {
					while(true) {
						System.out.println("잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요");
						gameContinue = sc.nextInt();
						if(gameContinue == 1) {
							gameCnt = 1;
							break;
						}
						else if(gameContinue == 0) {
							System.out.println("게임종료!");
							play = false;
							break;
						}
						continue;
					}

				}

			}
			else {
				System.out.println("게임을 계속하시겠습니까? 재시작(1), 종료(0)");
				gameContinue = sc.nextInt();
				if(gameContinue == 0) {
					System.out.println("게임종료!");
					play = false;
					break;
				}
				else if(gameContinue == 1) {
					gameCnt = 0;
					success = true;
					continue;
				}
				else {
					while(true) {
						System.out.println("잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요");
						gameContinue = sc.nextInt();
						if(gameContinue == 1) {
							gameCnt = 1;
							break;
						}
						else if(gameContinue == 0) {
							System.out.println("게임종료!");
							play = false;
							break;
						}
						continue;
					}
				}
			}
		}
	}
}

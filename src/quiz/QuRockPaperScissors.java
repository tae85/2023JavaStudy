package quiz;

import java.util.Random;
import java.util.Scanner;

public class QuRockPaperScissors {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gamer;
		int com;
		Random random = new Random();
		int scissors = 1;
		int rock = 2;
		int paper = 3;
		int gameCnt = 0;
		int gameContinue;
		boolean play = true;
		
		while(play) {
			if(gameCnt < 5) {
				System.out.print("무엇을 내겠습니까?(1:가위, 2:바위, 3:보) : ");
				com = random.nextInt(3) + 1;
				gamer = sc.nextInt();
				if(gamer < 4) {
					gameCnt++;
					System.out.println("사용자 : " + rps(gamer) + ", 컴퓨터 : " + rps(com));
					int result = gamer - com;
					if(result == 0) {
						System.out.println("비겻습니다.");
					}
					else if(result == 1 || result == -2) {
						System.out.println("이겼습니다.");
					}
					else if(result == -1 || result == 2) {
						System.out.println("졌습니다.");
					}
				}
				else {
					System.out.println("가위바위보 할줄 모르세요? 제대로 내세요^^;");
				}
			}
			else {
				System.out.println("5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : ");
				gameContinue = sc.nextInt();
				if(gameContinue == 0) {
					System.out.println("게임종료!");
					break;
				}
				else if(gameContinue == 1) {
					gameCnt = 0;
					continue;
				}
				else {
					while(true) {
						System.out.println("잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요");
						gameContinue = sc.nextInt();
						if(gameContinue == 1) {
							gameCnt = 0;
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
	
	static String rps(int num) {
		switch(num) {
		  case 1:
              return "가위";
          case 2:
              return "바위";
          case 3:
              return "보";
          default:
              return "";
      }
	}

}

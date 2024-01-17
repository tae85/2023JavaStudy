package quiz;

import java.util.Random;
import java.util.Scanner;

class Game {
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	int gamer;
	int com;
	int gameCnt;
	int gameContinue;
	boolean play;
	boolean success;
	
	public void gameStart() {
		gameCnt = 0;
		play = true;
		success = true;
		com = random.nextInt(99) + 1;
		
		System.out.print("숫자를 입력해 주세요 : ");
		System.out.println("\n컴퓨터:" + com);
		while(play) {
			if(gameCnt < 7) {
				gamePlay();
			}
			else if(gameCnt == 7) {
				System.out.println("실패하셨습니다.");
				restartCheck();
			} else {
				restartCheck();
			}
		}
	}
	
	public void gamePlay() {
			gamer = sc.nextInt();
			if(gamer <= 100) {
				gameCnt++;
				if(gamer == com) {
					System.out.println("성공");
					success = false;
					gameCnt = 8;
					
				}
				else if(gamer > com) {
					System.out.println("컴퓨터는 더 낮은 번호입니다.");
				}
				else if(gamer < com) {
					System.out.println("컴퓨터는 더 높은 번호입니다.");
				}
			}
			else {
				System.out.println("100이하의 숫자를 입력해주세요.");
			}
	}
	
	public void restartCheck() {
		System.out.println("게임을 계속하시겠습니까? 재시작(1), 종료(0)");
		gameContinue = sc.nextInt();
		if(gameContinue == 0) {
			System.out.println("게임종료!");
			play = false;
		}
		else if(gameContinue == 1) {
			gameStart();
		}
		else {
			while(true) {
				System.out.println("잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요");
				gameContinue = sc.nextInt();
				if(gameContinue == 1) {
					gameStart();
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

public class QuUpDownGameModule {

	public static void main(String[] args) {
		Game game = new Game();
		game.gameStart();
	}
}



















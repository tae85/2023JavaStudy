package test;

import java.util.Scanner;

public class Test_Puzzle {
	public static void printPuzzle(int[][] puzzle) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(puzzle[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void swap(int[][] p, int i, int j, int r, int s) {
		int temp = p[r][s];
		p[r][s] = p[i][j];
		p[i][j] = temp;
	}
	
	public static int[] makeList(int[][] p) {
		int index = 0;
		int[] list = new int[9];
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 4; col++) {
				if(p[row][col] != 0) {
					list[index] = p[row][col];
					index++;
				}
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		int[][] puzzle = {{1,2,3},{4,5,6},{7,8,0}};
		createSolveablePuzzle(puzzle);
		printPuzzle(puzzle);
		play(puzzle);
		if(checkWin(puzzle))
			System.out.println("성공");
		else
			System.out.println("실패");
	}
	
	public static boolean checkWin(int[][] p) {
		int num = 1;
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				if(p[row][col] != num) {
					if(p[row][col] != num) {
						return false;
					}
					num++;
				}
			}
		}
		return true;
	}
	
	public static void play(int[][] p) {
		Scanner input = new Scanner(System.in);
		int row, col;
		int blankRow = 0;
		int blankCol = 0;
		int more;
		for(int r= 0; r < 3; r++) {
			for(int c = 0; c<3; c++) {
				if(p[r][c] == 0) {
					blankRow = r;
					blankCol = c;
				}
				break;
			}
		}
		do {
			System.out.println("Enter row ");
			row = input.nextInt();
			System.out.println("Enter col ");
			col = input.nextInt();
			if(validMove(p, row, col, blankRow, blankCol)) {
				swap(p, row, col, blankRow, blankCol);
				blankRow = row;
				blankCol = col;
				printPuzzle(p);
			}
			else {
				System.out.println("움직일 수 없다.");
			}
			System.out.println("재시작 1번");
			more = input.nextInt();
			System.out.println();
		}while(more==1);
	}
	
	public static void createSolveablePuzzle(int[][] p) {
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				int a = (int)(3*Math.random());
				int b = (int)(3*Math.random());
				if(p[row][col] != 0 && p[a][b] != 0) {
					swap(p, row, col, a, b);
				}
			}
		}
	}
	
	public static boolean validMove(int[][] p, int i, int j, int r, int s) {
		int temp = p[r][s];
		p[r][s] = p[i][j];
		p[i][j] = temp;
		
		return true;
	}
}
































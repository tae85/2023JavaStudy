package quiz;

public class QuUpgradeGuGu {

	public static void main(String[] args) {
		String pow;
		for(int i = 2; i < 10; i++)	{
			pow = "";
			for(int j = 1; j < 10; j++) {
				if(j == 1) {
					System.out.println(i + " x " + j + " = " + (int)Math.pow(i, j));
				}
				else {
					pow += " X " + i ;
					System.out.println(i + pow + " = " + (int)Math.pow(i, j));
				}
			}
		}

	}

}

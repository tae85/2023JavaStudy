package ex07string;

import java.util.Scanner;

public class QuValidateId {

	public static void main(String[] args) {

		System.out.print("ID를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String inputId = scanner.nextLine();
		boolean bool = idValidate(inputId);		
		
		System.out.print(bool ? "사용할 수 있는 아이디입니다." : "사용할 수 없습니다.");
		
	}
	
	static boolean idValidate(String inputId) {
		boolean bool = false;
		if(inputId.length() >=8 && inputId.length() <= 12) {
			char idCheck ;
			for(int i = 1; i < inputId.length(); i++) {
				idCheck = inputId.charAt(i);
				if((idCheck >= '0' && idCheck <= '9') ||
						(idCheck >= 'a' && idCheck <= 'z')) {
					bool = true;
				} else {
					bool = false;
					break;
				}
			}
		} else {
			bool = false;
		}
		return bool;
	}

}

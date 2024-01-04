package ex09package.study.util;

public class CommonUtil {

	public static boolean isNumber(String strValue) {
		if(strValue.length() == 0)
			return false;
		
		for(int i = 0; i < strValue.length(); i++) {
			//각 인덱스에 해당하는 문자의 아스키코드 값을 반환한다.
			int acode = strValue.codePointAt(i);
			if(!(acode>='0' && acode<='9')) {
				return false;
			}
		}
		
		return true;
	}
}

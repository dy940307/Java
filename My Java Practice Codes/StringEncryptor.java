package study;

/*
	[ 기본 흐름 ]
	 1. 문자열을 암호화하는 코드이다.
	 2. 문자열을 문자로 분해하여 하나씩 차례대로 소문자( a ~ z ) 혹은 숫자( 0 ~ 9 )이면 암호 코드를 참조하여 암호화한다.
	 3. 이후 암호화 전의 문자열과 암호화 후의 문자열을 출력한다.
*/

public class StringEncryptor  {
	public static void main(String[] args) {	
		// 소문자 암호 코드	'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
		char[] abcCode = {	'~', '!', '@', '#', '$', '%', '^', '&', '*', '(', 
		//  			'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
					')', '-', '_', '+', '=', '[', ']', '{', '}', ';',
		//			'u', 'v', 'w', 'x', 'y', 'z'	
					':', ',', '.', '/', '?', '<' };					
		
		// 숫자 암호 코드   '0', '1', '2,  '3', '4', '5', '6', '7', '8', '9'
		char[] numCode = { 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z' };
		
		// 암호화시킬 문자열과 암호화된 값을 저장할 변수 
		String str = "abc123";
		String result = "";
		
		// str의 문자열을 charAt()으로 하나씩 잃어서 변환 후 result에 저장
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			// 해당 문자가 소문자면 소문자 암호 코드, 숫자면 숫자 암호 코드의 값을 참조하여 암호화한다.
			if(ch >= 'a' && ch <= 'z')
				result += abcCode[ch - 'a'];
			else if(ch >= '0' && ch <= '9')
				result += numCode[ch - '0'];
		}
		
		System.out.println("문자열 암호화 전: " + str);
		System.out.println("문자열 암호화 후: " + result);
	}
}

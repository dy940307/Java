package study;

import java.util.Scanner;

/*
 
   [ 코드 내용 ]
    1. 사용자가 입력한 문자열이 숫자인지 체크하는 코드.
  
 */

public class NumberChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		// trim 메서드를 사용해 사용자가 입력한 문자열 좌우 공백을 제거시킨 후 문자열 체크를 진행한다.
		System.out.print("값 입력: ");
		str = sc.nextLine().trim();
		
		char ch;
		boolean isNumber = true;
		
		// 입력받은 문자열 하나씩 체크하는데, 숫자가 아니면 곧바로 break로 for문을 빠져나간다.
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if(!(ch >= '0' && ch <= '9')) {
				isNumber = false;
				break;
			}
		}
		
		if(isNumber == true)
			System.out.println("입력한 값은 숫자입니다.");
		else
			System.out.println("입력한 값은 숫자가 아닙니다.");
	}
}

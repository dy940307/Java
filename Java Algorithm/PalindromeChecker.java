package study;

import java.util.Scanner;

/*
 
   [ 코드 내용 ]
    1. 입력받은 값이 회문수인지 체크하기

 */

public class PalindromeChecker {
	
	// 정수를 거꾸로 뒤집는 메서드( 12345 -> 54321 )
	static int reverseNum(int a) {
		int reverseNum = 0;
		
		while(a > 0) {
			reverseNum = reverseNum * 10 + a % 10;
			a /= 10;
		}
		
		return reverseNum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		do {
			System.out.print("값 입력: ");
			num = Integer.parseInt(sc.nextLine());
		} while(num < 0);
		
		// 입력받은 숫자 거꾸로 뒤집어서 저장
		int reversedNum = reverseNum(num);
		
		// 입력받은 숫자와 거꾸로 뒤집은 숫자가 같으면 회문수.
		if(num == reversedNum)
			System.out.println("회문수입니다.");
		else
			System.out.println("회문수가 아닙니다.");
	} 
}

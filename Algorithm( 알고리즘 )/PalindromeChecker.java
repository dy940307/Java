package study1;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		// 정수 입력
		do {
			System.out.print("정수 입력: ");
			num = sc.nextInt();
		} while(num < 0);
			
		int tmpNum = num;
		int reversedNum = 0; // 변수 num을 거꾸로 변환해서 저장할 변수
		
		// 입력한 정숫값을 거꾸로 변환한 값 구하는 과정
		while(tmpNum > 0) {
			reversedNum = reversedNum * 10 + tmpNum % 10;
			tmpNum /= 10;
		}
		
		// 결괏값 출력
		if(num == reversedNum)
			System.out.println(num + "은 회문수이다.");
		else
			System.out.println(num + "은 회문수가 아니다.");
	}
}

package study1;

import java.util.Scanner;

/*
	1. 가우스의 덧셈 개념
 	
 	1 ~ 5까지의 합을 구하시오.

	  1 2 3 4 5
	+ 5 4 3 2 1
	  ---------
	  6 6 6 6 6
 
      ㄴ 6 x 5 = 30
      ㄴ 30 / 2 = 15
      ㄴ 1 ~ 5까지의 합은 15.
  
	2. 가우스의 덧셈 공식 : (n * (n + 1)) / 2

		1 ~ 5까지의 합을 구하시오 -> (5 * (5 + 1)) / 2 = 15
		
*/

public class SumGauss {		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		// n값 입력, 양의 정수를 입력할 때까지 반복하는 do-while문.
		do {
			System.out.print("n값: ");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		// 가우스의 덧셈 공식을 활용하여 1부터 n까지의 합 구하기.
		int sum = (n * (n + 1)) / 2;
		
		// 1부터 n까지의 합을 저장한 sum 변수 출력.
		System.out.println("1부터" + n + "까지의 합은" + sum + "입니다.");
	}
}

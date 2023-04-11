package study1;

import java.util.Scanner;

/*

	1. 가우스의 덧셈 원리
 	
 	ex : 1 ~ 5까지의 합을 구하시오.

	  1 2 3 4 5
	+ 5 4 3 2 1
	  ---------
	  6 6 6 6 6
 
     	 ㄴ 6 x 5 = 30
    	 ㄴ 30 / 2 = 15
     	 ㄴ 1 ~ 5까지의 합은 15.
  
	2. 가우스의 덧셈 공식 : n * (n + 1) / 2
	 ㄴ 1 ~ 5까지의 합을 구하시오 -> 5 * (5 + 1) / 2 = 15
		
*/

public class SumGauss {		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do { // 사용자로부터 1 이상의 값을 입력받는다
			System.out.print("n값 입력: ");
			n = sc.nextInt();
		} while(n <= 0);
		
		// 가우스의 덧셈을 활용하여 1부터 n까지의 합을 구해서 sum 변수에 저장.
		int sum = n * (n + 1) / 2;
		
		// 결괏값 출력.
		System.out.println("1부터" + n + "까지의 합은" + sum + "입니다.");
	}
}

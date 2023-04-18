package study;

import java.util.Scanner;

/*
	1. 가우스의 덧셈 원리( ex : 1 ~ 5까지의 합을 구하시오 )
	
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
		
		do {
			System.out.print("n값 입력: ");
			n = Integer.parseInt(sc.nextLine());
		} while(n < 1);
		
		int sum = n * (n + 1) / 2;
		
		System.out.println("1부터 " + n + "까지의 합: " + sum);
    }
}
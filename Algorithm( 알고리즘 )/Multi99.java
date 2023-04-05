package study1;

import java.util.Scanner;

/*
 	출력 결과
 
 	--------------------------------
	구구단
	--------------------------------
	    | 1  2  3  4  5  6  7  8  9
	--------------------------------
	 1 |  1  2  3  4  5  6  7  8  9
	 2 |  2  4  6  8 10 12 14 16 18
	 3 |  3  6  9 12 15 18 21 24 27
	 4 |  4  8 12 16 20 24 28 32 36
	 5 |  5 10 15 20 25 30 35 40 45
	 6 |  6 12 18 24 30 36 42 48 54
	 7 |  7 14 21 28 35 42 49 56 63
	 8 |  8 16 24 32 40 48 56 64 72
	 9 |  9 18 27 36 45 54 63 72 81
	--------------------------------
	
	--------------------------------
	덧셈
	--------------------------------
	   |  1  2  3  4  5  6  7  8  9
	--------------------------------
	 1 |  2  3  4  5  6  7  8  9 10
	 2 |  3  4  5  6  7  8  9 10 11
	 3 |  4  5  6  7  8  9 10 11 12
	 4 |  5  6  7  8  9 10 11 12 13
	 5 |  6  7  8  9 10 11 12 13 14
	 6 |  7  8  9 10 11 12 13 14 15
	 7 |  8  9 10 11 12 13 14 15 16
	 8 |  9 10 11 12 13 14 15 16 17
	 9 | 10 11 12 13 14 15 16 17 18
	--------------------------------
	
 */

public class Multi99 {
	public static void main(String[] args) {
		System.out.println("--------------------------------");
		System.out.println("구구단");
		System.out.println("--------------------------------");
		System.out.print("   |");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		System.out.println("--------------------------------");
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%2d |", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		
		// 구구단 곱셈표를 변형하여 덧셈 출력하기
		System.out.println("--------------------------------");
		System.out.println("덧셈");
		System.out.println("--------------------------------");
		System.out.print("   |");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		System.out.println("--------------------------------");
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%2d |", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i + j);
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
 	}
}

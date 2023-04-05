package study1;

import java.util.Scanner;


public class Square {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = 0;
		
		// 변의 길이 5를 입력하면 5x5 정사각형, 10을 입력하면 10x10 정사각형 출력.
		System.out.println("정사각형을 출력합니다.");
		do {
			System.out.print("변의 길이: ");
			n = stdIn.nextInt();
		} while(n <= 0);
		System.out.println();
		
		// for문 1개 + repeate() 메서드를 활용해서 정사각형 출력
		for(int i = 0; i < n; i++) {
			System.out.println("*".repeat(n));
		}
		
		System.out.println();
		
		// 2중 for문을 사용해 정사각형 출력 
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
 	}
}

package study1;

import java.util.Scanner;


public class Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 변의 길이 5를 입력하면 5x5 정사각형, 10을 입력하면 10x10 정사각형
		System.out.print("변의 길이: ");
		int sideLength = sc.nextInt();
		
		// repeat() 메서드를 활용해서 정사각형 출력
		for(int i = 0; i < sideLength; i++) {
			System.out.println("*".repeat(sideLength));
		}
		System.out.println();
		
		// 2중 for문을 활용해서 정사각형 출력
		for(int i = 0; i < sideLength; i++) {
			for(int j = 0; j < sideLength; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
 	}
}

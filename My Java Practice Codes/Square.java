package study;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sideLength;
		
		// 변의 길이 5를 입력하면 5x5 정사각형, 10을 입력하면 10x10 정사각형이 출력된다.
		do {
			System.out.print("변의 길이 입력: ");
			sideLength = Integer.parseInt(sc.nextLine().trim());
		} while(sideLength < 1);
		
		// repeat 메서드를 사용해서 정사각형 출력
		for(int i = 0; i < sideLength; i++)
			System.out.println("*".repeat(sideLength));
		
		System.out.println();
		
		// 2중 for문을 사용해서 정사각형 출력
		for(int i = 0; i < sideLength; i++) {
			for(int j = 0; j < sideLength; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
    } // main 중괄호
}
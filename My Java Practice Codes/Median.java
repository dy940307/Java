package study;

import java.util.Scanner;

/*
	1. 세 정수가 중앙값이 올 수 있는 경우의 수는 여섯 가지이다( abc, acb, bac, bca, cab, cba )
	2. 세 정수의 중앙값 구하는 방법1 : 결정 트리 방식으로 여섯 가지의 경우의 수를 찾는다. 'a > b' 으로 시작하여 참일 경우 거짓일 경우로 트리를 뻗어나가며 여섯 가지의 경우의 수를 구한다.
	3. 세 정수의 중앙값 구하는 방법2 : 논리 연산자를 활용하여 여섯 가지의 경우의 수를 찾는다.
*/

public class Median {
	
	static int getMedian1(int a, int b, int c) {
		if(a > b)
			if(b > c)
				return b;	// abc
			else if(a > c)
				return c;	// acb
			else
				return a;	// cab
		else if(a > c)
			return a;		// bac
		else if(b > c)
			return c;		// bca
		else
			return b;		// cba
	}
	
	static int getMedian2(int a, int b, int c) {		
		/* 1. a가 중앙값이 될 수 있는 경우의 수를 구하는 조건식( 주석에는 편의상 '~보다 크고'라고 작성했지만 실제 조건식은 '>=' 작성 ). 
		 - 좌측 조건식 : a가 b보다 작고, a가 c보다 크다 = bac
		 - 우측 조건식 : a가 c보다 작고, a가 b보다 크다 = cab */ 
		if((a <= b && a >= c) || (a <= c && a >= b))
			return a;
		
		/* 2. b가 중앙값이 될 수 있는 경우의 수를 구하는 조건식.
		 - 좌측 조건식 : b가 a보다 작고, c보다 크다 = abc
		 - 우측 조건식 : b가 c보다 작고, a보다 크다 = cba */ 
		else if((b <= a && b >= c) || (b <= c && b >= a))
			return b;
		
		/* 위의 두 조건식이 충족하지 않으면 c가 중앙값( acb, bca ) */ 
		else
			return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		
		do {
			System.out.print("첫 번째 값 입력: ");
			num1 = Integer.parseInt(sc.nextLine().trim());
		} while(num1 < 0);
		
		do {
			System.out.print("두 번째 값 입력: ");
			num2 = Integer.parseInt(sc.nextLine().trim());
		} while(num2 < 0);
		
		do {
			System.out.print("세 번째 값 입력: ");
			num3 = Integer.parseInt(sc.nextLine().trim());
		} while(num3 < 0);
		
		System.out.println("첫 번째 방법으로 중앙값 출력: " + getMedian1(num1, num2, num3));
		System.out.println("두 번째 방법으로 중앙값 출력: " + getMedian2(num1, num2, num3));
    }
}
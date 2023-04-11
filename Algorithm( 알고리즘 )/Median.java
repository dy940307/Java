package study;

import java.util.Scanner;

/*
  
  1. 세 정수가 중앙값이 올 수 있는 경우의 수는 여섯 가지이다( abc, acb, bac, bca, cab, cba )
  2. 세 정수의 중앙값 구하는 방법1 : 결정 트리 방식으로 여섯 가지의 경우의 수를 찾는다. 'a > b' 으로 시작하여 참일 경우 거짓일 경우로 트리를 뻗어나가며 여섯 가지의 경우의 수를 구한다.
  3. 세 정수의 중앙값 구하는 방법2 : 논리 연산자를 활용하여 여섯 가지의 경우의 수를 찾는다.
   
 */
public class Median {
	
	// 세 정수의 중앙값 구하는 방법1
	static int getMedian1(int a, int b, int c) {
		// 세 정수가 중앙값이 올 수 있는 경우의 수는 여섯 가지이다( abc, acb, bac, bca, cab, cba )
 
		if(a > b) /* a가 b보다 크니? */		  	
			if(b > c) /* b가 c보다 크니? */
				return b;	//---------------- a가 b보다 크니?( true )(ab)	-> b가 c보다 크니?( true )(bc)	-> 'abc' 이므로 중앙값 b 리턴  
			else if(a > c) /* a가 c보다 크니? */  
				return c;	//---------------- a가 b보다 크니?( true )(ab)	-> b가 c보다 크니?( false )(cb)	-> a가 c보다 크니?( true )(ac)	-> 'acb' 이므로 중앙값 c 리턴 
			else
				return a;	//---------------- a가 b보다 크니?( true )(ab)	-> b가 c보다 크니?( false )(cb)	-> a가 c보다 크니?( true )(ca)	-> 'cab' 이므로 중앙값 a 리턴 
	
		// 'a가 b보다 크니?' 에서 false일 경우 실행되는 if문
		else if(a > c) /* a가 c보다 크니? */
			return a;		//---------------- a가 b보다 크니?( false )(ba)	-> a가 c보다 크니?( true )(ac)	-> 'bac' 이므로 중앙값 a 리턴
		else if(b > c) /* b가 c보다 크니? */
			return c;		//---------------- a가 b보다 크니?( false )(ba)	-> a가 c보다 크니?( false )(ca)	-> b가 c보다 크니?( true )(bc)	-> 'bca' 이므로 중앙값 c 출력
		else
			return b;		//---------------- a가 b보다 크니?( false )(ba)	-> a가 c보다 크니?( false )(ca)	-> b가 c보다 크니?( false )(cb)	-> 'cba' 이므로 중앙값 b 출력
	}
	
	// 세 정수의 중앙값 구하는 방법2
	static int getMedian2(int a, int b, int c) {
		// 세 정수가 중앙값이 올 수 있는 경우의 수는 여섯 가지이다( abc, acb, bac, bca, cab, cba )
		
		/* 1. a가 중앙값이 될 수 있는 경우의 수를 구하는 조건식( 주석에는 편의상 '~보다 크고'라고 작성했지만 실제 조건식은 '>=' 작성 ). 
		 - 좌측 조건식 : a가 b보다 크고, a가 c보다 작다 = bac
		 - 우측 조건식 : a가 c보다 크고, a가 b보다 작다 = bac */ 
		if((a >= b && a <= c) || (a >= c && a <= b))
			return a;
		
		/* 2. b가 중앙값이 될 수 있는 경우의 수를 구하는 조건식
		 - 좌측 조건식 : b가 a보다 크고, b가 c보다 작다 = cba
		 - 우측 조건식 : b가 c보다 크고, b가 a보다 작다 = abc */ 
		else if((b >= a && b <= c) || (b >= c && b <= a))
			return b;
		
		/* 3. c가 중앙값이 될 수 있는 경우의 수를 구하는 조건식( 앞의 if문에서 해당되는 게 없으면 중앙값이 c이므로 else로 처리 )
		 - 좌측 조건식 : c가 a보다 크고, c가 b보다 작다 = bca
		 - 우측 조건식 : c가 b보다 크고, c가 a보다 작다 = acb */ 
		else
			return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;	// 사용자로부터 입력받은 값을 저장할 변수들.
		
		do {
			System.out.print("첫 번째 값 입력: ");
			num1 = Integer.parseInt(sc.nextLine());
		} while(num1 < 0);
		
		do {
			System.out.print("두 번째 값 입력: ");
			num2 = Integer.parseInt(sc.nextLine());
		} while(num2 < 0);
		
		do {
			System.out.print("세 번째 값 입력: ");
			num3 = Integer.parseInt(sc.nextLine());
		} while(num3 < 0);
		
		System.out.println("첫 번째 방법으로 중앙값 출력: " + getMedian1(num1, num2, num3));
		System.out.println("두 번째 방법으로 중앙값 출력: " + getMedian2(num1, num2, num3));
	}
}        
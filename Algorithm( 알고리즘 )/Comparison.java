package study1;

import java.util.Scanner;

public class Comparison {
	// 최댓값을 구하는 메서드.
	static int max3(int a, int b, int c) {
		int max = a;
		if(b > max)
			max = b;
		if(c > max)
			max = c;
		
		return max;
	}
	// 최솟값을 구하는 메서드.
	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min)
			min = b;
		if(c < min)
			min = c;
		
		return min;
	}
	// 중앙값을 구하는 메서드.
	static int med3(int a, int b, int c) {
		/*
		 	매개변수 a, b, c의 값을 비교. 
		 	
		 	6가지 경우의 수 : abc, acb, bac, bca, cab, cba
		      ㄴ abc = a > b > c, bca = b > c > a, 를 뜻함.
		 	  ㄴ 오로지 크다, 작다만 체크. a >= b >= c 처럼 값이 같은지 여부는 체크하지 않는다.
		 	
		 	if문을 활용해 6가지 경우의 수가 나올 수 있도록 처리하고, 가운데에 위치한 매개변수 리턴.		 	  	
		 */
		if(a > b)
			if(b > c)
				return b;
			else if(a > c)
				return c;
			else
				return a;
		else if(a > c)
			return a;
		else if(b > c)
			return c;
		else
			return b;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, min = 0, max = 0, med = 0, retry = 0;
		// num1 ~ num3은 세 개의 값을 저장할 변수. 
		// min, max, med는 세 값의 최솟값, 최댓값, 중앙값을 저장할 변수. 
		// retry는 프로그램을 또 실행할건지 판단 여부할 때 필요한 조건값을 저장할 변수.
		
		// 사용자가 또 입력하지 않겠다고 선택하기 전까지 계속 반복되는 do-while문.
		do {
			
			System.out.println("세 개의 값을 입력하세요(양수만 입력)");
		
			// 첫 번째 ~ 세 번째 값을 입력할 때 양의 정수 외의 값을 입력하면 다시 입력을 요구시기 위한 do-while문.
			do {
				System.out.print("첫 번째 값: ");
				num1 = stdIn.nextInt();
			} while(num1 <= 0);
		
			do {
				System.out.print("두 번째 값: ");
				num2 = stdIn.nextInt();
			} while(num2 <= 0);
		
			do {
				System.out.print("세 번째 값: ");
				num3 = stdIn.nextInt();
			} while(num3 <= 0);
		
			// 입력받은 값의 최댓값, 최솟값, 중앙값 구하기.
			max = max3(num1, num2, num3);
			min = min3(num1, num2, num3);
			med = med3(num1, num2, num3);
			
			// 최댓값, 최솟값, 중앙값 출력.
			System.out.println("세 값의 최댓값: " + max);
			System.out.println("세 값의 최솟값: " + min);
			System.out.println("세 값의 중앙값: " + med);
			
			// 결괏값 확인 후 프로그램 종료 여부 체크.
			do {
				System.out.println("또 입력하시겠습니까?(0:아니오, 1:네):");
				retry = stdIn.nextInt();
			} while(!(retry == 1 || retry == 0));
				
		} while(retry == 1);
		
		// 프로그램 종료를 선택하면 해당 문구를 출력하면서 프로그램 마무리.
		System.out.println("프로그램이 종료되었습니다.");
	}
}

package study1;

import java.util.Scanner;

/*
 * 
	n부터 n까지의 합 구하기
	 ㄴ 2와 5를 입력하면 "2+3+4+5" 덧셈한 "14"가 출력된다.
	 ㄴ 2와 2를 입력하면 "2" 밖에 없으므로 "2"가 출력된다.
	 
 */

public class SumOf {
	
	// 두 개의 값을 매개변수로 받아 n부터 n까지의 합을 구한다.
	static int sumOf(int a, int b) {
		int min, max, sum = 0;
		
		// 두 개의 값 크기 비교
		if(a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}
		
		// 작은 값부터 큰 값이 될 때까지 반복하며 덧셈
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		
		// 더한 값 리턴
		return sum;	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		do {
			System.out.print("첫 번째 값 입력: ");
			n1 = Integer.parseInt(sc.nextLine());
		} while(n1 < 0);
		
		do {
			System.out.print("두 번째 값 입력: ");
			n2 = Integer.parseInt(sc.nextLine());
		} while(n2 < 0);
		
		// 입력받은 두 값 사이의 합 출력
		System.out.println("입력한 " + n1 + "부터 " + n2 + "까지의 합은" + sumOf(n1, n2) + "입니다.");
	}
}

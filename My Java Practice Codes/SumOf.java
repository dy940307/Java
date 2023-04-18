package study;

import java.util.Scanner;

/*
	n부터 n까지의 합 구하기
	 ㄴ 2와 5를 입력하면 "2+3+4+5" 덧셈한 "14"가 출력된다.
	 ㄴ 2와 2를 입력하면 "2" 밖에 없으므로 "2"가 출력된다. 
 */

public class SumOf {
	
	// 두 개의 값을 매개변수로 받아 크기를 비교한 후, 작은 값부터 시작해서 큰 값이 될 때까지 더해 총합을 구한 뒤 리턴.
	static int sumOf(int a, int b) {
		int min, max, sum = 0;
		
		if(a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}
		
		for(int i = min; i <= max; i ++)
			sum += i;
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		do {
			System.out.print("첫 번째 값 입력: ");
			n1 = Integer.parseInt(sc.nextLine().trim());
		} while(n1 < 0);
		
		do {
			System.out.print("두 번째 값 입력: ");
			n2 = Integer.parseInt(sc.nextLine().trim());
		} while(n2 < 0);
		
		System.out.println("입력한 " + n1 + "부터" + n2 + "까지의 합은" + sumOf(n1, n2) + "입니다.");
    }
}
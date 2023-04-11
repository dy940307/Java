package study1;

import java.util.Scanner;

public class SymbolPatternPrinter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 4개 입력하면 "+-+-" 출력, 3개 입력하면 "+-+" 출력.
		System.out.print("n값 입력: ");
		int n = sc.nextInt();
		
		// 4를 입력했으면 "+-+-" 가 출력되어야 하는데, for문으로 1회 출력할 때마다 "+-"를 출력하기에 입력한 4의 절반만 for문을 실행.
		for(int i = 0; i < n / 2; i++) {
			System.out.print("+-");
		}
		
		// 위에 for문은 오로지 "+-"만 출력한다. 홀수를 입력했으면 마지막에 "+"로 끝나기에 입력한 값이 홀수일 경우 "+"를 1개 출력.
		if(n % 2 != 0)
			System.out.print("+");
 	}
}

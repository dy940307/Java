package study1;

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 4개 입력하면 "+-+-" 출력, 3개 입력하면 "+-+" 출력한다.
		System.out.println("+와 -를 번갈아가며 n개 출력합니다.");
		System.out.print("n값: ");
		int n = stdIn.nextInt();
		
		// 4를 입력했으면 "+-+-" 가 출력되어야 하는데, for문으로 1회 출력할 때마다 "+-"를 출력하기에 입력한 4의 절반만 for문을 실행한다.
		for(int i = 0; i < n / 2; i++) {
			System.out.print("+-");
		}
		
		// 위에 for문은 오로지 "+-"만 출력한다. 홀수를 입력했으면 마지막에 "+"로 끝나기에 입력한 값이 홀수일 경우 "+"를 1개 출력해준다.
		if(n % 2 != 0)
			System.out.print("+");
 	}
}

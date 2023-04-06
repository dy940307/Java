package study1;

import java.util.Scanner;

/*
  
	1부터 n까지의 합과 연산 과정 구하기( 5를 입력하면 "1+2+3+4+5=15"가 출력되어야 한다 ).
	
	코드 요약
	 1. 5를 입력하여 n값이 5가 된다. 그래서 "1+2+3+4+5=15"가 출력되어야 한다.
	 2. 출력해야 하는 결과물을 보면 "1+", "2+", "3+" 를 for문을 이용하여 출력할 수 있다.
	 3. 단, 마지막 값의 경우 "5=" 가 출력되어야 하므로 마지막 값 전까지만 for문을 활용한다.
	 4. for문을 빠져 나오면 마지막 값인 "5="를 출력시킨다.
	 5. 이후, 1부터 5까지 더한 총합인 "15"를 출력시킨다.
	 6. 그럼 "1+2+3+4+5=15"가 완성된다.

 */

public class SumVerbose {		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		int sum = 0;
		
		// n값 입력
		do {
			System.out.print("n값: ");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		
		// 1부터 n값 전까지 "i+" 출력, 그러면서 1부터 n값 전까지의 총합도 구한다
		for(int i = 1; i < n; i++) {
			System.out.print(i + "+");
			sum += i;
		}
		
		// n값 출력 "n=", 마지막 n값도 sum 변수에 더해 총합 구하기를 완료한다
		System.out.print(n + "=");
		sum += n;
		
		// 총합 출력
		System.out.println(sum);
		
	}
}

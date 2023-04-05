package study1;

import java.util.Scanner;

/*
 	1. 가우스의 덧셈 개념
	 	
	 	1 ~ 5까지의 합을 구하시오.
	
		  1 2 3 4 5
		+ 5 4 3 2 1
		  ---------
		  6 6 6 6 6
	 
	      ㄴ 6 x 5 = 30
	      ㄴ 30 / 2 = 15
	      ㄴ 1 ~ 5까지의 합은 15.
      
   2. 가우스의 덧셈 공식 : (n * (n + 1)) / 2
   
   		1 ~ 5까지의 합을 구하시오 -> (5 * (5 + 1)) / 2 = 15
  
 */
public class SumOf {
	
	// 두 개의 값을 넣으면 두 개의 값 사이의 존재하는 값을 전부 더하다( ex : sum(2, 4) -> "2+3+4"의 결괎갑 출력
	// 만약 두 개의 값이 같을 경우 값이 하나만 있으므로 그 값 하나만 리턴( ex : sumOf(2, 2) -> "2" 출력 )
	static int sumOf(int a, int b) { 
		int min = 0, max = 0, sum = 0; // 두 개의 값 중 더 작은 값을 min 변수, 더 큰 값을 max 변수에 저장.
		
		// 매개변수로 넘겨받은 두 개의 값의 크기를 비교
		if(a < b) {
			min = a; 
			max = b;
		} else {
			min = b; 
			max = a;
		}
		
		// 두 정수 사이의 값을 더한 후 그 값을 리턴.
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = 0, sum = 0; // 사용자가 입력한 값을 저장할 변수 n, 1부터 n까지 더한 값을 저장할 변수 sum.
		
		// 1부터 n까지의 합 구하기
		System.out.println("----------------------");
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("----------------------");
		
		do {
			System.out.print("n값: ");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		sum = (n * (n + 1)) / 2;
		
		System.out.println("1부터" + n + "까지의 합은" + sum + "입니다.");

		sum = 0; // 아래 코드에서 재사용하기 위해 0으로 초기화.
		System.out.println(); // 위에 코드랑 간격 띄우기.

		// 1부터 n까지의 합과 연산 과정 구하기( 5를 입력하면 '1+2+3+4+5=15' 가 출력된다 ).
		System.out.println("----------------------");
		System.out.println("1부터 n까지 합한 결괏값과 연산 과정을 출력합니다. ");
		System.out.println("----------------------");
		
		/*
		    5를 입력하여 n값을 5로 지정한다.
		    1부터 5까지 출력한다고 했을 때 "1+2+3+4+5=15"가 출력되어야 한다.
		    for문에서는 "1+" -> "2+" -> "3+" -> "4+" 까지 출력시킨다( 즉, n값 전까지 for문을 돌린다 ).
		    이후 마지막 n값을 출력시킨다 "5="
		    for문에서 n값을 더해주지 않았기에 sum 변수에 n을 더해 최종값을 구한 후, 최종값을 출력시켜준다( 15 ).
		    그럼 "1+2+3+4+5=15"가 완성된다.
		 */
		
		// n값 입력, 양의 정수를 입력하기 전까지 반복하는 do-while문.
		do { 
			System.out.print("n값: ");
			n = stdIn.nextInt();
		} while(n <= 0);
		
	
		// n값 전까지 "i+" 출력시키면서 sum 변수에 총합을 구한다.
		for(int i = 1; i < n; i++) {
			System.out.print(i + "+");
			sum += i;
		}
		
		// 마지막 n값을 출력시킨다. "n="
		System.out.print(n + "=");
		
		// 마지막 n값까지 sum 변수에 더해서 최종값을 구한 후, 최종값 출력. "n=sum".
		sum += n;
		System.out.println(sum);
		
		System.out.println(); // 위에 코드랑 간격 띄우기.
		
		// n부터 n 사이의 값 구하기.
		int a = 0, b =0; 
		
		System.out.println("----------------------");
		System.out.println("두 정수 사이의 값을 구합니다.");
		System.out.println("----------------------");
		
		// 두 개의 정수 입력, 양의 정수를 입력하기 전까지 반복하는 do-while문.
		do {
			System.out.print("첫 번째 정숫값 입력: ");
			a = stdIn.nextInt();
		} while(n <= 0);
		
		do {
			System.out.print("두 번째 정숫값 입력: ");
			b = stdIn.nextInt();
		} while(n <= 0);
		
		// 두 정수 사이의 값 출력
		System.out.println("입력한 두 정수 사이에 존재하는 모든 정수의 총합은 " + sumOf(a, b) + "입니다.");
 	}
}

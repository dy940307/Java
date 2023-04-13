package study;

/*
 
   [ 코드 내용 ]
    1. 1과 1부터 시작하는 피보나치 수열의 열 번째 수는 무엇인지 계산하는 과정 출력하기( 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 )

 */

public class FibonacciSequence {
	public static void main(String[] args) {
		int num1 = 1, num2 = 1, num3 = 0;
		
		System.out.print(num1 + ", " + num2);
		for(int i = 0; i < 8; i++) {
			num3 = num1 + num2;
			System.out.print(", " + num3);
			num1 = num2;
			num2 = num3;
		}
	} 
}

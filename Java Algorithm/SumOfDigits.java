package study;

/*
 
   [ 코드 내용 ]
    1. 문자열 "12345"가 있다. 각 자리의 합을 더한 결괏값을 출력하시오. 문자열 "12345" -> 1+2+3+4+5의 결과인 15가 출력되어야 한다.
    2. 정수 12345가 있다. 각 자리의 합을 더한 결괏값을 출력하시오. 정수 12345 -> 1+2+3+4+5의 결과인 15가 출력되어야 한다.

 */

public class SumOfDigits {
	public static void main(String[] args) {
		
		// 1. 문자열 "12345"의 각 자리의 합
		String str = "12345";
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		System.out.println(sum); // 15
		
		// 2. 정수 12345의 각 자리의 합
		int num = 12345;
		int sum1 = 0;
		
		while(num > 0) {
			sum1 += num % 10;
			num /= 10;
		}
		System.out.println(sum1); // 15	
	} 
}

package study;

/*
   [ 코드 내용 ]
    - 정수 자릿수와 관련된 계산식 작성
 */

public class SumOfDigits {
	public static void main(String[] args) {
		
		// 1. 문자열 "12345"가 있다. 각 자리의 합을 더한 결괏값을 출력하시오. 문자열 "12345" -> 1+2+3+4+5의 결과인 15가 출력되어야 한다.
		String str = "12345";
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		System.out.println(sum); // 15
		
		// 2. 정수 12345가 있다. 각 자리의 합을 더한 결괏값을 출력하시오. 정수 12345 -> 1+2+3+4+5의 결과인 15가 출력되어야 한다.
		int num = 12345;
		int sum1 = 0;
		
		while(num > 0) {
			sum1 += num % 10;
			num /= 10;
		}
		System.out.println(sum1); // 15	
		
		// 3. 525의 10의 자리 이하 버리기( 5255 -> 5250 )
		System.out.println(5255 / 10 * 10);
		
		// 4. 525의 100의 자리 이하 버리기( 5255 -> 5200 )
		System.out.println(5255 / 100 * 100);
		
		// 5. 정수 5255에서 10의 자리 이하만 출력( 5255 -> 55 )
		System.out.println(5255 / 100 * 100);
		
		// 6. 525의 1의 자리 1로 바꾸기( 5255 -> 5251 )
		System.out.println(5255 / 10 * 10 + 1);
	} 
}

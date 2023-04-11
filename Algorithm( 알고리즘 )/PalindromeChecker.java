package study;

import java.util.Scanner;

/*
 
   [ 회문수 판별 방법 ]
    1. 회문수는 앞에서부터 읽으나 뒤에서부터 읽으나 같은 수를 뜻한다( ex : 121, 1221, 12321 ).
    2. 사용자로부터 정숫값을 입력받는다.
    3. 입력받은 정숫값을 거꾸로 하여 새로운 변수에 저장한다.
    4. 사용자가 입력한 정숫값을 저장한 변수와 정숫값을 거꾸로 하여 저장한 변수의 값을 비교한다.
    5. 값이 일치하면 회문수이고, 일치하지 않으면 회문수가 아니다.
    6. 입력한 값이 회문수인지,아닌지를 화면에 출력시킨다.  
    
   [ 참고 ] : 정숫값을 거꾸로 바꾸는 방법
    1. '123 % 10 = 3'	-> 결괏값 3을 reverseNum에 저장( reverseNum = 3 ).
    2. 123 / 10 = 12'	-> 10을 나누어 123의 1의 자리 제거.
    3. '12 % 10 = 2'	-> 결괏값 2를 reverseNum에 저장( reverseNum = 2 ).
     ㄴ 기존에 reverseNum에 저장된 3의 값이 사라져서 문제 발생.
     ㄴ reverseNum에 값을 저장하려면 기존의 3과 2가 연결되어 '32'가 되어야 한다.
    4. reverseNum의 기존에 저장된 값과 새로 대입하려는 값을 더해야 한다.
     ㄴ 다만, '3 + 2'가 되어 '32'가 아닌 '5'가 되어 원하는 값이 나오지 않는다.
    5. reverseNum의 기존에 저장된 값에 'x10'을 해준 다음에 새로 대입하려는 값과 더한다.
     ㄴ 3 x 10 + 2, 이 식을 단계별로 풀어서 아래에 작성해보면
      ㄴ 3 x 10 = 30
      ㄴ 30 + 2 = 32
    6. 위와 같은 과정을 정리하면,
     ㄴ '123 % 10 = 3'	-> 결괏값 3을 reverseNum에 저장( reverseNum = 3 ).
     ㄴ '123 / 10 = 12'	-> 10을 나누어 123의 1의 자리 제거.
     ㄴ '12 % 10 = 2'	-> 결괏값 2를 reverseNum에 저장( 3 x 10 + 2 = 32 ).
     ㄴ '12 / 10 = 1'	-> 10을 나누어 12의 1의 자리 제거.
     ㄴ '1 % 10 = 1'		-> 결괏값 1을 reverseNum에 저장( 32 x 10 + 1 = 321 ). 
   	 ㄴ reverseNum에 '123'을 거꾸로한 '321' 값 저장 완료.
   
 */
public class PalindromeChecker  {
	// 매개변수로 넘어온 값을 거꾸로 바꾼 후 값을 리턴하는 메서드
	static int reverseNum(int n) {
		int reverseNum = 0;	// 거꾸로 바꾼 값을 저장할 변수
		
		while(n > 0) { // 매개변수 값을 전부 거구로 바꾸기 전까지 반복( 거꾸로 바꾸는 원리는 최상단의 [ 참고 ] 주석 참고 ).
			reverseNum = reverseNum * 10 + n % 10; 
			n /= 10;
		}
		
		// 거꾸로 바꾼 값을 리턴
		return reverseNum; 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num; // 사용자로부터 입력받은 정숫값을 저장할 변수
		
		do { // 사용자로부터 정숫값을 입력받는다
			System.out.print("양의 정수 입력: ");
			num = sc.nextInt();
		} while(num <= 0);
		
		// reverseNum() 메서드를 활용하여 사용자로부터 입력받은 정숫값을 거꾸로 한 값을 구하여 변수에 저장한다.
		int reversedNum = reverseNum(num);
		
		// 사용자가 입력한 정숫값과 정숫값을 거꾸로 한 값이 같으면 회문수 맞다, 다르면 회문수가 아니다고 출력한다. 
		if(num == reversedNum)
			System.out.println(num + "은 회문수입니다.");
		else
			System.out.println(num + "은 회문수가 아닙니다.");
	}
}        
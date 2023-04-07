package study1;

import java.util.Arrays;
import java.util.Scanner;

/*

  참고 : 진법 변환한 값을 저장할 배열의 크기를 동적으로 할당하기 위한 계산식
 
   - 진법 변환할 때 자릿수를 구하기 위한 공식 : (int)(Math.log(n) / Math.log(r)) + 1
    ㄴ 여기서 n은 변환하려는 10진수이고, r은 변환하고자 하는 진법이다.
    ㄴ Math.log(n) / Math.log(r)는 n을 r로 나누어 얻어지는 몫의 자릿수를 계산.
    ㄴ (int)를 사용하여 소수점 이하를 버린 다음, 1을 더해주어 n의 r진법으로 변환했을 때 필요한 자릿수를 구한다.
 	
 	ㄴ 예를 들어, 10진수 125를 2진수로 변환하면 '1111101' -> 7자리이고, 아래와 같이 작성하면 결괏값이 7이 나온다.
 		ㄴ (int)(Math.log(125) / Math.log(2)) + 1 
	
	ㄴ 마지막에 +1을 하는 이유는, 자릿수를 계산할 때 소수점 이하 값을 버리기 때문.
	 ㄴ 예를 들어, 10진수 9를 2진수로 변환하면 1001이다. 그러나 Math.log(9) / Math.log(2)를 계산하면 약 3.17이 나오므로, (int)로 형변환하여 3을 만든 후, +1을 해서 4로 만든다.
	 
	Math.log()	
	 - Java의 Math.log() 메서드는 자연로그 (natural logarithm) 값을 계산한다( 자연로그( 밑이 자연상수 e인 로그 ) )
	 - Math.log(x)는 x의 자연로그 값 반환. 예를 들어, Math.log(Math.E)는 1을 반환하고, Math.log(10)은 2.302585092994046을 반환한다.	 
	 
*/

public class CardConv {
	// 진법 변환하는 메서드
	static void cardConv(int n, int r, char[] d) {
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
		// 10진수와 r진수의 나머지 값에 해당하는 값을 dchar 변수에 있는 값을 참조해서 배열 d에 저장
		for(int i = 0; i < d.length; i++) {
			d[i] = dchar.charAt(n % r);
			n /= r;
		}
		
		// 배열 d에 저장한 나머지 값들을 역순으로 정렬
		for (int i = 0; i < d.length / 2; i++) {
			char t = d[i];
			d[i] = d[d.length - i - 1];
			d[d.length - i - 1] = t;
		} 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;                    // 입력 받은 정수
		int radix;                 // 입력 받은 기수
		
		// 정수 입력( 1 ~ 99,999 )
		System.out.println("10진수를 기수 변환합니다.");
		do {
			System.out.print("양의 정수 입력(1 ~ 99,999): ");
			no = sc.nextInt();
		} while(no < 1 || no > 99999);
		
		// 기수 입력( 2 ~ 36 )
		do {
			System.out.print("기수 입력(2~36): ");
			radix = sc.nextInt();
		} while(radix < 2 || radix > 36);
			
		// 진법 변환할 경우의 자릿값을 구해서 이 값으로 배열 크기 설정( 배열 크기 동적 할당 )
		int len = (int)(Math.log(no) / Math.log(radix)) + 1;
		char[] cno = new char[len];
		
		// 입력받은 양의 정수와 기수를 진법 변환한 값을 cno 배열에 저장.
		cardConv(no, radix, cno);
		
		// 결괏값 출력
		for(int i = 0; i < cno.length; i++)
			System.out.print(cno[i]);
		System.out.println("입니다.");
	}
}

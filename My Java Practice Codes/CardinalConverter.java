package study;

import java.util.Arrays;
import java.util.Scanner;

/*
   [ 기본 흐름 ]
    1. 사용자로부터 10진수 정수(1 ~ 99,999)를 입력 받는다.
    2. 사용자로부터 기수( 2 ~ 36진수 )를 입력 받는다. 
    3. 입력받은 정수와 기수를 매개변수로 받아 진법 변환한 값을 메서드를 작성하고, 입력받은 값들을 진법 변환해준다.
    4. 메서드에서 진법 변환한 값을 리턴하고, 이 값을 저장할 수 있는 배열이 필요하다. 다만, 입력받은 값에 따라 진법 변환 결괏값의 자릿수가 매번 달라지기 때문에 배열 크기가 동적으로 할당되게끔 배열을 준비한다.
    5. 메서드에서 진법 변환 결괏값을 배열에 저장 후 배열을 print() 메서드로 출력시켜 진법변환한 값을 화면에 출력시킨다.
 
   [ 참고1 ] : 진법 변환 메서드
    1. 10진수 정수 10을 2진수로 바꾸려면 몫이 0이 될 때까지 10진수 정수를 2로 나누고, 나머지를 역순으로 표기하면 된다.
    2. 연산 '10 % 2'의 나머지를 구해 배열에 저장한다.
    3. 하지만 배열에 저장된 값은 나머지를 구한 차례대로 저장되므로 저장된 값을 역순으로 정렬해야 원하는 값을 구할 수 있다.
    4. 진법 변환 메서드에서는 매개변수로 사용자로부터 입력받은 10진수 정수와 기수를 매개변수로 받아 % 연산자를 사용해 나머지 값을 배열에 저장한다. 이후, 배열에 저장된 값을 역순으로 정렬한 후 해당 배열을 리턴한다.
    
    [ 참고2 ] : (int)(Math.log(n) / Math.log(r)) + 1
    1. 10을 2진수로 변환하면 1010이 되고, 22를 2진수로 변환하면 10100이 된다. 진법 변환한 값을 저장하려면 이 자릿수를 알아야 한다
    2. 위의 식은 이러한 자릿수를 구할 수 있는 계산식이고, 이 식의 결괏값을 배열의 크기로 지정해준다.
    3. 'Math.log(n)'의 'n'은 변환하려는 10진수 정수이고, 'Math.log(r)'의 'r'은 기수이다. 
    4. 10을 2진수로 변환할 경우 '(int)(Math.log(10) / Math.log(2)) + 1' 이러한 식이 된다.
    5. 계산식에서 마지막에 +1을 하는 이유는 'Math.log(n) / Math.log(r)' 의 결괏값은 실수이고, int형으로 형변환 하면서 소수점 이하 값을 버리기 때문에 구하고자 하는 자릿수보다 1 작은 수치가 나온다.
     ㄴ 예를 들어, 9를 2진수로 변환하면 1001이다. 그러나 Math.log(9) / Math.log(2)를 계산하면 약 3.17이 나오므로, (int)로 형변환하여 3을 만든 후, +1을 해서 4로 만든다.
 */
public class CardinalConverter  {
	
	// 진법 변환에 사용되는 메서드( 매개변수 n은 10진수 정수,매개변수 r은 기수 )
	static char[] cardinalConversion(int n, int r) {
		
		// 2 ~ 36진수 진법 변환 대응 값
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		// 진법 변환한 결괏값을 저장할 배열 생성. 
		// 사용자로부터 입력받은 값이 매번 달라 저장할 값의 크기를 동적으로 할당하기 위한 Math.log() 메서드를 활용한 배열 크기 설정.
		int len = (int)(Math.log(n) / Math.log(r)) + 1;
		char[] cardinalNum = new char[len]; 
		
		// 입력받은 정수와 기수를 나눈 나머지 값에 해당하는 값( str 변수의 "01234...Z" 문자열 중 1개 )을 배열에 저장.
		for(int i = 0; i < cardinalNum.length; i++) {
			cardinalNum[i] = str.charAt(n % r);
			n /= r;
		}
		
		// 정수와 기수의 몫이 0이 될 때까지 나누어서 저장한 나머지를 역순으로 정렬
		for(int i = 0; i < cardinalNum.length / 2; i++) {
			char tmp = cardinalNum[i];
			cardinalNum[i] = cardinalNum[cardinalNum.length - 1 - i];
			cardinalNum[cardinalNum.length - 1 - i] = tmp;
		}
		
		// 역순 정렬까지 완료하여 진법 변환 완료한 값을 저장한 배열 리턴
		return cardinalNum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;	// 입력받은 10진수 정수를 저장할 변수
		int radix;	// 입력받은 기수를 저장할 변수
		
		do { // 사용자로부터 10진수 정수를 입력받는다. 
			System.out.print("10진수 정수 입력(1 ~ 99,999): ");
			num = Integer.parseInt(sc.nextLine());
		} while(num < 1 || num > 99999);
		
		do { // 사용자로부터 기수를 입력받는다.
			System.out.print("기수 입력(2 ~ 36): ");
			radix = Integer.parseInt(sc.nextLine());
		} while(radix < 2 || radix > 36);
	
		// cardianlConversion() 메서드로 진법 변환한 값을 cardinalNum 배열에 저장.
		char[] cardinalNum = cardinalConversion(num, radix);
		
		// cardinalNum 배열에 저장된 값을 출력. 
		System.out.print("입력하신 " + num + "는(은) " + radix + "진수로 ");
		for(int i = 0; i < cardinalNum.length; i++)
			System.out.print(cardinalNum[i]);
		System.out.println("입니다.");
	}
}

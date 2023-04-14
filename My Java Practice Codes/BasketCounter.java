package study;

import java.util.Scanner;


/*
   [ 코드 설명 ] 
    - 사과 개수를 입력하면 사과를 담기 위해 필요한 바구니 수를 출력하는 프로그램이다.
    - 바구니 1개에 사과 10개를 담을 수 있다( ex : 사과 개수 2개를 입력하면 필요한 바구니 1개, 100개면 10개, 105개면 11개 ).  
 */

public class BasketCounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int appleCount;					// 입력한 사과 개수를 저장할 변수
		final int BASKET_SIZE = 10;		// 바구니 1개에 담을 수 있는 사과의 개수
	
		do {
			System.out.print("사과 개수 입력: ");
			appleCount = Integer.parseInt(sc.nextLine());
		} while(appleCount < 0);
		
		int basketCount = (appleCount + 9) / BASKET_SIZE;
		System.out.println("사과를 담기 위해 필요한 바구니 개수: " + basketCount);
	}
}

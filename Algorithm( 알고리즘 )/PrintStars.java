package study1;

import java.util.Scanner;

/*
	1. *를 n개 출력하되 w개마다 줄을 바꿔서 출력한다.
	2. 예시 
 	
	'*'를 10개 출력하고, 3개마다 줄바꿈.
 	
 		결괏값:  
			 ***
			 ***
			 ***
			 **
	
	'*'를 15개 출력하고, 6개마다 줄바꿈
	
		결괏값:
			******
			******
			***
	
	3. 마지막 줄을 제외하곤 '*'이 일정하게 출력된다. 마지막 줄만 불규칙하게 '*'이 출력된다.
	4. n과 w를 나눈 몫이 '*'이 일정하게 출력되는 수이며, n과 w의 나머지 값만큼 별이 출력된다.
	 ㄴ n값이 7, w값이 3일 경우 
	   ㄴ n / w -> 7 / 3 = 2 // '***' 2줄
	   ㄴ n % w -> 7 % 3 = 1 // '*' 마지막 줄에 '*' 1개 출력
	   ㄴ 출력 결과
	      ***	
	      ***
	      *	   
	5. n / w의 식으로 '*'이 일정하게 출력되는 것과 n % w로 마지막 줄의 불규칙한 '*'을 출력하는 것을 구분하여 코드를 작성해야 한다.
 */
public class PrintStars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, w; // 사용자로부터 입력받을 n값과 w값을 저장할 변수
		
		System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");
		do { // 출력할 '*' 개수 입력
			System.out.print("n값: ");
			n = Integer.parseInt(sc.nextLine());
		} while(n <= 0);
		
		do { // 몇 개마다 줄바꿈을 할 건지 값 입력
			System.out.print("w값: ");
			w = Integer.parseInt(sc.nextLine());
		} while(w <= 0 || w > n);
		
		// repeate() 메서드로 '*' 출력. 매개변수로 입력한 w 값을 전달해 for문이 한 번 실행될 때마다 w 개수만큼 '*' 출력.
		// n 값과 w값을 나눈 수만큼 for문을 돌린다. 이렇게 하면 마지막 줄이 되기 전까지 일정하게 '*'이 출력된다.
		for(int i = 0; i < n / w; i++)
			System.out.println("*".repeat(w));
		
		// 마지막 줄의 '*' 을 출력하는 코드. n값과 w값의 나머지만큼 '*'을 출력하고, 만약 마지막 줄에 출력할 별이 없을 경우 출력을 생략한다.
		if(n % w != 0)
			System.out.println("*".repeat(n % w));
 	}
}

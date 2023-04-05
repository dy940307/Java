package study1;

import java.util.Scanner;

/*
 	'*'를 10개 출력하고, 3개마다 줄을 바꾸려고 한다.
 	
 		결괏값:  
			 ***
			 ***
			 ***
			 **
	
	'*'를 15개 출력하고, 6개마다 줄을 바꾸려고 한다.
	
		결괏값:
			******
			******
			***
			
	마지막 줄을 제외하곤 '*'이 일정하게 출력된다. 마지막 줄만 '*'의 개수가 달라진다.
	그래서 마지막 줄이 되기 전까지 '*'을 출력하는 코드, 마지막 줄을 출력하는 코드를 구분해서 작성한다. 
	
 */
public class PrintStars {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = 0, w = 0;
		
		System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");
		// 출력할 '*'의 개수 입력
		do {
			System.out.print("n값: ");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		// 몇 개마다 줄바꿈이 발생할 건지 개수 입력
		do {
			System.out.print("w값: ");
			w = stdIn.nextInt();
		} while(w <= 0 || w > n);
		
		
		// repeate() 메서드로 '*' 출력. 매개변수로 입력한 w 값을 전달해 for문이 한 번 실행될 때마다 w 개수만큼 '*' 출력.
		// 마지막 n 값과 w 값을 나눈 수만큼 for문을 돌린다. 이렇게 하면 마지막 줄이 되기 전까지 일정하게 '*'이 출력된다.
		for(int i = 0; i < n / w; i++)
			System.out.println("*".repeat(w));
		
		// 마지막 줄의 '*' 을 출력하는 코드. n값과 w값의 나머지만큼 '*'을 출력하고, 만약 마지막 줄에 출력할 별이 없을 경우 출력을 생략한다.
		int rest = n % w;
		if(rest != 0)
			System.out.println("*".repeat(rest));
 	}
}

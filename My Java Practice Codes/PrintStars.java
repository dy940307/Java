package study;

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
	
	4. n과 w를 나눈 몫이 '*'이 일정하게 출력되는 줄의 개수이며, 불규칙n과 w의 나머지 값만큼 별이 출력된다.
	
	5. "*"이 일정하게 출력되는 줄, "*"이 불규칙하게 출력되는 마지막 줄을 구분하여 코드를 작성한다.
*/

public class PrintStars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, w;
		
		// 출력할 "*" 개수 입력
		do {
			System.out.print("n값 입력: ");
			n = Integer.parseInt(sc.nextLine().trim());
		} while(n < 1);
		
		// 한 줄에 출력할 수 있는 "*"의 개수( 몇 개마다 줄바꿈을 할 건지 )
		do {
			System.out.print("w값 입력: ");
			w = Integer.parseInt(sc.nextLine().trim());
		} while( w < 1);
		
		// 마지막 줄이 되기 전까지 반복하여 "*" 출력
		for(int i = 0; i < n / w; i++)
			System.out.println("*".repeat(w));
		
		// 마지막 줄에 출력될 "*"이 있으면 출력
		if(n % w != 0)
			System.out.println("*".repeat(n % w));	
    }
}
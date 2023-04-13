package study;

import java.util.Scanner;

/*
 
   [ 코드 내용 ]
    1. 1 ~ 100 범위 내에서 생성된 숫자를 맞추는 코드.
    2. 1과 100사이의 값을 반복적으로 입력해서 생성된 숫자를 맞추면 프로그램이 종료된다.
    3. 생성된 숫자보다 더 큰 숫자를 입력하면 더 작은 수를 입력하라고 안내하고, 더 작은 숫자를 입력하면 더 큰 수를 입력하라고 안내한다.
    --
    1과 100사이의 값을 입력하세요: 50
    더 큰 수를 입력하세요.
    1과 100사이의 값을 입력하세요: 75
    더 작은 수를 입력하세요.
    1과 100사이의 값을 입력하세요: 64
    맞췄습니다.
    시도 횟수는 3번입니다.
    -- 

 */

public class NumberGuessGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int questionNum = (int)(Math.random() * 100) + 1;
		int answerNum;
		int count = 0;
		
		do {
			
			count++;; // 시도 횟수 증가
			
			System.out.print("1과 100사이의 값 입력: ");
			answerNum = Integer.parseInt(sc.nextLine());
			
			if(answerNum == questionNum) {
				System.out.println("정답입니다.");
				System.out.println("시도 횟수는 " + count + "번입니다.");
				break;
			} else if(answerNum > questionNum)
				System.out.println("더 작은 수를 입력하세요.");
			else 
				System.out.println("더 큰 수를 입력하세요.");
		
		} while(true);
	} 
}

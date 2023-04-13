package study;

import java.util.Scanner;

/*
	[ 기본 흐름 ]
	 1. 영어 단어를 맞추는 코드이다.
	 2. 단어장에 있는 영어 단어를 하나씩 출력하고, 그 단어의 한글 뜻을 입력한다.
	 3. 한글 뜻을 입력하면 단어장에 있는 한글 뜻과 비교해서 일치하면 정답 처리한다.
	 4. 단어장의 마지막 단어까지 진행했으면 몇 문제 중 몇 문제 맞혔는지 결과가 출력된다. 
*/

public class EnglishQuizzer  {
	public static void main(String[] args) {
		// 퀴즈용 단어장
		String[][] words = {
				{"desk", "책상"},
				{"chair", "의자"},
				{"computer", "컴퓨터"} 
		};
		
		Scanner sc = new Scanner(System.in);
		int score = 0; // 맞춘 문제의 수를 저장하기 위한 변수
		
		// 단어장에 있는 단어 수만큼 for문을 반복하여 퀴즈를 낸다
		for(int i = 0 ; i < words.length; i++) {
			// 문제 출력( ex : Q1. desk의 뜻은? )
			System.out.printf("Q%d. %s의 뜻은?:", i+1, words[i][0]);
			String answer = sc.nextLine();
			
			// 사용자가 입력한 답과 단어장의 한글 뜻이 같은지 비교하여 정답인지 체크
			if(answer.equals(words[i][1])) {
				System.out.printf("정답입니다.\n\n");
				score++;
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.\n\n", words[i][1]);
			}
		} // for문의 끝
		
		// 퀴즈 결과 출력
		System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.", words.length, score);
	}
}
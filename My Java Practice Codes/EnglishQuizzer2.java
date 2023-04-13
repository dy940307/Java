package study;

import java.util.Scanner;

/*
	[ 기본 흐름 ]
	 1. 글자 순서가 섞여 있는 영어 단어를 원래 철자대로 맞추는 코드이다.
	 2. 단어장에 있는 영어 단어를 문자 단위로 쪼개서 char 배열에 저장 후 배열을 섞는다.
	 3. 배열을 섞어서 글자 위치가 바뀐 영어 단어가 출력된다.
	 4. 사용자가 답변을 입력하면 단어장에 있는 단어와 비교하여 정답 여부를 결정한다.
	 5. 단어장의 마지막 단어까지 반복하여 퀴즈를 푼다.
*/

public class EnglishQuizzer2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 단어장
		String[] words = {"desk", "chair", "computer"};
		
		// 단어 맞추기( 단어장의 단어 처음부터 끝까지 문제를 제출하기 위한 for문 )
		for(int i = 0; i < words.length; i++) {
			
			// 단어 글자 위치 섞기( 단어를 문자 단위로 쪼깨어 char 배열에 저장 후 char 배열을 섞는다 )
			char[] question = words[i].toCharArray();
			int idx = (int)(Math.random() * question.length);
			
			char tmp = question[i];
			question[i] = question[idx];
			question[idx] = tmp;
			
			// 단어 글자 위치 섞은 후 문제 출력
			System.out.printf("Q%d. %s의 정답을 입력하세요.", i+1, new String(question));
			String answer = sc.nextLine();
			
			// trim()으로 좌우 공백 제거 후, 사용자가 입력한 답과 단어장에 있는 단어와 같은지 비교
			if(answer.equals(words[i]))
				System.out.println("정답입니다.");
			else
				System.out.println("틀렸습니다.");
		} // for문의 끝
	} // main의 끝
}
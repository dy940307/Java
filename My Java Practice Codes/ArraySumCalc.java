package study;

/*
	[ 코드 설명 ]
	 - 2차원 배열을 이용하여 학생들의 점수를 계산하고 출력하는 코드이다.
*/

public class ArraySumCalc {
	public static void main(String[] args) {
		
		// 학생들의 점수
		int[][] score = {
			// 	국어,	  영어,  수학	
				{100, 100, 100},	// 학생 A
				{20, 20, 20},		// 학생 B
				{30, 30, 30},		// 학생 C
				{40, 40, 40},		// 학생 D
				{50, 50, 50}		// 학생 E
		};
		
		// score 배열보다 가로와 세로로 1씩 더 큰 배열 생성. score 배열의 모든 요소를 저장하고, 추가적으로 각 행과 열의 합계를 저장한다.
		int[][] result = new int[score.length + 1][score[0].length + 1];
		
		// result 배열 초기화. score 배열의 값을 result 배열에 복사하고, 각 행과 열의 합계를 계산하여 result 배열에 저장한다.
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j]; 						// score의 모든 요소를 result에 복사
				result[i][result[0].length - 1] += result[i][j];			// 각 열의 합계 구하기
				result[result.length - 1][j] += result[i][j];				// 각 행의 합계 구하기
				result[result.length - 1][result[0].length - 1] += result[i][j];	// 모든 요소의 합계 구하기
			}
		}
		
		// result 배열 출력
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
		/*	  출력 결과
			  100 100 100 300
			  20  20  20   60
			  30  30  30   90
			  40  40  40  120
			  50  50  50  150
			 240 240 240  720 
		 */
	}
}

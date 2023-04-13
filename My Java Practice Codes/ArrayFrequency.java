package study;

import java.util.Arrays;

/*
  
	[ 기본 흐름 ]
	 1. 크기 10의 배열에 1 ~ 10의 정숫값을 난수로 저장한다.
	 2. 이후 배열의 빈도수를 계산하고, 배열의 빈도수를 출력한다.
	 3. 1 ~ 10의 빈도수를 출력할 때 빈도수 옆에 빈도수 개수만큼 '*'을 출력한다.
	  ㄴ ex( 1의 개수: 3***, 2의 개수: 1*, 3의 개수: 0 )
	
*/

public class ArrayFrequency   {
	public static void main(String[] args) {	
		// 배열 생성
		int[] arr = new int[10];
		
		// 배열 난수 초기화( 1 ~ 10 )
		for(int i = 0; i < arr.length; i++)
			arr[i] = (int)(Math.random() * 10 + 1);  

		// 빈도수 계산
		int[] freqArr = new int[10];
		for(int i = 0; i < freqArr.length; i++)
			freqArr[arr[i]-1]++; // 배열 인덱스 0 ~ 9, 배열 초기화값 1 ~ 10으로 인덱스 범위가 달라 일치하기 위해 -1 작성
			
		// 배열 값 출력
		System.out.println("배열 값 출력: " + Arrays.toString(arr));
		
		// 배열 빈도수 출력
		for(int i = 0; i < freqArr.length; i++) {
			System.out.print((i + 1) + "의 개수: " + freqArr[i]); // 배열에는 0이 존재하지 않는다. 1의 개수부터 출력하기 위해 (i + 1).
			
			// 빈도수 개수만큼 '*' 출력
			for(int j = 0; j < freqArr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
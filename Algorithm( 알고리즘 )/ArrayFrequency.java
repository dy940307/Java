package study1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFrequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
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
		for(int i = 0; i < freqArr.length; i++)
			System.out.println((i + 1) + "의 개수: " + freqArr[i]); // 0의 개수는 없다. 1의 개수부터 출력하기 위해 (i + 1)
	}
}

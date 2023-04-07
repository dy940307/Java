package study1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrReverseEx {
	// 배열 요소 a[idx1]과 a[idx2]를 교환
	static void swap(int[] a, int idx1, int idx2) {
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}
	
	// 배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		System.out.println(Arrays.toString(a));
		for(int i = 0; i < a.length / 2; i++) {
			System.out.println(" a[" + i + "]과(와) a[" + (a.length - 1 - i) + "]을 교환합니다.") ;
			swap(a, i, a.length - 1 - i);
			System.out.println(Arrays.toString(a));
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 5, 1, 3, 9, 6, 7};
		
		// arr 배열 역순 정렬
		reverse(arr);
		
		/*  출력 결과
		 	[2, 5, 1, 3, 9, 6, 7]
			 a[0]과(와) a[6]을 교환합니다.
			[7, 5, 1, 3, 9, 6, 2]
			 a[1]과(와) a[5]을 교환합니다.
			[7, 6, 1, 3, 9, 5, 2]
			 a[2]과(와) a[4]을 교환합니다.
			[7, 6, 9, 3, 1, 5, 2]
		 */
	}
}

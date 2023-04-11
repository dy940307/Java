package study1;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
	// 매개변수 arr2의 요소를 매개변수 arr1에 복사한다
	static void copy(int[] arr1, int[] arr2) {
		int len = (arr1.length <= arr2.length) ? arr1.length : arr2.length;
		for(int i = 0; i < len; i++) {
			arr1[i] = arr2[i];
		}
	}
	
	// 매개변수 arr2의 요소를 역순으로 매개변수 arr1에 복사한다
	static void reverseCopy(int[] arr1, int[] arr2) {
		int len = (arr1.length <= arr2.length) ? arr1.length : arr2.length;
		for(int i = 0; i < len; i++) {
			arr1[i] = arr2[arr2.length - 1 - i];
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int[] arr2 = {100,200,300};
		
		// arr2의 요소를 arr1에 복사 후 출력
		copy(arr1, arr2);
		System.out.println(Arrays.toString(arr1));	// [100, 200, 300, 4, 5, 6, 7, 8,9, 10]
		
		// arr2의 요소를 역순으로 arr1에 복사 후 출력
		reverseCopy(arr1, arr2);
		System.out.println(Arrays.toString(arr1));	// [300, 200, 100, 4, 5, 6, 7, 8, 9, 10]
	}
}

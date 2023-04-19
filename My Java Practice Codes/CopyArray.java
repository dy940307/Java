package study;

import java.util.Arrays;

public class CopyArray {
	
	// 매개변수 arr2의 요소를 매개변수 arr1에 복사한다
	static void copy(int[] a, int[] b) {
		int len = (a.length <= b.length) ? a.length : b.length;
		for(int i = 0; i < len; i++)
			a[i] = b[i];
	}
	
	// 매개변수 arr2의 요소를 역순으로 매개변수 arr1에 복사한다
	static void reverseCopy(int[] a, int[] b) {
		int len = (a.length <= b.length) ? a.length : b.length;
		for(int i = 0; i < len; i++)
			a[i] = b[b.length - 1 - i];
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] arr2 = {100, 200, 300};
		
		// arr2의 요소를 arr1에 복사 후 출력
		copy(arr1, arr2);
		System.out.println(Arrays.toString(arr1));	// [100, 200, 300, 4, 5, 6, 7, 8,9, 10]
		
		// arr2의 요소를 역순으로 arr1에 복사 후 출력
		reverseCopy(arr1, arr2);
		System.out.println(Arrays.toString(arr1));	// [300, 200, 100, 4, 5, 6, 7, 8, 9, 10]
	}
}
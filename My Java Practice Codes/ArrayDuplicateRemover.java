package study;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayDuplicateRemover {
	
	static int[] removeDuplicates(int[] a) {
		int[] tmpArr = new int[a.length];
		int idx = 0;
		boolean found;
		
		for(int i = 0; i < a.length; i++) {
			found = false;
			for(int j = 0; j < i; j++) {
				if(a[j] == a[i]) {
					found = true;
					break;
				}
			}
			if(!found)
				tmpArr[idx++] = a[i];
		}
		
		return Arrays.copyOf(tmpArr, idx);
	}
	
	public static void main(String[] args) {
		// 배열 생성
		int arr[] = {1, 6, 4, 4, 5, 6, 1, 2, 5};
		
		// 배열 중복 제거
		int[] result = removeDuplicates(arr);
		
		// 중복 제거 전과 제거 후의 값 출력
		System.out.println("중복 제거 전: " + Arrays.toString(arr));	// [1, 6, 4, 4, 5, 6, 1, 2, 5]
		System.out.println("중복 제거 후: " + Arrays.toString(result));	// [1, 6, 4, 5, 2]
	}
}
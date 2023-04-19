package study;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayShuffler {
	
	static void shuffleArray(int[] a) {
		for(int i = 0; i < a.length; i++) {
			int idx = (int)(Math.random() * a.length);
			int tmp = a[i];
			a[i] = a[idx];
			a[idx] = tmp;
		}
	}
	
	public static void main(String[] args) {
		// 배열 생성
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("배열 요소 섞기 전 출력: " + Arrays.toString(arr));
		
		// 배열 요소 섞기
		shuffleArray(arr);
		System.out.println("배열 요소 섞은 후 출력: " + Arrays.toString(arr));
	}
}
package study;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySort {
	
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꾸는 메서드 
	static void swap(int[] a, int idx1, int idx2) {
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}
	
	// 배열 요소 역순 정렬 메서드
	static void reverseSort(int[] a) {
		for(int i = 0; i < a.length / 2; i++)
			swap(a, i, a.length - 1 - i);
	}
	
	// 배열 요소 오름차순 정렬 메서드
	static void ascendingSort(int[] a) {
		for(int i = 0; i < a.length; i++)
			for(int j = i + 1; j < a.length; j++)
				if(a[j] < a[i])
					swap(a, i, j);
	}
	
	// 배열 요소 내림차순 정렬 메서드
	static void descendingSort(int[] a) {
		for(int i = 0; i < a.length; i++)
			for(int j = i + 1; j < a.length; j++)
				if(a[j] > a[i])
					swap(a, i, j);
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int len;
		
		// 배열 길이를 입력 받아서 배열 생성
		do {
			System.out.print("배열 길이 입력(1~10): ");
			len = Integer.parseInt(sc.nextLine().trim());
		} while(len < 1 || len > 10);
		
		int[] arr = new int[len];
		
		// 난수를 사용하여 배열 초기화( 난수 범위 : 0 ~ 9 )
		for(int i = 0; i < arr.length; i++)
			arr[i] = rand.nextInt(10);
		
		// 난수로 초기화된 배열 요소 출력
		System.out.println("배열 값 출력: " + Arrays.toString(arr));
		
		// 배열 요소 역순 정렬
		reverseSort(arr);
		System.out.println("배열 값 역순 출력: " + Arrays.toString(arr));
		
		// 배열 요소 오름차순 정렬
		ascendingSort(arr);
		System.out.println("배열 값 오름차순 출력: " + Arrays.toString(arr));
		
		// 배열 요소 내림차순 정렬
		descendingSort(arr);
		System.out.println("배열 값 내림차순 출력: " + Arrays.toString(arr));	
	}
}
package study1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrCopy {
	// 배열 b의 요소를 배열 a에 복사하는 메서드
	static void arrCopy(int[] a, int[] b) {
		int len = a.length <= b.length ? a.length : b.length;
		for(int i = 0; i < len; i++) {
			a[i] = b[i];
		}
	}
	
	// 배열 b의 요소를 배열 a에 복사하는 메서드
		static void arrReverseCopy(int[] a, int[] b) {
			int len = a.length <= b.length ? a.length : b.length;
			for(int i = 0; i < len; i++) {
				a[i] = b[b.length -  i - 1];
			}
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len1, len2; // 입력 받은 배열 길이 저장할 변수
		
		// 첫 번째 배열 길이 입력
		do {
			System.out.print("첫 번째 배열 길이 입력(1~10): ");
			len1 = sc.nextInt();
		} while(len1 <= 0 || len1 > 10);
		
		// 첫 번째 배열 생성 및 초기화
		int[] arr1 = new int[len1];
		for(int i = 0; i < arr1.length; i++) {
			System.out.print("첫 번째 배열 [" + i + "]번 값 입력: " );
			arr1[i] = sc.nextInt();
		}
		
		System.out.println();
		
		// 두 번째 배열 길이 입력
		do {
			System.out.print("두 번째 배열 길이 입력(1~10): ");
			len2 = sc.nextInt();
		} while(len2 <= 0 || len2 > 10);
		
		// 두 번째 배열 생성 및 초기화
		int[] arr2 = new int[len2];
		for(int i = 0; i < arr2.length; i++) {
			System.out.print("두 번째 배열 [" + i + "]번 값 입력: " );
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("arr1 배열 요소: " + Arrays.toString(arr1));
		System.out.println("arr2 배열 요소: " + Arrays.toString(arr2));
		
		// arr2의 요소를 arr1에 복사
		arrCopy(arr1, arr2);
		System.out.println("arr2의 요소를 복사한 arr1 배열 요소: " + Arrays.toString(arr1));

		// arr2의 요소를 arr1에 역순으로 복사
		arrReverseCopy(arr1, arr2);
		System.out.println("arr2의 요소를 역순으로 복사한 arr1 배열 요소: " + Arrays.toString(arr1));
	}
}

package study1;

import java.util.Scanner;

public class ArrayCalc {
	// int[] 배열의 최댓값 구하는 메서드
	static int maxOfInt(int[] a) {
		int max = a[0];	
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max)
				max = a[i];
		}
		return max;
	}
	// int[] 배열의 최솟값 구하는 메서드
	static int minOfInt(int[] a) {
		int min = a[0];	
		for(int i = 1; i < a.length; i++) {
			if(a[i] < min) 
				min = a[i];
		}
		return min;
	}
	// int[] 배열의 총합 구하는 메서드
	static int sumOfInt(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	// int[] 배열의 평균 구하는 메서드
	static double avgOfInt(int[] a) {
		double avg = (double)sumOf(a) / a.length;
		return avg;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len;
		
		// 배열 길이를 입력 받아서 그 값을 크기로 하여 배열 생성
		do {
			System.out.println("배열 길이 입력(1~10): ");
			len = Integer.parseInt(sc.nextLine());
		} while(len < 1 || len > 10);
		
		int[] arr = new int[len];
		
		// 직접 값을 입력하여 배열 초기화
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "번 인덱스 값 입력: ");
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		// 배열의 최댓값, 최솟값, 총합, 평균 출력
		System.out.println();
		System.out.println("배열의 최댓값: " + maxOfInt(arr));
		System.out.println("배열의 최솟값: " + minOfInt(arr));
		System.out.println("배열의 총합: " + sumOfInt(arr));
		System.out.println("배열의 평균: " + avgOfInt(arr));
	}
}

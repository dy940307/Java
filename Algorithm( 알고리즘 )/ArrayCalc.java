package study1;

import java.util.Scanner;

public class ArrayCalc {
	
	// 배열의 최댓값 구하는 메서드
	static int maxOf(int[] a) {
		int max = a[0];
		
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max)
				max = a[i];
		}
		return max;
	}
	
	// 배열의 최솟값 구하는 메서드
	static int minOf(int[] a) {
		int min = a[0];
		
		for(int i = 1; i < a.length; i++) {
			if(a[i] < min) 
				min = a[i];
		}
		return min;
	}
	
	// 배열의 총합 구하는 메서드
	static int sumOf(int[] a) {
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	// 배열의 평균 구하는 메서드
	static double avgOf(int[] a) {
		int sum = sumOf(a);
		double avg = (double)sum / a.length;
		
		return avg;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len;
		
		// 배열 길이를 입력 받아서 그 값을 크기로 하여 배열 생성
		do {
			System.out.println("배열 길이 입력(1~10): ");
			len = sc.nextInt();
		} while(len < 1 || len > 10);
		
		int[] arr = new int[len];
		
		// 직접 값을 입력하여 배열 초기화
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열" + (i+1) + "번째 값 입력: ");
			arr[i] = sc.nextInt();
		}
		
		// 배열의 최댓값, 최솟값, 총합, 평균 출력
		System.out.println();
		System.out.println("배열의 최댓값: " + maxOf(arr));
		System.out.println("배열의 최솟값: " + minOf(arr));
		System.out.println("배열의 총합: " + sumOf(arr));
		System.out.println("배열의 평균: " + avgOf(arr));
	}
}

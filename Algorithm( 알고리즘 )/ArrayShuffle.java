package study1;

import java.util.Arrays;

public class ArrayShuffle {
	// 매개변수로 건네 받은 배열의 요소를 석는 메서드. 
	// 배열의 인덱스 번호를 random() 메서드를 활용해 인덱스 범위를 매번 다르게 해서 값을 바꾸게 한다.
	static void shuffleArray(int[] a) {
		for(int i = 0; i < a.length; i++) {
			int n = (int)(Math.random() * a.length); // 해당 배열의 인덱스 범위의 난수( 0 ~ 9 ).
			int tmp = a[0];
			a[0] = a[n];
			a[n] = tmp;
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

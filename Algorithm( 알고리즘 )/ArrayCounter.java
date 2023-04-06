package study1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayCounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		// 배열 크기 10( 인덱스 : 0 ~ 9 )
		int[] arr = new int[10];
		
		// 배열 난수 초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10) + 1; // 난수 범위( 1 ~ 10 )
		}
		
		// 빈도수 계산
		int[] count = new int[10];
		
		for(int i = 0; i < count.length; i++) {
			count[arr[i]-1]++; 
			// 빈도수를 체크할 값의 범위는 배열 크기를 벗어나면안 된다( 배열 인덱스 최댓값이 9인데 체크하려는 값이 9보다 크면 안 된다.
			// 하지만, 난수 1 ~ 10의 범위로 초기화 하였고, 저장된 값 중 10이 나올 경우 배열의 인덱스 범위를 벗어나 예외가 발생하기에 이 부분을 해결해야 한다.
			// 난수의 범위가 1 ~ 10이므로 배열 0번 인덱스가 잉여 공간이 된다. 값을 증가시킬 때 -1씩 해주어 값을 저장한다.
		}
		
		// 배열 값 출력
		System.out.println(Arrays.toString(arr));
		
		// 배열 빈도수 출력
		for(int i = 0; i < count.length; i++) {
			System.out.println(i+1 + "의 갯수: " + count[i]); // 빈도수 계산할 때 -1을 해서 넣었기에 출력할 때는 +1을 해주어야 한다.
		}
	}
}

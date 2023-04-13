package study;

import java.util.Arrays;

public class TwoArrayCopy {
	public static void main(String[] args) {
		// 1.1 얕은 복사( 대입 연산자, clone 메서드 )
		int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] array2 = array1;											
		int[][] array3 = array1.clone();									// 1차원 배열과 달리 2차원 배열은 clone 메서드를 사용해도 얕은 복사가 된다.
		
		array3[0][0] = 1000;												// 얕은 복사이므로 array3의 배열값을 변경하면 array1, array2의 값도 변경된다.	
		System.out.println("array1: " + Arrays.deepToString(array1));		// [[1000, 2, 3], [4, 5, 6], [7, 8, 9]]	
		System.out.println("array2: " + Arrays.deepToString(array2));		// [[1000, 2, 3], [4, 5, 6], [7, 8, 9]]
		System.out.println("array3: " + Arrays.deepToString(array3));		// [[1000, 2, 3], [4, 5, 6], [7, 8, 9]]
		System.out.println();

		
		// 1.2 깊은 복사( for문 ) : 행마다 열의 길이가 전부 같은 경우
		int[][] array4 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] array5 = new int[array4.length][array4[0].length];
		
		for(int i = 0; i < array5.length; i++) {
			for(int j = 0; j < array5[i].length; j++) {
				array5[i][j] = array4[i][j];
			}
		}
		
		array5[0][0] = 1000;												// 깊은 복사이므로 array4의 값은 변경되지 않음
		System.out.println("array4: " + Arrays.deepToString(array4));		// [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
		System.out.println("array5: " + Arrays.deepToString(array5));		// [[1000, 2, 3], [4, 5, 6], [7, 8, 9]]
		System.out.println();
		
		
		// 1.3 깊은 복사( for문 ) : 행마다 열의 길이가 다를 경우
		int[][] array6 = {{1, 2, 3}, {4, 5}, {6}};
		int[][] array7 = new int[array6.length][];							// 행마다 열의 길이가 다르므로 먼저 array6의 행 길이만큼만 배열 생성
		
		for(int i = 0; i < array7.length; i++) {
			array7[i] = new int[array6[i].length];							// 이후 array7의 행마다 array6의 열 길이만큼 배열 생성
			for(int j = 0; j < array7[i].length; j++) {
				array7[i][j] = array6[i][j];
			}
		}
		
		array7[0][0] = 1000;
		System.out.println("array6: " + Arrays.deepToString(array6));		// [[1, 2, 3], [4, 5], [6]]
		System.out.println("array7: " + Arrays.deepToString(array7));		// [[1000, 2, 3], [4, 5], [6]]
		System.out.println();
		
		
		// 1.4 깊은 복사( System.arraycopy ) : 행마다 열의 길이가 전부 같을 경우
		int[][] array8 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] array9 = new int[array8.length][array8[0].length];
		
		for(int i = 0; i < array8.length; i++) 
			System.arraycopy(array8[i], 0, array9[i], 0, array8[i].length);
		
		array9[0][0] = 1000;
		System.out.println("array8: " + Arrays.deepToString(array8));		// [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
		System.out.println("array9: " + Arrays.deepToString(array9));		// [[1000, 2, 3], [4, 5, 6], [7, 8, 9]]
		System.out.println();
		
		
		// 1.5 깊은 복사( System.arraycopy ) : 행마다 열의 길이가 다를 경우
		int[][] array10 = {{1, 2, 3}, {4, 5}, {6}};
		int[][] array11 = new int[array10.length][];
		
		for(int i = 0; i < array10.length; i++) {
			array11[i] = new int[array10[i].length];
			System.arraycopy(array10[i], 0, array11[i], 0, array10[i].length);
		}
		
		array11[0][0] = 1000;
		System.out.println("array10: " + Arrays.deepToString(array10));		// [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
		System.out.println("array11: " + Arrays.deepToString(array11));		// [[1000, 2, 3], [4, 5, 6], [7, 8, 9]]
	} 
}
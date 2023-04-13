package study;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		// 1. 얕은 복사
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = array1;
		
		array2[0] = 100;
		System.out.println("array1: " + Arrays.toString(array1));	// [100, 2, 3, 4, 5]
		System.out.println("array2: " + Arrays.toString(array2));	// [100, 2, 3, 4, 5]
		System.out.println();
		
		
		// 2.1 깊은 복사( for문 )
		int[] array3 = {1, 2, 3, 4, 5};
		int[] array4 = new int[array3.length];
		for(int i = 0; i < array4.length; i++) {
			array4[i] = array3[i];
		}
		
		array4[0] = 100;
		System.out.println("array3: " + Arrays.toString(array3));	// [1, 2, 3, 4, 5]
		System.out.println("array4: " + Arrays.toString(array4));	// [100, 2, 3, 4, 5]
		System.out.println();
		
		
		// 2.2 깊은 복사( Object.clone )
		int[] array5 = {1, 2, 3, 4, 5};
		int[] array6 = array5.clone();
		
		array5[0] = 100;
		System.out.println("array5: " + Arrays.toString(array5));	// [100, 2, 3, 4, 5]
		System.out.println("array6: " + Arrays.toString(array6));	// [1, 2, 3, 4, 5]
		System.out.println();
		
		
		// 2.3 깊은 복사( Arrays.copyOf )
		int[] array7 = {1, 2, 3, 4, 5};
		int[] array8 = Arrays.copyOf(array7, array7.length);	
		int[] array9 = Arrays.copyOf(array7, 3);					
		int[] array10 = Arrays.copyOf(array7, 10);				
		
		array7[0] = 100;
		System.out.println("array7: " + Arrays.toString(array7));	// [100, 2, 3, 4, 5]
		System.out.println("array8: " + Arrays.toString(array8));	// [1, 2, 3, 4, 5]
		System.out.println("array9: " + Arrays.toString(array9));	// [1, 2, 3]
		System.out.println("array10: " + Arrays.toString(array10));	// [1, 2, 3, 4, 5, 0, 0, 0, 0, 0]
		System.out.println();
		
		
		// 2.4 깊은 복사( Arrays.copyOfRange )
		int[] array11 = {1, 2, 3, 4, 5};
		int[] array12 = Arrays.copyOfRange(array11, 1, 5);
		int[] array13 = Arrays.copyOfRange(array11, 2, 4);	
		int[] array14 = Arrays.copyOfRange(array11, 0, 0);		
		
		System.out.println("array11: " + Arrays.toString(array11));	// [1, 2, 3, 4, 5]
		System.out.println("array12: " + Arrays.toString(array12));	// [2, 3, 4, 5]
		System.out.println("array13: " + Arrays.toString(array13));	// [3, 4]
		System.out.println("array14: " + Arrays.toString(array14));	// [] -> length 0
		
		
		// 2.5 깊은 복사( System.arraycopy ) : 이미 생성되어 있는 배열에다가 다른 배열의 요소를 복사할 때 사용( 앞의 복사 메서드들은 새로운 배열을 생성하면서 사용 가능 )
		int[] array15 = {1, 2, 3, 4, 5};
		int[] array16 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.arraycopy(array15, 0, array16, 0, 0);				// arr15의 0번 인덱스부터 복사, 복사한 것을 arr16의 0번 인덱스부터 붙여 넣는다. 복사할 요소의 길이는 0 )
		System.out.println("array16: " + Arrays.toString(array16));		// 10, 20, 30, 40, 50, 60, 70, 80, 90, 100
		System.arraycopy(array15, 0, array16, 0, 5);
		System.out.println("array16: " + Arrays.toString(array16));		// 1, 2, 3, 4, 5, 60, 70, 80, 90, 100
		// System.arraycopy(array15, 0, array16, 0, 10);			// 오류( 복사하려는 array15의 길이는 5인데 복사할 요소의 길이가 10이므로 범위를 벗어남 )
	} 
}

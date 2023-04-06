package study1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
    1. 내부 for문에서 배열의 값을 비교하면서 중복 여부를 체크한다.
    2. 중복 여부를 체크할 때 key가 되는 boolean 변수를 준비하고 false를 기본값으로 설정한다.
    3. 내부 for문에서 값을 비교하다가 같은 값이 나오면 boolean 변수를 true로 바꾸고 곧바로 내부 for문을 탈출시킨다.
    4. 내부 for문이 끝나면 boolean 변수가 fasle이면 중복된 값이 아니므로 새로운 배열에 대입, true이면 중복된 값이므로 대입을 하지 않는다.
    5. 그렇게 중복 값이 아닌 것만 저장한 배열을 리턴한다.
 */

public class ArrayDuplicateRemover {
	static int[] removeDuplicates(int[] a) {
		int len = a.length;
		int[] result = new int[len];
		int index = 0;
		boolean found;
	
		for(int i = 0; i < len; i++) {
			found = false;
			for(int j = 0; j < i; j++) {
				if(a[i] == a[j]) {
					found = true;
					break;
				}
			}
			if(!found) { // 내부 for문에서 중복값이면 found가 true, 중복값이 아니면 false이다. 
				result[index] = a[i];
				index++;
			}
		}
		
		// 중복된 값을 뺀 배열 리턴.
		return Arrays.copyOf(result, index);
		
	}
	public static void main(String[] args) {
		int arr[] = {1, 6, 4, 4, 5, 6, 1, 2, 5};
		int[] result = removeDuplicates(arr);
		
		System.out.println("기존 제거전 값: " + Arrays.toString(arr));
		System.out.println("중복 제거한 값: " + Arrays.toString(result));
	}
}

package study1;

import java.util.Arrays;

/*
    1. 내부 for문에서 배열의 값을 비교하면서 중복 여부를 체크한다.
    2. 중복 여부를 체크할 때 key가 되는 boolean 변수를 준비하고 false를 기본값으로 설정한다.
    3. 내부 for문에서 값을 비교하다가 같은 값이 나오면 boolean 변수를 true로 바꾸고 곧바로 내부 for문을 탈출시킨다.
    4. 내부 for문이 끝나면 boolean 변수가 fasle이면 중복된 값이 아니므로 새로운 배열에 대입, true이면 중복된 값이므로 대입을 하지 않는다.
    5. 그렇게 중복 값이 아닌 것만 저장한 배열을 리턴한다.
 */

public class ArrayDuplicateRemover {
	// int 배열의 중복값을 제거한 배열을 반환하는 메서드
	static int[] removeDuplicates(int[] a) {
		int[] tmpArr = new int[a.length];
		int idx = 0;
		boolean found;
	
		for(int i = 0; i < a.length; i++) {
			found = false;
			for(int j = 0; j < i; j++) {
				if(a[i] == a[j]) {
					found = true;
					break;
				}
			}
			if(!found)
				tmpArr[idx++] = a[i];	
		}
		// 중복 제거한 배열 리턴
		return Arrays.copyOf(tmpArr, idx);	
	}
	
	public static void main(String[] args) {
		// 배열 생성 및 중복 제거
		int arr[] = {1, 6, 4, 4, 5, 6, 1, 2, 5};
		int[] result = removeDuplicates(arr);
		
		// 중복 제거 전과 제거 후의 값 출력
		System.out.println("중복 제거 전: " + Arrays.toString(arr));	 // [1, 6, 4, 4, 5, 6, 1, 2, 5]
		System.out.println("중복 제거 후: " + Arrays.toString(result));	// [1, 6, 4, 5, 2]
	}
}

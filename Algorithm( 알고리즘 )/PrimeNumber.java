package study1;

/*
	1 ~ 1000의 소수 구하기.
	 - 세 가지 알고리즘 작성( 번호가 높아질수록 개선된 버전 )
 */

public class PrimeNumber {
	public static void main(String[] args) {
		
		// 1. 소수는 자기보다 작은 어떤 정수로도 나누어떨어지지 않는다.
		 // 자기보다 작은 값들이랑 비교. 나누어떨어지는 게 있으면 소수가 아니므로 비교 중단.
		 // 소수가 아닐 경우 자기보다 작은 값 전부 체크한다.
		
		int cnt1 = 0; // 나눗셈 횟수
		
		for(int i = 2; i <= 1000; i++) {
			int j;
			for(j = 2; j < i; j++) {
				cnt1++;
				if(i % j == 0)
					break;
			}
			if(i == j)
				System.out.println("첫 번째 알고리즘으로 구한 소수: " + i);
		}
		System.out.println("첫 번째 알고리즘의 나눗셈 횟수: " + cnt1); // 78022
		System.out.println( );
		
		
		// 2. 소수는 자기보다 작은 어떤 소수로도 나누어떨어지지 않는다
		 // n이 2 또는 3으로 나누어떨어지지 않으면 2x2인 4, 3x3인 6으로도 나누어떨어지지 않기에 자기보다 작은 모든 정수랑 나눗셈을 할 필요가 없다.
		 // 자기보다 작은 소수들이랑만 비교한다. 그리고 2를 제외한 짝수는 어차피 소수가 아니므로 홀수만 소수인지 체크한다.
		
		int cnt2 = 0; // 나눗셈 횟수
		int[] prime = new int[200]; // 소수 저장
		int idx = 0; // 소수 저장할 배열의 인덱스
		
		prime[idx++] = 2; // 소수 2는 비교할 필요가 없으므로 처음부터 저장
	
		for(int i = 3; i <= 1000; i += 2) {
			int j;
			for(j = 1; j < idx; j++) { // 자기보다 작은 소수들이랑만 비교하니까 소수를 저장하고 있는 prime 배열 크기까지만 for문 돌린다
				cnt2++;
				if(i % prime[j] == 0)
					break;
			}
			if(j == idx)
				prime[idx++] = i;
		}
		
		for(int i = 0; i < idx; i++) {
			System.out.println("두 번째 알고리즘으로 구한 소수: " + prime[i]);
		}
		System.out.println("두 번째 알고리즘의 나눗셈 횟수: " + cnt2); // 14622
		System.out.println( );	
	}
}

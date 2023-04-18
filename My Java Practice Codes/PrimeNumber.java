package study;

/*
	소수 판별 알고리즘 : https://st-lab.tistory.com/81
	 1번 알고리즘 : n이 소수인지 판별하기 위해 2부터 n보다 작은 자연수들로 나눠본다.
	 2번 알고리즘 : n이 소수인지 판별하기 위해 2부터 n의 제곱근 이하의 자연수들로 나눠본다.
	 3번 알고리즘 : 에라토스테네스의 체
	  - 위 세 가지 알고리즘으로 1부터 1000까지의 소수를 for문으로 출력시킨 후 실행 시간을 비교하여 성능 테스트.
	
	2번 알고리즘 설명
		1. n 은 소수인가?
		
		2. 2부터 n의 제곱근까지 나눠봤을 때 나눌 수  있는 수가 없으면 n은 소수이다.
		
		3. 예시
		 - 100은 소수인가?
		 - 100의 제곱근은 10이다.
		 - 2부터 100의 제곱근인 10까지의 수만 활용해서 100이 소수인지 체크한다. 2부터 10까지의 수들로 나누어지지 않으면 100은 소수다.
		 - 100 % 2 = 0 // 100은 2로 나누어떨어지므로 소수가 아니다. 그래서 나머지 '3 ~ 10'의 값까지 확인할 필요없다.
		
		4. 2부터 제곱근까지의 수로만 구해도 되는 이유
		 
		 100의 약수 : '1, 2, 4, 5, [10], 20, 25, 50, 100'
		  - 10을 기준으로 수가 대칭이 된다.
		  - (2x50), (4x25), (5x20)
		  - 2로 100을 나눌 수 있으면 2의 몫인 50으로도 100을 나눌 수 있다.
		  - 4로 100을 나눌 수 있으면 4의 몫인 25로도 100을 나눌 수 있다. 
		  - 5로 100을 나눌 수 있으면 5의 몫인 20으로도 100을 나눌 수 있다.
		
		  - 100이 소수인지 판별할 때 대칭이 되는 수를 기준으로 왼쪽에 있는 수만 나누면 된다. 
		  - 100이 소수인지 판별할 때 대칭이 되는 수를 기준으로  오른쪽에 있는 수는 전부 버려도 된다.
		  
	3번 알고리즘 설명
		1. 
*/

public class PrimeNumber{
	public static void main(String[] args) {
		long startTime, endTime;			// for문 실행 시간을 체크하기 위한 변수
		long elapsedTime1, elapsedTime2, elapsedTime3;	// 1 ~ 3번 알고리즘 실행 시간을 저장하기 위한 변수\
		
		// 1번 알고리즘
		startTime = System.nanoTime();
		for(int i = 2; i <= 1000; i++) {
			boolean found1 = false;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) { // 나누어떨어지는 수가 있는지 찾기
					found1 = true;
					break;
				}
			}
			if(!found1) // 나누어떨어지는 수를 못 찾았으면 소수
				System.out.println("첫 번째 알고리즘으로 구한 소수: " + i);
		}
		endTime = System.nanoTime();
		elapsedTime1 = endTime - startTime;
		
		System.out.println();
		
		// 2번 알고리즘
		startTime = System.nanoTime();
		for(int i = 2; i <= 1000; i++) {
			boolean found2 = false;
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					found2 = true;
					break;
				}
			}
			if(!found2)
				System.out.println("두 번째 알고리즘으로 구한 소수: " + i);
		}
		endTime = System.nanoTime();
		elapsedTime2 = endTime - startTime;
		
		System.out.println();
		
		System.out.println("첫 번째 알고리즘 실행 시간: " + elapsedTime1 + "ns");
		System.out.println("두 번째 알고리즘 실행 시간: " + elapsedTime2 + "ns");
    }
}

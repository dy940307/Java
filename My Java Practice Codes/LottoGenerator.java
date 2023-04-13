package study;

public class LottoGenerator  {
	
	// 배열 요소를 무작위로 섞을 때 사용하는 메서드
	static void shuffleArray(int[] a) {
		for(int i = 0; i < a.length; i++) {
			// 배열 인덱스 범위 내에서 배열 인덱스 무작위 생성
			int idx = (int)(Math.random() * a.length); 
			
			// 배열 요소 섞기
			int tmp = a[i];
			a[i] = a[idx];
			a[idx] = tmp;;
		 }
	 }
	
	public static void main(String[] args) {
		
		// 로또번호( 1 ~ 45 )
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
						11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 
						21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 
						31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
						41, 42, 43, 44, 45 };
		
		// 추첨된 로또번호 7개를 저장할 변수
		int[] ball7 = new int[7]; 
		
		// 로또번호 섞은 후 로또번호 7개 출력
		shuffleArray(ballArr);
		System.out.print("추첨된 로또번호 7개: ");
		for(int i = 0; i < ball7.length; i++) {
			ball7[i] = ballArr[i];
			System.out.print(ball7[i] + " ");
		}
	}
}

package study;

public class Multi99 {
	public static void main(String[] args) {
		
		/* x랑 y값 구하기용 코드
		for(int i = 0; i < 3; i++)
			System.out.println(i * 2 + 3);
		
		for(int j = 0; j < 5; j++)
			System.out.println(j % 5 + 1);
		
		System.out.println();
		*/
		
		
		/* 1. 아래와 같은 구구단 출력하기
			 2 x 1 = 2
			 2 x 2 = 4
			 2 x 3 = 6
			
			 5 x 1 = 5
			 5 x 2 = 10
			 5 x 3 = 15
			
			 8 x 1 = 8
			 8 x 2 = 16
			 8 x 3 = 24
		 */
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				int x = i * 3 + 2;
				int y = j % 3 + 1;
				
				System.out.printf("%d x %d = %d\n", x, y, x * y);
			}	
			System.out.println();
		}
		System.out.println();
		
		
		
		/* 2. 아래와 같은 구구단 출력하기
		 3 x 1 = 3
		 3 x 2 = 6
		 3 x 3 = 9
		 3 x 4 = 12
		 3 x 5 = 15

		 5 x 1 = 5
		 5 x 2 = 10
		 5 x 3 = 15
		 5 x 4 = 20
		 5 x 5 = 25

		 7 x 1 = 7
		 7 x 2 = 14
		 7 x 3 = 21
		 7 x 4 = 28
		 7 x 5 = 35
		*/
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				int x = i * 2 + 3;
				int y = j % 5 + 1;
				
				System.out.printf("%d x %d = %d\n", x, y, x * y);
			}
			System.out.println();
		}
		System.out.println();
	}
}

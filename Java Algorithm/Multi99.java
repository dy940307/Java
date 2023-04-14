package study;

public class Multi99 {
	public static void main(String[] args) {
		
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
		
		
		
		/* 3. 아래와 같은 구구단 출력하기
		
		2 x 1 = 2	3 x 1 = 3	4 x 1 = 4	
		2 x 2 = 4	3 x 2 = 6	4 x 2 = 8	
		2 x 3 = 6	3 x 3 = 9	4 x 3 = 12	
		
		5 x 1 = 5	6 x 1 = 6	7 x 1 = 7	
		5 x 2 = 10	6 x 2 = 12	7 x 2 = 14	
		5 x 3 = 15	6 x 3 = 18	7 x 3 = 21	

		8 x 1 = 8	9 x 1 = 9	
		8 x 2 = 16	9 x 2 = 18	
		8 x 3 = 24	9 x 3 = 27
		
		*/
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 3 ; j++) {
				int x = (j + 2) + i / 3 * 3;
				int y = i % 3 + 1;
				
				if(x > 9) // 9단까지만 출력
					break;
				
				System.out.printf("%d x %d = %d\t", x, y, x * y);
			}
			System.out.println();
			if(i % 3 == 2) // 4단, 7단 등의 줄바꿈에 활용하기 위한 if문
				System.out.println();
		}
	
	} // main의 끝
}

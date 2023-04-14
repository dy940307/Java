package study;

public class NumPatternPrinting {
	public static void main(String[] args) {
		
		// 1. 짝수 수열	 : 2, 4, 6, 8, 10...
		for(int i = 2; i <= 10; i += 2)
			System.out.print(i + " ");
		System.out.println();
		
		// 2. 짝수 수열 : 4, 8, 12, 16, 20...
		for(int i = 4; i <= 20; i += 4)
			System.out.print(i + " ");
		System.out.println();
		
		// 3. 홀수 수열 : 1, 3, 5, 7, 9...
		for(int i = 1; i <= 9; i += 2)
			System.out.print(i + " ");
		System.out.println();
		
		// 4. 홀수 수열 : 1, 9, 17, 25, 33...
		for(int i = 1; i <= 33; i += 8)
			System.out.print(i + " ");
		System.out.println();
		
		// 5. 짝수 수열 : 2, 2, 2, 4, 4, 4, 6, 6, 6, 8, 8, 8, 10, 10, 10...
		for(int i = 1; i <= 5; i++)
			for(int j = 1; j <= 3; j++) 
				System.out.print(i * 2 + " ");
		System.out.println();
		
		// 6. 짝수 수열 : 4, 4, 8, 8, 12, 12, 14, 14, 20, 20...
		for(int i = 1; i <= 5; i++)
			for(int j = 1; j <= 2; j++)
				System.out.print(i * 2 + " ");
		System.out.println();
		
		// 7. 홀수 수열 : 1, 1, 1, 3, 3, 3, 5, 5, 5, 7, 7, 7, 9, 9, 9...
		for(int i = 1; i <= 5; i++)
			for(int j = 1; j <= 3; j++)
				System.out.print(i * 2 - 1 + " ");
		System.out.println();
		
		// 8. 홀수 수열 : 1, 1, 1, 3, 3, 3, 5, 5, 5, 7, 7, 7, 9, 9, 9...
		for(int i = 1; i <= 5; i++)
			for(int j = 1; j <= 3; j++)
				System.out.print(i * 8 - 7 + " ");
		System.out.println();
		
		// 9. 순환 패턴( % ) : 1, 2, 3, 4, 5, 1, 2, 3, 4, 5...
		for(int i = 0; i < 10; i++) // 변수 초깃값 0
			System.out.println(i % 5 + 1);
		System.out.println();
		
		for(int i = 1; i <= 10; i++) // 변수 초깃값 1
			System.out.println((i - 1) % 5 + 1);
		System.out.println();
		
		// 10. 순환 패턴( % ) : 3, 6, 9, 3, 6, 9...
		for(int i = 0; i < 6; i++)
			System.out.println((i % 3 + 1) * 3);
		System.out.println();
		
		for(int i = 1; i <= 6; i++)
			System.out.println(((i - 1) % 3 + 1) * 3);
		System.out.println();
		
		// 11. 순환 패턴( % ) : 5, 4, 3, 2, 1, 5, 4, 3, 2, 1...
		for(int i = 0; i < 10; i++)	// 변수 초깃값 0
			System.out.println(5 - i % 5);
		System.out.println();
		
		for(int i = 1; i <= 10; i++) // 변수 초깃값 1
			System.out.println(5 - (i - 1) % 5);
		System.out.println();
		
		// 12. 반복 패턴( / ) : 1, 1, 1, 2, 2, 2, 3, 3, 3...
		for(int i = 0; i < 9; i++) // 변수 초깃값 0
			System.out.println(i / 3 + 1);
		System.out.println();
		
		for(int i = 1; i <= 9; i++)
			System.out.println((i - 1) / 3 + 1);
		System.out.println();
		
		// 13. 반복 패턴( / ) : 3, 3, 3, 2, 2, 2, 1, 1, 1...
		for(int i = 0; i < 9; i++)
			System.out.println(3 - i / 3);
		System.out.println();
		
		/* 14. 아래의 내용을 출력
		 	1 | 1
		 	2 | 1
		 	3 | 1
		 	4 | 2
		 	5 | 2
		 	6 | 2
		 	7 | 3
		 	8 | 3
		 	9 | 3
		 */
		for(int i = 1; i <= 9; i++) 
			System.out.printf("%d | %d\n", i, (i - 1) / 3 + 1);
		System.out.println();
		
		/* 15. 아래의 내용을 출력
		 	1 | 1
			2 | 2
			3 | 3
			4 | 1
			5 | 2
			6 | 3
			7 | 1
			8 | 2
			9 | 3
		 */
		for(int i = 1; i <= 9; i++)
			System.out.printf("%d | %d\n", i, (i - 1) % 3 + 1);
		System.out.println();
	}
}

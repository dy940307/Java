package study;

/*
   
   1. 반복 패턴( / )
    1
    1
    1
    2
    2
    2
    3
    3
    3
    
   2. 순환 패턴( % )
    1
    2
    3
    1
    2
    3
    1
    2
    3
  
 */

public class NumPatternPrinting {
	public static void main(String[] args) {
		
		/* 1. 순환 패턴 ( 1 ~ 10 ) ---- */
		System.out.println("-- 순환 패턴( 1 ~ 10 ) --");
		
		// 1.1 순환 패턴( 1 ~ 10 ) : 변수 초깃값 0
		for(int i = 0; i < 20; i++)
			System.out.println(i % 10 + 1);
		System.out.println();
		
		// 1.2 순환 패턴( 1 ~ 10 ) : 변수 초깃값 1
		for(int i = 1; i <= 20; i++) 
			System.out.println((i - 1) % 10 + 1);
		System.out.println();
		
		// 1.3 순환 패턴( 1 ~ 10 ) : 변수 초깃값 1
		for(int i = 1; i <= 20; i++)
		    System.out.println(i % 10 == 0 ? 10 : i % 10);
		System.out.println();
		
		
		
		/* 2. 순환 패턴 ( 10 ~ 1 ) ---- */
		System.out.println("-- 순환 패턴( 10 ~ 1 ) --");
		
		// 2.1 변수 초깃값 : 0
		for(int i = 0; i < 20; i++)
		    System.out.println(10 - (i % 10));
		System.out.println();
		
		// 2.2 변수 초깃값 : 1
		for(int i = 1; i <= 20; i++) 
			System.out.println(10 - ((i - 1) % 10));
		System.out.println();
		
		
		
		/* 3. 반복 패턴 ( 1 1 1, 2 2 2, 3 3 3... ) ---- */
		System.out.println("-- 반복 패턴( 1 1 1, 2 2 2, 3 3 3... ) --");
		
		// 3.1 변수 초깃값 : 0
		for(int i = 0; i < 15; i++)
			System.out.println(i / 3 + 1);
		System.out.println();
		
		// 3.2 변수 초깃값 : 1
		for(int i = 1; i <= 15; i++)
			System.out.println((i - 1 ) / 3 + 1);
		System.out.println();
		 // System.out.println(num >= 1 ? num : 10);
		
		
		/* 4. 반복 패턴 ( 10 10 10, 9 9 9, 8 8 8... ) ---- */
		System.out.println("-- 반복 패턴( 10 10 10, 9 9 9, 8 8 8... ) --");
		for (int i = 0; i < 30; i++)
		    System.out.println(10 - i / 3);
	}
}

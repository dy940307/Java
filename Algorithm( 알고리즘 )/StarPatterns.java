package study1;

public class StarPatterns {
	public static void main(String[] args) {
		
		System.out.println("---------------");
		System.out.println("1. 5x5 사각형");
		System.out.println("---------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println("---------------");
		System.out.println("2. 슬래시");
		System.out.println("---------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 4 - i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		System.out.println("3. 역슬래시");
		System.out.println("---------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
			
		System.out.println("---------------");
		System.out.println("4. X");
		System.out.println("---------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if((i == j) || (j == 4 - i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		System.out.println("5. 왼쪽 아래가 직각인 삼각형");
		System.out.println("---------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		System.out.println("6. 왼쪽 위가 직각인 삼각형");
		System.out.println("---------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		System.out.println("7. 오른쪽 아래가 직각인 삼각형");
		System.out.println("---------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		System.out.println("8. 오른쪽 위가 직각인 삼각형");
		System.out.println("---------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*	
		System.out.println("---------------");
		System.out.println("9. 왼쪽 아래가 직각인 사다리꼴");
		System.out.println("---------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 9; j++) {
				if(j <= 4 + i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		System.out.println("10. 오른쪽 아래가 직각인 사다리꼴");
		System.out.println("---------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 9; j++) {
				if(j >= 4 - i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		System.out.println("11. 왼쪽 위가 직각인 사다리꼴");
		System.out.println("---------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 9; j++) {
				if(j <= 8 - i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
			
		System.out.println("---------------");
		System.out.println("12. 오른쪽 위가 직각인 사다리꼴");
		System.out.println("---------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 9; j++) {
				if(j >= i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		System.out.println("13. 피라미드");
		System.out.println("---------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 9; j++) {
				if((j >= 4 - i) && (j <= 4 + i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
			
		System.out.println("---------------");
		System.out.println("14. 피라미드( 90도 회전 )");
		System.out.println("---------------");
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if((j <= i) && (j <= 8 - i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("---------------");
		System.out.println("15. 피라미드( 180도 회전 )");
		System.out.println("---------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 9; j++) {
				if((j <= 8 - i) && (j >= i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		System.out.println("---------------");
		System.out.println("16. 피라미드( 270도 회전 )");
		System.out.println("---------------");
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if((j >= i) && (j >= 8 - i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	
		System.out.println("---------------");
		System.out.println("17. 모래시계");
		System.out.println("---------------");
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				if((j <= 6 - i) && (j >= i) || (j <= i) && (j >= 6 - i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		System.out.println("18. 모래시계( 90도 회전 )");
		System.out.println("---------------");
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				if((j <= i) && (j <= 6 - i) || (j >= 6 - i) && (j >= i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("---------------");
		System.out.println("19. 마름모");
		System.out.println("---------------");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 9; j++) {
				if(((j >= 4 - i) && (j <= 4 + i)) && ((j <= 8 - i) && (j >= i)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		*/
	}
}



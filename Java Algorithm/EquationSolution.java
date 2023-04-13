package study;

/*
 
   [ 코드 내용 ]
    1.  방정식 2x + 4y = 10의 모든 해 구하기( x와 y의 범위는 0 ~ 10 ).
     - 출력 결과 예시 : x=1, y=2, x=3, y=1, ...
 
 */

public class EquationSolution {
	public static void main(String[] args) {
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				if(2 * x + 4 * y == 10)
					System.out.println("x=" + x + ", " + "y=" + y);
			}
		} // for문의 끝
	} // main의 끝
}

package study;

/*

   [ 코드 내용 ]
    1. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+4+5+6+7+8+9+10)의 결괏값 구하기.
     - i의 값이 1부터 10까지 1씩 증가하며 변하는 동안, i의 값을 누적해서 sum에 저장하면 sum의 값은 1, 3, 6, 10, 15, 21, 28, 36, 45, 55의 순서로 변해간다.
	 - 1부터 i까지의 합인 sum을 구하고, sum을 totalSum에 누적하여 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결괏값을 계산한다.
	 -------------------------------------------------------------------------------
	   i	sum				totalSum
	   1	1			 ->	1
	   2	1+2			 ->	1+(1+2)
	   3	1+2+3			 ->	1+(1+2)+(1+2+3)
	   4	1+2+3+4			 ->	1+(1+2)+(1+2+3)+(1+2+3+4
	   5	1+2+3+4+5		 ->	1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)
	   6	1+2+3+4+5+6		 ->	1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)+(1+2+3+4+5+6)
	   7	1+2+3+4+5+6+7		 ->	1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)+(1+2+3+4+5+6)+(1+2+3+4+5+6+7)
	   8	1+2+3+4+5+6+7+8		 ->	1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)+(1+2+3+4+5+6)+(1+2+3+4+5+6+7)+(1+2+3+4+5+6+7+8)
	   9	1+2+3+4+5+6+7+8+9	 ->	1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)+(1+2+3+4+5+6)+(1+2+3+4+5+6+7)+(1+2+3+4+5+6+7+8)+(1+2+3+4+5+6+7+8+9)
	   10	1+2+3+4+5+6+7+8+9+10	 ->	1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)+(1+2+3+4+5+6)+(1+2+3+4+5+6+7)+(1+2+3+4+5+6+7+8)+(1+2+3+4+5+6+7+8+9)+(1+2+3+4+5+6+7+8+9+10)
	 -------------------------------------------------------------------------------

 */

public class SumOfSequence {
	public static void main(String[] args) {
		int sum = 0, totalSum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
			totalSum += sum;
		}
		
		System.out.println(totalSum); // 220
	}
}
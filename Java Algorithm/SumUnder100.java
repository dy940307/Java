package study;

/*
   [ 코드 내용 ]
    1. 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100 이상이 되는지 구하기.
     - 합산을 구하는데 짝수일 때만 뺄셈을 진행하면 된다.
	

 */

public class SumUnder100 {
	public static void main(String[] args) {
		int sum = 0, count = 0;
		
		for(int i = 1; sum < 100; i++) {
			count++;
			
			if(i % 2 == 0)
				sum -= i;
			else
				sum += i;
		}
		System.out.println(count); // 199	
	}
}

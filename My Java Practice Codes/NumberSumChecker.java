package study;

/*
 
   [ 코드 내용 ]
    1. 1부터 얼마까지 더해야 100을 넘지 않는지 결과를 구하는 코드.
  	-- 출력 결과 -----------------------
  	0-0
	1-1
	2-3
	3-6
	4-10
	5-15
	6-21
	7-28
	8-36
	9-45
	10-55
	11-66
	12-78
	13-91
	1부터 13까지 더했을 때 100을 넘지 않습니다.
	---------------------------------
	
 */

public class NumberSumChecker {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
	       
        while(sum <= 100) {
        	System.out.println(num + "-" + sum);
            num++;
            sum += num;
        }
        
        // System.out.println(num); -> 14 : num이 14이므로 num에 아래 println에서는 'num - 1' 을 해주어야 한다.
        // System.out.println(sum); -> 15 : sum이 100을 초과해서 while문 탈출
        System.out.println("1부터 " + (num-1) + "까지 더했을 때 100을 넘지 않습니다.");
	}
}

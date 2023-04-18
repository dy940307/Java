package study;

import java.util.Scanner;

public class SumVerbose {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 0;
		
		// n값을 5로 입력하면 "1+2+3+4+5=15", 3을 입력하면 "1+2+3=6"이 출력된다
		do {
			System.out.print("n값 입력: ");
			n = Integer.parseInt(sc.nextLine().trim());
		} while(n < 1);
		
		// 1부터 n값 전까지 "i+"를 출력한다. 3을 입력하면 n값인 3이 되기 전의 "1+", "2+"를 출력한다.
		for(int i = 1; i < n; i++){
			System.out.print(i + "+");
			sum += i;
		}
		
		// 마지막 n값 출력. 3을 입력하면 앞의 for문에서 "1+", "2+"를 출력했고, 여기서 "3=6"을 출력해서 원하는 최종 결괏값인 "1+2+3=6"을 완성하게 된다.
		System.out.print(n + "=");
		sum += n;
		System.out.println(sum);
    }
}
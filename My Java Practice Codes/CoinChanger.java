package study;

import java.util.Scanner;

/*
	[ 기본 흐름 ]
	 1. 사용자로부터 입력받은 금액을 동전으로 거슬러주는 프로그램이다.
	 2. 사용자가 5,660원을 입력했으면 500원 11개, 100원 1개, 50원 1개, 10원 1개가 필요하듯이 이러한 동전 개수를 구한다.
	 3. 동전마다 개수가 설정되어 있다( ex : 500원 5개, 100원 5개... 등 ). 동전별로 설정된 개수만큼만 최대로 거슬러 줄 수 있다. 
	 4. 거슬러주어야 하는 동전 개수가 부족할 경우 설정된 개수를 전부 소모하고, 다른 동전으로 거슬러 줄 수 있는 만큼 최대한 거슬러준다.
	 5. 최대한 적은 동전으로 거슬러 주어야 하므로 500원 -> 100원 -> 50원 -> 10원, 큰 단위부터 계산한다.
	 6. 설정된 동전을 전부 소모해도 거슬러 줄 수 없는 큰 금액을 입력할 경우 돈을 전부 소모하고, 거스름돈이 부족하다고 알려준다.
	
*/

public class CoinChanger  {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int money;
		
		do {
			System.out.print("금액 입력: ");
			money = Integer.parseInt(sc.nextLine());
		} while( money < 0);
		
		int[] coinUnit = {500, 100, 50, 10};	// 단위별 동전
		int[] coinNums = {5, 5, 5, 5};		// 500원, 100원, 50원, 10원 동전의 개수
		
		
		// 입력받은 금액을 거슬러 주기 위해 필요한 동전 단위별 개수 구하는 과정( 최대한 동전을 적게 거슬러 주기 위해 큰 단위인 500원부터 체크한다 )
		 /* ex : 입력받은 금액이 2,600원이라면 500원의 경우 '2,600원 / 500원 = 5개', 500원 5개가 필요하다. 현재 가지고 있는 500원의 개수를 체크해서 얼마만큼 거슬러 줄 수 있는지 체크해서 거슬러준다. */
		for(int i = 0; i < coinUnit.length; i++) {
			// 동전 단위별로 거슬러 주어야 하는 동전 개수 구하기
			int coinCounts = 0;
			coinCounts = money / coinUnit[i];	
			
			// 동전 개수 차감하기
			if(coinNums[i] >= coinCounts) { 
				coinNums[i] -= coinCounts;
			} else { // 현재 동전 개수가 거슬러 주어야 할 동전 개수보다 부족할 경우 현재 남아있는 개수를 전부 차감시킨다
				coinCounts = coinNums[i];
				coinNums[i] = 0;
			}
			
			// 사용자가 입력한 금액 차감하기
			money -= coinCounts * coinUnit[i];
			
			// 동전 단위별로 몇 개씩 거슬러주었는지 대한 정보를 화면에 출력
			System.out.println(coinUnit[i] + "원: " + coinCounts);
		}
		
		// 현재 가지고 있는 동전을 전부 소모해서도 거슬러 주지 못했을 경우
		if(money > 0)
			System.out.println("거스름돈이 부족합니다.");
		
		// 남은 동전의 개수 출력
		System.out.println("--남은 동전의 개수-- ");
		for(int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원: " + coinNums[i]);
		}
	}
}       

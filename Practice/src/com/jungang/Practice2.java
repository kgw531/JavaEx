package com.jungang;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int money = 0;
		while(true) {
			System.out.println("=====================================");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
			System.out.println("=====================================");
			System.out.println("선택 > ");
			int input = scan.nextInt();
			
			
			
			switch (input) {
			case 1:
				System.out.println("예금액 > ");
				money = money + scan.nextInt();
				System.out.println("당신의 예금액은 " + money + "원 입니다.");
				break;
			case 2:
				System.out.println("출금액 > ");
				int outMoney = scan.nextInt();
				System.out.println("당신의 출금액은 " + outMoney + "원 입니다.");
				money = money - outMoney;
				break;
			case 3:
				System.out.println("잔고 > ");
				System.out.println(money);
				break;
				
			}
			
			
		}

	}

}

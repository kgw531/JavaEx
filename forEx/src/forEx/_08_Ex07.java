package forEx;

import java.util.Scanner;

public class _08_Ex07 {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		int money = 0;
		outter: //Label 붙여줌
		while(true) {
			
			System.out.println("=================================");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
			System.out.println("=================================");
			System.out.println("선택 > ");
			int input = scanner.nextInt();
			
			
			switch (input) {
			case 1:
				// 예금
				System.out.println("예금액 > ");
				money = money + scanner.nextInt(); // money += scanner.nextInt();
				if(money < 0) {
					System.out.println("금액을 다시 입력하세요.");
					money = scanner.nextInt();
				}else {
					System.out.println("사용자입력값 : " + money);
				}
				
				break; // break문이 없으면 다음 case를 계속해서 실행
			case 2:
				// 출금
				System.out.print("출금액 > ");
				int num = scanner.nextInt();
				if(money < num) {
					System.out.println("잔액이 부족합니다.");
				}else {
					money -= num;
				}
				break;
			case 3:
				// 잔고
				System.out.println("잔고 : " + money);
				break;
			case 4:
				// 반복문을 탈출
				// System.exit(0); 이렇게도 종료할 수 있다.
				
				break outter; // 라벨
				
			}
		
		}
		//자원을 반납!
		scanner.close();
		System.out.println("프로그램이 종료 되었습니다.");	
			
	}

}

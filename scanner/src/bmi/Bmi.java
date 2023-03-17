package bmi;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		// 스캐너 객체를 사용하기 위해 생성
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("--------BMI--------------");
			System.out.println("키를 입력해주세요(m) : ");
			Double height = scan.nextDouble();
			System.out.println("몸무게를 입력해주세요(kg) : ");
			Double weight = scan.nextDouble();
			
			double bmi = weight / (height * height);
			System.out.printf("당신의 BMI는 %.2f 입니다.\n", bmi);
			
			if(bmi <= 18.5) {
				System.out.println("저체중 입니다.");
			}else if(bmi <= 22.9) {
				System.out.println("정상 입니다.");
			}else if(bmi <= 24.9) {	
				System.out.println("과체중 입니다.");
			}else {
				System.out.println("비만 입니다.");
			}
			
			System.out.println("q를 누르면 종료.");
			if("q".equals(scan.next())) {// 스트링의 비교는 .equals()
				break; // 반복문 탈출
			} 
			System.out.println("-------------------------");
			
	
			
			}

	}

}

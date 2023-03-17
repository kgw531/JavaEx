package bmi;

import java.util.Scanner;

public class _02_bmi {

	public static void main(String[] args) {
		// 참조변수는 메모리의 주소값을 가지고있다.
		// 기본변수는 메모리에 값을 가지고 있다.
		Scanner scanner = new Scanner(System.in); //타입 변수명 = new 타입 (매개변수)
		while(true) {
			
			System.out.println("키를 입력해주세요(m) 숫자만 입력 가능합니다.");
			double height = scanner.nextDouble();
			
			System.out.println("몸무게를 입력해주세요(kg) 숫자만 입력 가능합니다");
			double weight = scanner.nextDouble();
			
			double bmi = weight / (height * height);
			System.out.printf("당신의 bmi는 %.1f 입니다. \n",bmi);
			
			//삼항 연산자
			String bmiRes = (bmi <= 18.5)?"저체중"
					:(bmi <= 22.9)?"정상"
							:(bmi <= 24.9)?"과체중":"비만" ;
			
			System.out.println(bmiRes + "입니다.");
			System.out.println("프로그램이 종료 되었습니다.");
			
			System.out.println("종료: q, 아무키나 누르면 재측정합니다.");
			String exit = scanner.next();
			if("q".equals(exit)) {
				break; // 반복문 탈출
			}
		}
		
		scanner.close();
		System.out.println("프로그램을 종료합니다.");
			
			
	}

}

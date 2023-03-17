package scanner;

import java.util.Scanner;

public class Prc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("키를 입력하세요");
			double h = scan.nextDouble();
			System.out.printf("당신의 키는 %.2f 입니다. \n", h);
			
			System.out.println("몸무게를 입력하세요. ");
			double w = scan.nextDouble();
			System.out.printf("당신의 몸무게는 %.2f 입니다. \n", w);
			
			double bmi = w / (h*h);
			System.out.println("당신의 bmi는 " + bmi + " 입니다.");
			
//			if(bmi <= 18.5) {
//				System.out.println("저체중 입니다.");
//			}else if(bmi <= 22.5) {
//				System.out.println("정상 입니다.");
//			}else if (bmi <= 24.5) {
//				System.out.println("과체중 입니다.");
//			}else {
//				System.out.println("비만 입니다.");
//			}
			
			String fat;
			fat = (bmi <= 18.5)?"저체중 입니다":(bmi <= 22.5)?"정상 입니다.":(bmi <= 24.5)?"과체중 입니다.":"비만입니다.";
			System.out.println(fat);
			
			System.out.println("q를 누르면 종료되고 다른 키를 누르면 재측정합니다.");
			if("q".equals(scan.next())) {
				break;
			}
				System.out.println("안녕");
		System.out.println("수정");
			
		}
	
	}

}

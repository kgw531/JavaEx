package scanner;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신의 나이를 입력하세요. : \n");
		int age = scan.nextInt();
		System.out.printf("당신의 키는 %d 입니다.", age);
		
		System.out.println("키를 입력하세요. : ");
		String height = scan.next(); // 입력을 기다리고 입력을 height에 저장
		System.out.printf("당신의 키는 %s 입니다.\n\n", height);
		Double height2 = Double.parseDouble(height);
		
		System.out.println("몸무게를 입력하세요. : ");// 앞의 입력을 기다리고 입력이 끝나면 출력된다
		String weight = scan.next(); 
		System.out.printf("당신의 몸무게는 %s 입니다.\n\n", weight);
		double weight2 = Double.parseDouble(weight);
		
		System.out.printf("당신의 bmi는 %.2f 입니다.", weight2 / (height2 * height2));
		scan.close();
	}

}

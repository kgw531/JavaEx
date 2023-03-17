package Ex;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		//1
		String name = "김자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		
		System.out.println("이름: " + name);
		System.out.print("나이: " + age + "\n");
		System.out.printf("전화: %s-%s-%s", tel1,tel2,tel3);
		
		System.out.println("-----------------------------");
		
		
		//2 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 수: ");
		String str1 = scan.next();
		
		System.out.println("두 번째 수: ");
		String str2 = scan.next();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int res = num1 + num2;
		
		System.out.println("덧셈 결과: " + res);
		System.out.println("-----------------------------");
		
		// 3
		
		String n = scan.next();
		System.out.println("이름: " + n);
		
		
		int i = scan.nextInt();
		System.out.println("주민 번호 앞 6자리: " + i);
		
		String call = scan.next();
		System.out.printf("전화번호 : %s", call);
		
		
		
		
		
		
	}

}

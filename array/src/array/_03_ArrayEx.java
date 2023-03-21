package array;

import java.util.Scanner;

public class _03_ArrayEx {

	public static void main(String[] args) {
		//new 연산자로 배열을 생성하는 방법
		//String 타입의 배열을 만들어주세요.	
		// 총 길이는 10칸으로 생성
		// String[] names = new String[10];
		String[] names = {"",""};
		int[] score;
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 개의 방을 만들까요?");
		int index = scan.nextInt();
		score = new int[index];
		
		
			names[0] = "홍길동";
			names[1] = "김건우";
			for(int i = 0; i < names.length; i++) {
				System.out.println(names[i]); // 초기화된 값만 나오고 나머지는 null로 처리
			}
		// 타입[] 변수명 = new 타입[길이]; 길이 = 변수명.length
		// 타입에 맞게 기본값으로 초기화되어 값이 입력된다.
		// 배열의 초기값: 정수 0, 실수 0.0, false, 객체 null
		// 선언한 배열의 길이는 변하지 않는다. 줄이거나 늘일 수 없다.
		
	
		
	}

}

package com.jungang;

public class Bmi {//클래스 선언문, 구조: 접근제한자 class 클래스명
	
	// 클래스 블럭에서 작성한 변수 : 필드 -> 속성을 정의
	
	// 변수의 사용범위 : 시작블럭{이후 선언된 변수는 종료블럭을} 만나면 사라진다.
	// 매서드 블록 내부에서 선언된 변수는 블럭 내부에서만 사용 가능
	// 다른 명령문장에서 블럭이 열리면 마찬가지로 블럭 내부에서만 사용 가능하다.
			
	

	public static void main(String[] args) {// 메인 메소드: 실행을 담당, 메소드의 선언문, 구조: 접근제한자 리턴타입(여기선 void) 메소드명 (매게변수의 타입 변수명)
		// void : 리턴타입이 없는 경우
        double bmi = 50 / (1.6 * 1.6);
		System.out.println("당신의 bmi는 " + bmi + "입니다.");
		
		// 정수를 담을 수 있는 변수 선언 value
		int value;
		
		// 정수 변수 sum을 생성하고 20으로 초기화
		int sum = 20;
		
		// value를 10으로 초기화
		value = 10;
		
		System.out.println(sum + 20 + value); // sum에 value 값과 20을 더해준다.
		
		
		System.out.println("-------------------");
		
		
		// 조건문, 구조: if (조건문) { }
		// 만약()안의 조건이 참이면 {}코드블럭을 실행
		// 참/거짓 = true/false -> 예약어
		if(1 < 0) {
			
			System.out.println("1<0");
			
		}
		if(true) {
			System.out.println(true);
			System.out.println("true");
			
		}
		if(false) {
			System.out.println(false);
			System.out.println("false");
		}
		
	}

}

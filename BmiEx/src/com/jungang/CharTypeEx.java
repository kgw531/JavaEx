package com.jungang;

public class CharTypeEx {

	public static void main(String[] args) {
		// 문자 리터럴
		// 유니코드
		
		char var1 = 'A'; // 문자일 땐 홀따옴표, char타입은 홀따옴표 안에 하나의 문자만 저장
		char var2 = '오';
		char var3 = 65;
		char var4 = 0x0041;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		System.out.println("---------------------");
		
		// 타입 변환: ()안에 타입을 넣어준다.
		System.out.println((int)var1); // 명시적 형변환
		System.out.println((int)var2);
		System.out.println((int)var3);
		System.out.println((int)var4);
		
		
		String var5 = "문자열 저장"; // String은 문자열을 저장
		
		// 자동 형변환, 명시적 형변환
		
		System.out.println("---------------------------");
		
		//이스케이프 문자
		System.out.println("\""); 
		System.out.println("나는 \n오늘\n\'순대국\'이\n먹고싶다");
		System.out.println("\\");
		
		//long 타입
		long var6 = 1234567891535456l; // 정수의 리터럴이 입력되면 int타입으로 받기 때문에 int의 범위를 벗어나게 되면 오류, 그래서 끝에 l 또는 L을 붙여줌
		
		System.out.println("--------------실수 출력-----------");
		
		//실수타입 : float, double
		double var8 = 0.1231452353412313213131312313135; 
		float var7 = 0.1234512321414235525253252423432423414123f; // 실수의 리터럴이 입력되면 double형으로 받아들이기 때문에 float타입의 경우 끝에 f를 붙여줘야 한다.
		float var9 = 5e-3f; // 5 * 10^-3
		
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		
		// 논리 리터럴
		boolean var10 = true;
		boolean var11 = false;
		
		// 참, 거짓을 판단, 문자열과는 다름
		if(true) {
			System.out.println(true);
		}
		if(false) {//참일때 작동
			System.out.println("true");
		}else {// 거짓일 때 작동
			System.out.println("boolean 출력확인");
			System.out.println("false");
		}
		
	
		
		
	}

}

package com.jungang;

public class Literal {

	public static void main(String[] args) {
		// 숫자로 입력할 때 2진수, 8진수, 16진수로 입력이 가능하다
		int i = 0b1011; // 0b로 시작하면 2진수
		int j = 013; // 0으로 시작하면 8진수
		int k = 0xB3; // 0x로 시작하면 16진수
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		// 실습
		// byte 값의 허용범위 : -128~127(127인 이유는 0이 포함되기 때문)
		// 리터럴은 값 그 자체를 의미한다
		// 값이 입력되면 정수를 int, 실수는 double로 받는다. 그 이후에 형변환
		byte var1 = 127;
		byte var2 = -128;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = -30;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		
		
		
		
		
		
		
		
	}

}

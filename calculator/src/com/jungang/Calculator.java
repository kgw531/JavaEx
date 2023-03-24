package com.jungang;

public class Calculator {
	// 필드
	// 접근제한자를 붙이지 않으면 default값
	private String name; // private : 외부에서 접근하지 못하게 해서 main에서 오류
	
	
	
	
	//메서드 만드는법
	// 접근 제한자 + 반환타입 + 메서드명(매개변수타입 변수명){}
	// 정수의 합계를 구하는 메서드 : 두 수를 입력받아 두 수의 합을 반환
	
	// 생성자의 특징
		// 1. 클래스의 이름과 동일한 이름을 가지고 있다.
		// 2. 반환타입이 없다.
	// 생성자는 new 연산자를 만나서 객체가 생성될 때 실행된다.
	public Calculator() {
		name = "정수계산기";
		System.out.println(name);
	} // 이 생성자가 없어도 컴파일러가 자동으로 기본 생성자를 생성해서 에러가 뜨지 않는다.
	
	
	/**
	 * 두개의 정수를 입력받아 두 수의 합을 반환
	 * @param num1
	 * @param num2
	 * @return	num1 + num2
	 */
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
}

package com.objectEx;

/**
 * 1.API
 * -API는 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스를 뜻한다
 * - 자바에서는 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모음을 말한다.
 * @author user
 *
 */

public class ObjectEx {
	public static void main(String[] args) {
		String str = " ";
		print(str);
		System.out.println("================================");
		int num = 0;
		// int -> Integer(자동 형변환), double -> Double(자동형변환)
		// 기본타입은 값 자체를 저장하고 참조타입은 주소를 저장한다.
		// int 타입은 기본타입이므로 Object 타입으로 변환 되지못한다. int 타입을 객체형태로 변환해야한다. --> Wrapper 클래스인 Integer 타입으로
		// 자동형변환되어져서 들어간다.

		print(num); 
		System.out.println("===============================");
		ObjectEx objEx = new ObjectEx();
		print(objEx);
	
		
	}
	// 참조타입의 최상위 계층 : Object
	public static void print(Object obj) {
		// Object 클래스에 toString이 정의되어 있지만
		// 메서드의 오버라이딩에 의해 String 클래스, Integer 클래스에 정의되어 있는 메서드가 호출된다.
		System.out.println(obj.toString());
	}
}

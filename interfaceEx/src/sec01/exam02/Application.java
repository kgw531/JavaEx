package sec01.exam02;

import sec01.exam01.Audio;

public class Application {

	public static void main(String[] args) {
		// 기본 생성자를 이용하여 객체를 생성 후 레퍼런스변수
		// 참조타입변수에 저장
		MyClass myclass = new MyClass();
		
		// MyClass의 필드에 접근하여 메서드 호출
		// smartTv생성
		
		
		// 1. 인터페이스가 필드에 사용된 경우
		// 1-1. myClass에 접근하여 메ㅓ드를 호출(smartTv 생성되어 있음
		myclass.rc.turnOn();
		myclass.rc.setVolume(6);
		myclass.rc.turnOff();
		
		// 1-2 필드에 새로운 객체를 생성하여 저장
		myclass.rc = new Audio();
		myclass.rc.turnOn();
		myclass.rc.setVolume(6);
		myclass.rc.turnOff();
		System.out.println("======================");
		
		// 2. 인터페이스가 생성자의 매개변수로 이용된 경우
		// 인터페이스의 구현체를 생성하여 매개변수로 전달
		MyClass myclass1 = new MyClass(new Audio());
		myclass1.rc.turnOn();
		myclass1.rc.setVolume(2);
		myclass1.rc.turnOff();
		System.out.println("=======================");
		
		//3. 인인인터페이스가 메서드의 매개변수로 이용된 경우
		MyClass myclass2 = new MyClass();
		
		// 인터페이스가 메서드의 매개변수 타입으로 사용될 경우 메서드 호출시 구현 객체를 매개값으로 대입한다.
		myclass2.methodB(new Audio() ); // 인터페이스의 구현체를 넣는다
		myclass2.rc.turnOn();
		myclass2.rc.setVolume(3);
		myclass2.rc.turnOff();
		System.out.println("=======================");
		
		MyClass myclass3 = new MyClass();
		// 4. 메서드에 선언된 로컬변수로 rc에 저장
		myclass3.methodA();
		myclass2.rc.turnOn();
		myclass2.rc.setVolume(4);
		myclass2.rc.turnOff();
		
		
		
		
	}

}

package sec01.exam02;

import sec01.exam01.Audio;
import sec01.exam01.RemoteControl;
import sec01.exam01.SmartTv;

public class MyClass {
	// 인터페이스는 생성할 수 없다.
	// 인터페이스는 필드, 생성자의 매개변수, 메서드의 매개변수,  매서드의 로컬변수의 타입으로 선언할 수 있다.
	// 이것이 다형성..
	
	// 인터페이스가 필드의 타입의로 선언된 경우 인터페이스의 구현체만 인터페이스를 타입으로 사용할 수 있다.
	RemoteControl rc = new SmartTv();
	
	public MyClass() {
		
	}
	
	public MyClass(RemoteControl rc) {
		// 매개변수로 받아온 rc를 필드에 저장
		this.rc = rc;
	}
	
	public void methodA() {
		// 인터페이스 타입으로 지역변수 생성
		RemoteControl rc = new Audio();
		this.rc = rc;//생성된 객체를 필드에 저장
		
		
	}
	public void methodB(RemoteControl rc) {
		// 매개변수로 넘어온 rc를 필드에 저장
		this.rc = rc;
		
	}
	
	
	
	
}

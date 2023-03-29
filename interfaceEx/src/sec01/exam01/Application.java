package sec01.exam01;

public class Application {

	public static void main(String[] args) {
		// 인터페이스는 생성할 수 없지만 참조변수의 타입으로 사용할 수 있다.
		// 인터페이스타입 변수 = new 구현객체();
		
		//인터페이스의 다형성
		// 인터페이스의 구현체는 인터페이스를 타입으로 가질 수 있다.
		RemoteControl rc = new Audio();
		// Audio rc = new Audio();도 가능해
		rc.turnOn();
		rc.setVolume(4);
		rc.turnOff();
		
//		RemoteControl tv = new Televison();
//		tv.turnOn();
//		tv.setVolume(4);
//		tv.turnOff();
		
		// Tv를 추상클래스로 두고 smartv가 상속받음
		RemoteControl smartTv = new SmartTv();
		smartTv.turnOn();
		smartTv.setVolume(-1);;
		smartTv.turnOff();
		
		// 다 가능
		Searchable searchable = new SmartTv();
		Televison tv = new SmartTv();
		RemoteControl rc1 = new SmartTv();
		
		
	}

}

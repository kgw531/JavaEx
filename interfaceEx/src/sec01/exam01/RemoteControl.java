package sec01.exam01;

public interface RemoteControl {
	// 생성자를 가질 수 없다.
	// 인스턴스 필드도 가질 수 없다. -> 상수 사용가능
	// 추상 메서드를 가지고 있다.
	
	// static final을 자동으로 붙여준다
	//  자동으로 상수
	public int MAX_VALUE = 10;
	public int MIN_VALUE = 0;
	
	
	// 추상메서드
	// 자동으로 추상메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	
	
	
	
}

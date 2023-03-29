package sec01.exam04;

public class Car {
	// 인터페이스는 객체를 생성할 수 없다.
	// 인터페이스의 구현체인 경우,
	// 인터페이스를 참조변수의 타입으로 인터페이스의 구현체를 생성 후 인터페이스의 타입으로 
	
	Tire tire;
	
	Car(Tire tire){
		this.tire = tire;
	}
	
	public void run() {
		tire.roll();
	}

}

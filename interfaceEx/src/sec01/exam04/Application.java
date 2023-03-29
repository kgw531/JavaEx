package sec01.exam04;

public class Application {

	public static void main(String[] args) {
		//다형성
		// 메서드의 재정의
		
		// 생성자의 매개변수의 타입으로 인터페이스를 사용하고 있으므로 인터페이스의 구현체를 매개변수로 넣어줘야 한다.
		// 인터페이스의 구현체는 추상메서드를 모두 구현해야하며 구현체가 구현한 메서드가 실행됩니다.
		Car kumho_car = new Car(new KumhoTire());
		Car hankook_car = new Car(new HankookTire());
		
		kumho_car.run();
		System.out.println("==================");
		hankook_car.run();

	}

}

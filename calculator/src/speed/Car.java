package speed;

public class Car {
	public int speed;
	
	
	// 필드 : 속성을 정의
	
	
	
	// 생성자 : new 연산자에 의해 객체를 생성할 때 호출
	// 기본 생성자
	// speed를 매개 변수로 받는 생성자 
	public Car() {
		
		
	}
	public Car(int speed) {
		this.speed = speed; //초기화
		
	}
	
	
	// 메서드: 기능을 정의
	// getSpeed() : int
	public int getSpeed() {
		return speed;
		
	}
	
	// keyTurnOnOp(): void
	public void keyTurnOnOp() {
		System.out.println("시동을 켭니다.");
		
	}
	
	// run():void
	// 속도를 10씩 증가시키면서 50까지 속도를 출력합니다.
	public void run() {
		for(int i = 0; i <= 50; i+=10) {
			System.out.println("i = " + i);
			speed = i;
			 System.out.println("시속 : " + speed + "km/h");
		}
		
	}
	
	public static void main(String[] args) { // 스태틱 타입은 생성 한 후 출력해야 한다.
		 Car car = new Car();
		 car.keyTurnOnOp();
		 car.run();
		 int speed = car.getSpeed();
		 System.out.println("시속 : " + speed + "km/h");
	}
	
	

}

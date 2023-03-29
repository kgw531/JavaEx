package sec01.exam05;

public class Driver {
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive(new Bus());// 인터페이스의 구현체를 생성하여 매개변수에 넣어준다.
		
		driver.drive(new Taxi());
	}
	
	
	public void drive(Vehicle vehicle) {
		vehicle.run();
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		Bus bus = (Bus)vehicle; // 원래 타입으로 강제 형변환
		bus.checkFare();
	}
}

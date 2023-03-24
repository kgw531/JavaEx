package car.overloading;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		
		
		// 생성자를 호출할 때는 생성자의 매개변수타입에 맞춰서 순서대로 입력해줘야 한다.
		System.out.println("car ==================");
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.maxSpeed);
		
		Car car1 = new Car("그랜저");
		System.out.println("car1 ==================");
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxSpeed);
		
		Car car2 = new Car("bmw", 200);
		System.out.println("car2 ==================");
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxSpeed);
		
		Car car3 = new Car("소나타", "블랙", 200);
		System.out.println("car3 ==================");
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println(car3.maxSpeed);

	}

}

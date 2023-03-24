package car.object;

public class Person {

	public static void main(String[] args) {
		
		Car car = new Car(); // 기본생성자 이용
		
		car.company = "르노삼성";
		System.out.println("company ; " + car.company);
		System.out.println("speed : " + car.speed);
		car.speedup();
		System.out.println("car.speedup()");
		System.out.println("speed : " + car.speed);
		car.speed = 100;
		System.out.println("car.speed = 100");
		System.out.println("speed : " + car.speed);
	}

}

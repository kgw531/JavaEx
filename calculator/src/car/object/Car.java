package car.object;

public class Car {
	// 필드
	// 값을 초기화 하지 않으면 초기값을 입력
	String company = "현대 자동차";
	String model = "그랜저";
	int speed;
	boolean engineStart;
	
	public Car(String company) {// 필드의 이름과 매개변수의 변수명이 동일한 경우 지역변수인 매개 변수가 우선됨
		// 결과적으로 블록 내부에서 company값은 매개변수의 값을 가리키고 있다.
		// this : 생성된 객체를 의미
		this.company = company; //company 필드에 접근해서 초기화, 이 company는 생성자의 매개변수의 변수명을 받는다.
	}


	public Car() { // 기본 생성자 : 매개변수가 없는 생성자
		// 생성자를 만들지 않으면 컴파일러가 자동으로 만들어주는 생성자.
		// 생성자를 하나라도 만들면 자동으로 만들어주지 않는다.
		
		// TODO Auto-generated constructor stub
	}


	public void speedup() {
		speed += 10;
	}
	

}

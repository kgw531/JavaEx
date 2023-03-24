package car.overloading;

public class Car {
	//필드 생성
	String model;
	String color;
	int maxSpeed;
	
	
	// 생성자의 오버로딩 -> 오버라인과 비교하여 이해하기
	// 매개변수의 타입, 개수, 순서가 다르게 여러 개를 선언
	
	// 생성자의 특징
	// 1. 반환타입이 없다.
	// 2. 클래스명과 같은 타입을 사용한다.
	public Car() {
		// this. : 필드, this():생성자
		this("기본모델","블랙",150); 
		
	} // 기본 생성자
	public Car(String model){
		// model = model;  -> 코드블럭 안에서는 로컬변수가 우선되므로, 아무런 의미가 없음
		//this.model = model; //파란색model은 필드이고, 나중에 나오는 model은 메인메소드에서 Car클래스를 이용해 생성한 생성자의 매개변수 값이다.
		this(model,"",150);  // this(model,null,0) 이런 것도 가능~
	}
	 
	public Car(String model, String color) {
		//this.model = model;
		//this.color = color;
		this(model,color,150);
	} 
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	} 
	public Car(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		
	} 
	// 이름이 같지만 타입이 다르거나 갯수가 다르게 작성하여(매개변수들을 다르게) 오버로딩해준다.
	
	

}

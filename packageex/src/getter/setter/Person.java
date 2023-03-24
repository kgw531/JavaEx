package getter.setter;

public class Person {
	//상수는 static final로 선언된 ㄱ
	static final double PI = 3.141592;
	static final double ERRTH_RADIUS = 6400;
	
	
	// 상수 : 한 번 값이 정해지고 나면 수정이 불가능
	final String nation = "korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
		
		//this.ssn = "123456-1234567"; -> 상수는 값을 변경하는 것이 불가능
		this.name = "정찬우";
		
	}

}

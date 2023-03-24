package package2;

import java.util.Calendar;



public class C {
	// B b = new B(); -> 접근제한자가 default라서 오류
	
	
	//생성자에 private을 붙이면?
	private C(){ // 이 떈 외부에서 생성자를 쓰지 못하게 막음 - > new를 못써
		// 싱글톤 방식에서 많이 이용
		
		
	}
	
	public C(int i) {
		this();
		
	}
	
	// 메서드
	public void method1() {
		System.out.println("method1");
		method2();
	}
	private void method2() {
		System.out.println("method2");
	}
	

}

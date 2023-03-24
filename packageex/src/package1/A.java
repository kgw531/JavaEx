package package1;

import package2.C;


public class A { // 접근 제한자는 한 개만 붙여줄 수 있다.
	// 필드를 작성하는 곳
	C c = new C(1);
	B b = new B();
	
	
	
	// 여기선 코드 작성 불가
	// c.d(); -> 작동 안됨
	
	// 기능 정의
	public void method1() {
		c.method1();// c.했을 때 method2는 보여주지 않아. 접근제한자가 private이기 떄문에
		
	}
}

class B{
	// default일 경우 같은 패키지에서 호출 가능.
	 B() {
		
		
	}
	
}

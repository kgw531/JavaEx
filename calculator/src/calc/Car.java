package calc;

public class Car {
	int gas;
	
	// 생성자 : gas 초기화
	public Car(int gas) { // 매개변수 선언 => 타입 명시
		this.gas = gas;
		
		
		
	}
	// 달립니다. 츨력
	public void run1() {
		System.out.println("달립니다.");
		// 내부 메서드를 호출합니다.
		stop();
		// 이름, 매개변수의 갯수, 타입이 일치하는 메서드를 찾아 실행한다.
		sound("빵빵");
	}
	
	// stop 멈춥니다. 출력
	public void stop() {
		System.out.println("멈춥니다.");
	}
	// sound 빵빵 출력
	public void sound(String sound) {
		System.out.println(sound);
	}
	
	public void run() {
		while(true) {
			if(gas > 0) {
				gas -= 1; // gas -= 1;, gas = gas -1, gas--
				System.out.println("달립니다.");
				System.out.println("남은 기름의 양 : " + gas);
			}else {
				System.out.println("기름이 떨어졌어요!");
				System.out.println("남은기름양 : " + gas);
				//break
				return; // 메서드 강제 종료
			}
			
			
		}
	}
	
	// 타입이 boolean일 때 변수명에 is를 붙이는 경우가 많다
	// 기름이 0이면 false를 반환
	public boolean isLeftGas() {
		if(gas > 0) {
			return true;
				
		}else {
			return false;
		}
		
	}
	
}

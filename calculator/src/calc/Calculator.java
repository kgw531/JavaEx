package calc;

public class Calculator {
	// true: 켜짐, false: 꺼짐
	boolean powerOn;
	
	
	/**
	 * 전원을 키거나끈다.
	 */
	
	public void powerOn() {
		if(powerOn) {
			powerOn = false;
			System.out.println("계산기를 종료합니다.");
		}else{
			powerOn = true;
			System.out.println("계산기를 실행합니다.");
		}
		
	
	}
	public int add(int num1 ,int num2){
		if(powerOn) {
			return num1 + num2;
		}else {
			System.out.println("계산기를 실행해주세요.");
			return  0;
		}
		
	}
	
	public int add(int[] numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		return sum;
	}
	
	// int 타입이 여러 개 입력 => 배열을 받아서 사용
	public int addFn(int ... numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		return sum;
		
	}
		

}

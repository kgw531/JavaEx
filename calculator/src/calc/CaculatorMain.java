package calc;

public class CaculatorMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.powerOn();
		// 매개변수의 타입과 갯수가 일치하지 않을 때 오류가 난다.
		int res = calc.add(5,5);
		System.out.println(res);
		System.out.println("-----------------");
		
		int[] numbers = {1,2,3,4,5};
		System.out.println("calc.add(numbers) : " + calc.add(numbers));
		
		//메서드를 실행할 때 배열을 생성
		calc.add(new int[] {1,2,3});
		System.out.println("calc.add(new int[] {1,2,3}) : " + calc.add(new int[] {1,2,3}));
		
		// addFn 이용
		calc.addFn(1,2,3,4,5,6);
		System.out.println("calc.addFn : " + calc.addFn(1,2,3,4,5,6));
		
	}

}

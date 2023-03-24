package exam06;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		// 정사각형의 넓이
		double rectangle = calc.areaRectangle(4);
		System.out.println("정사각형의 넓이 : " + rectangle);
		// 직사각형의 넓이
		System.out.println("정사각형의 넓이 : " + calc.areaRectangle(1,2));
	}

}

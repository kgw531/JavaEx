package objectEx;

public class _02_CalculatorMain {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int res = calc.add(5,3);
		System.out.println("두 수의 합 : " + res);
	}
}
package objectEx;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int res1 = calc.add(5,3);
		System.out.println("두 수의 합 : " + res1);
		
		Calculator2 calc2 = new Calculator2();
		double res2 = calc2.multiplication(2, 3);
		System.out.println(res2);
		
		Calculator3 calc3 = new Calculator3();
		double res3 = calc3.division(3 , 2);
		System.out.println(res3);
	}
}
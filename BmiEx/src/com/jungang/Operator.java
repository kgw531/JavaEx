package com.jungang;

public class Operator {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		byte byteValue1 = 20;
		//byte byteValue2 = byteValue + byteValue1; // byte,short,char 타입은 연산이 될 때 int형으로 변환되어 계산되고 그 결과 int 타입이 반환됩니다.
	
		int intValue2 = byteValue + byteValue1; // 해결1
		byte byteValue2 = (byte)(byteValue + byteValue1); // 해결2
		
		// 실수의 연산
		int iValue = 10; // 10.0
		double dValue = 5.5;
		double result = iValue + dValue;
		System.out.println(result);
		System.out.println((double)iValue);
		System.out.println(5 / 2); // 2, int와 int의 연산이므로..
		System.out.println((double)5 / 2); // 5.0/2, 계산결과는 double타입
		System.out.println(5 / (double)2); // 5 / 2.0 계산결과는 double타입
		System.out.println((double) (5/2)); // 5/2는 int 연산 결과 2가 되고 최종적으로 2.0의 결과를 얻음
		
		System.out.println("---------------------------------");
		
		// 문자열을 기본타입으로 강제 타입변환하는 방법
		String str = "18";
		int i = Integer.parseInt(str); // parseInt(string s) : int -> string 타입의 매개변수를 넣고 실행결과 int 타입을 반환한다.
		System.out.println(i);
		System.out.println(i + 10); // 문자열이 숫자로 바뀌었는지 확인
		byte b = Byte.parseByte(str);
		long l = Long.parseLong(str);
		float f = Float.parseFloat(str);
		double d = Double.parseDouble(str);
		
		System.out.println(b);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		str = "true";
		boolean bValue = Boolean.parseBoolean(str);
		System.out.println(bValue);
		
		System.out.println("---------------------------");
		
		
		// 기본타입(숫자열, boolean)을 문자열로 변환
		
		String strValue = String.valueOf(123);
		String.valueOf(123.11);
		System.out.println(	String.valueOf(123.11));
		
		String.valueOf('가');
		String.valueOf(true);
		
	
		
		
		
	
		
		
	
		

	}

}

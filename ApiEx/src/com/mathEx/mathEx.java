package com.mathEx;

public class mathEx {

	public static void main(String[] args) {
		// 절대값 
		int i = Math.abs(-5);
		double d = Math.abs(-5.123);
		System.out.println("절대값" + i);
		System.out.println("절대값" + d);
		
		
		// 버림
		System.out.println("버림" + Math.floor(d));
		// 올림
		System.out.println("올림" + Math.ceil(d));
		// 반올림
		System.out.println("울림" + Math.round(d) );
		
		System.out.println("max : " + Math.max(5.3, 2.5));
		System.out.println("min : " + Math.min(5, 9));
		
	}

}

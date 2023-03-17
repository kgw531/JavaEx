package com.jungang;

public class VarEx {

	public static void main(String[] args) {
		int value = 0;
		// == 비교연산자
		// 변수의 사용범위 - 선언된 코드블럭을 벗어나면 사라진다.
		if(value == 0) { // value가 0이면 코드블럭을 실행해
			int value2 = value + 20;
			
		}
		int sum = value;
		//int sum2 = value2; // 메모리에 저장되지만 코드블럭을 벗어나면 메모리에서 사라져 오류.

	}
 // int sum = value; // 코드블럭을 벗어나 오류.
	
	
}

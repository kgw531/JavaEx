package com.jungang;

public class CastingEx {

	public static void main(String[] args) {
		
		//강제형변환(Casting)
		int iValue = 65;
		char charValue = (char) iValue;
		System.out.println(iValue);
		System.out.println(charValue);
		
		long lValue = 500; // 자동 형변환으로 l을 끝에 안붙여도됨
		iValue = (int) lValue;
		
		float fValue = 3.14f;
		iValue = (int)fValue;
		System.out.println("iValue");
		
		// byte의 허용범위: -128~127
		int intValue = 128;
		byte byteValue = (byte)intValue; //byte의 허용범위를 넘어섰음에도 오류가 나지 않는 이유는 그 숫자가 로테이션되어 나오기 때문
		System.out.println(intValue);
		System.out.println(byteValue);
		// Casting할 때 변환하려는 타입에 들어가는 값인지 꼭 확인해야한다.
		
		//p.88 9번 문제
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int)(var1 + var2 + var3 + (int)Double.parseDouble(var4));
		System.out.println(result);
		
		
	}

}

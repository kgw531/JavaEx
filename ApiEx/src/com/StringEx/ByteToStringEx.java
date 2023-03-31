package com.StringEx;

public class ByteToStringEx {

	public static void main(String[] args) {
		byte[] bytes = {73,32,108,111,118,101,32,121,111,117};
		String str = new String(bytes);
		System.out.println(str);
		
		String str1 = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index = str1.indexOf("자바"); //9
		if(index == -1) {
			System.out.println("자바 문자열이 포함되어 있지 않습니다.");
		}else {
			System.out.println("자바 문자열이 포함되어 있습니다.");
			str1 = str1.replace("자바", "Java");
			System.out.println("--->" + str1);
		}
		
	}
	
	

}

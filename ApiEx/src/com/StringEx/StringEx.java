package com.StringEx;

import java.io.UnsupportedEncodingException;

public class StringEx {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "hello";
		// .getBytes() : str객체가 가지고 있는 값을 byte[]로 반환
		byte[] byteArry = str.getBytes();
		byte[] byteArry2 = {67,68,69};
		
		// byte 배열을 String문자열로 변환
		String str1 = new String(byteArry,1,3); // 시작 인덱스, 출력할 갯수
		String str2 = new String(byteArry2);
		
		System.out.println("===========================");
		System.out.println(str1);
		System.out.println(str2);
		
		// 실습파일 열었을 때 문자가 깨졌던 현상
		// 문자코드가 일치하지 않는 경우 깨질 수 있다.
		// euc-kr,ms949 한글표현시 2바이트 사용
		// utf-8 한글표현시 3바이트 사용
		
		// str일땐 영어라 문자가 깨지지 않았다.
		String str3 = "반갑습니다. 오늘도 힘내세요";
		 byte[] b = str3.getBytes("euc-kr");
		String s_euckr = new String(b, "euc-kr"); // euc-kr을 이용해서 인코딩 및 디코딩
		String s = new String(b);
		System.out.println(s_euckr);
		System.out.println(s);
		
	}

}

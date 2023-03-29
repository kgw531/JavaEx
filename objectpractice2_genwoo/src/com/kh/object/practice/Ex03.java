package com.kh.object.practice;

public class Ex03 {
	public static void main(String[] args) {
		// 배열의 값을 정렬하고 싶어요.
		// 방을 바꾸기 위해 새로운 변수를 선언하고 이용합니다.
		
		String str = "안녕하세요!!";
		// 문자열 끊기
		System.out.println(str.length());
		System.out.println(str.substring(0,2));
		// 시작인덱스, 끝인덱스
		// 시작인덱스는 포함되고, 끝 인덱스는 포함되지 않는다.
		System.out.println(str.substring(2,7));
		
		
		// 배열의 중복제거
		int[] numbers = {5,4,3,2,1};
		int lotteNum;
//		for(int num : numbers) {
//			if(num == lotteNum) {}
//		}
//		
		
		// 이건 선생님이 확인
		System.out.println(str.charAt(3));
		
	}
}

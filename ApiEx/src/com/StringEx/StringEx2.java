package com.StringEx;

public class StringEx2 {

	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		
		// 매개값의 문자열을 포함여부 확인
		// 포함 : 시작 인덱스값을 반환
		// 불포함 : -1 반환
		System.out.println(str.indexOf("프로")); // 3
		System.out.println(str.indexOf("c")); // -1
		
		
		System.out.println(str.substring(str.indexOf("프로")));
		
		if(str.indexOf("자바") > 0) {
			System.out.println("자바 관련 책");
		}else {
			System.out.println("자바관련없음");
		}
		
		// 문자의 길이를 반환한다.
		// id의 길이는 5자 이상 이여야한다.
		String id = "id";
		if(id.length() < 5) {
			System.out.println("아이디는 5자 이상 14자 이하로 작성 가능합니다.");
		}
		
		String ssn = "1234561234567";
		if(ssn.length() != 13) {
			System.out.println("주민등록번호를 정확히 입력하세요.");
		}
		
		// 원하는 문자열을 추출
		// 시작인덱스는 포함하고 끝 인덱스는 포함하지 않고 반환
		System.out.println("주민번호 앞자리 : " + ssn.substring(0, 6));
		System.out.println("주민번호 앞자리 : " + ssn.substring(6));
		
		
		
		
		//문자 교체 : replace
		str = "자바는 객체지형 언어입니다. 자바를 자바봅시다.";
		System.out.println(str.replace("자바", "JAVA"));
		String newStr = str.replace("자바", "java");
		System.out.println(newStr);
		
		// 대소문자 교체
		str = "Java Programe Language";
		System.out.println("대문자로 변경 : " + str.toUpperCase());
		System.out.println("소문자로 변경 : " + str.toLowerCase());
		
		// 대소문자를 가리지 않고 비교
		str = "q";
		System.out.println(str.equalsIgnoreCase("Q"));
		System.out.println(str.equalsIgnoreCase("q"));
		
		// 공백을 제거해주기
		id = "         id   야  ";
		System.out.println(id);
		System.out.println(id.trim());
		
		// 기본타입을 문자열로
		System.out.println(String.valueOf(10));;
		System.out.println(String.valueOf(10.4));;
		System.out.println(String.valueOf(true));
		
		
		
	}

}

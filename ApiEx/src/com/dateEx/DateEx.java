package com.dateEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// Date 클래스에서 날짜, 시간을 어떻게 처리하는지
		// 기본 생성자를 통해서 Date 객체를 생성하면
		// 현재시간과 날짜에 대한 정보를 가지고 객체를 생성합니다.
		Date now = new Date();
		System.out.println(now.toString());
		
		// 1970년 1월 1일 00시 기준으로 밀리 세컨드 단위로 표기된다.
		// 한국이 출력될 땐 그리니치평균시보다 9시간 빠르다.
		Date when = new Date(1);
		System.out.println(when); // Thu Jan 01 09:00:00 KST 1970
		
		when = new Date(1000); // 밀리세컨드가 들어간다(1/1000초)
		System.out.println(when);
		
		System.out.println("getTime()" + now.getTime());
		System.out.println("getYear()" + now.getYear() + 1900);
		System.out.println("getMonth()" + now.getMonth() + 1);
		System.out.println("getDate()" + now.getDate());
		System.out.println("getDay()" + now.getDay());
		System.out.println("getHour()" + now.getHours());
		System.out.println("getMinutes()" + now.getMinutes());
		System.out.println("getSeconds()" + now.getSeconds());
		
		
		
		/**
		 * y: 년도
		 * M: 월
		 * d: 일
		 * h: 시간
		 * m: 분
		 * s: 초
		 * E: 요일
		 * a: am/pm
		 */
		/**
		 * 원하는 형식으로 날짜를 출력할 수 있도록 도와준다.
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss:SS (E) a");
		String formatDate = sdf.format(now);
		System.out.println(formatDate);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("hh:mm:ss");
		System.out.println(sdf.format(now));
		
		
		

	}

}

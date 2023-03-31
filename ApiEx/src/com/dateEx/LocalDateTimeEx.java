package com.dateEx;

import java.time.LocalDateTime; // 임포트 주의
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		
		/**
		 * 자바 8부터 날짜, 시간을 나타내는 java.time 패키지를 제공
		 * 
		 */
		
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime when = LocalDateTime.of(2021,5,25,22,30,25);
		System.out.println(now);
		System.out.println(when);
		
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		
		// 시간의 연산
		LocalDateTime plus = now.plusDays(1).plusMonths(1).plusYears(1);
		System.out.println("===========================================");
		System.out.println(now);
		System.out.println(plus);
		
		
		
		
		
		
	}

}

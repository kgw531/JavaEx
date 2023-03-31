package com.systemEx;

public class SystemEx {

	public static void main(String[] args) throws InterruptedException {
		// 수행시간 구하기
		Long startTime = System.currentTimeMillis();
		
		// System.in
		// System.out
		
		int sum = 0;
		for(int i = 0; i<5 ; i++) {
			sum += 1;
			if(i == 4) {
				System.exit(0); // 4이면 JVM 강제 종료
			}
			//1초 대기
			Thread.sleep(1000);
			
		}
		System.out.println("총 합계 : " + sum);
		
		Long endTime = System.currentTimeMillis();
		long res = (endTime - startTime)/1000;
		System.out.println(res + "초 소요되었습니다.");

	}

}

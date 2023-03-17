package Loof;

public class LoofFor {

	public static void main(String[] args) {
		// 반복문 - for문
		// for(초기식;조건식;증감식){}
		// 실행순서 : 초기식 조건식 코드블럭(실행문) 증감식 조건식

		
		// 1~100까지의 합을 구해준다.
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			//System.out.println("for문 : " + i); 반복문이 도는 지 확인하는 코드
			sum = sum + i; // sum += i
		}
		System.out.println("1부터 100까지의 합 " + sum);
	}
	
	
		
		
}

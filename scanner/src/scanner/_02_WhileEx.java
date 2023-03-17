package scanner;

import java.io.IOException;

public class _02_WhileEx {
	/**
	 * 키보드로부터 입력된 키코드를 출력합니다.
	 * @param args
	 * @throws IOExcption
	 */

	public static void main(String[] args) throws IOException {
		
		// 반복문 while(){}
		// ()안의 값이 참이면 코드블럭{}이 진행
		System.out.println("키보드 입력을 기다리는 중입니다.");
		while(true) {
			// 사용자의 입력을 대기
			int input = System.in.read();
			
			// Q가 입력되면 반복문을 종료
			if(input == 81 || input == 113) {
			//반복문을 탈출: 내가 속해있는 반복문의 코드블럭을 탈출
				break;
			}
			System.out.println("keyCode : " + input); // q를 눌렀을 때 값을 출력하고 싶지 않으면 여기로 옮기자.
		}
		System.out.println("종료합니다.");

	}

}

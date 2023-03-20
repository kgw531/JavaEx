package forEx;

public class _02_DoWhile {

	public static void main(String[] args) {
		//while과 do-while의 비교
		int i = 10;
		// while문은 조건이 일치 할 때만 실행
		while(i < 0) {
			System.out.println("0보다 작습니다."); // 출력x
			
		}
		// do-while문은 코드블럭을 실행하고 조건을 판단한다.
		do {
			System.out.println("do-while문은 코드블럭을 무조건 1회 실행합니다.");
			System.out.println("1회 실행 후 조건문이 거짓일 때까지 반복 합니다.");
		}while(i < 0);
	}

}

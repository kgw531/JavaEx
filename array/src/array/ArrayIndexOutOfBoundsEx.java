package array;

public class ArrayIndexOutOfBoundsEx {

	public static void main(String[] args) {
		// 자주 발생하는 오류
		// 잘못된 인덱스를 넣어서 생기는 오류
		//int[] score = {10, 20, 30}; // 0,1,2번방
		
		// int sum = score[3]; // 없는 방을 참조하려함 -> 오류발생
		//System.out.println(sum); // ArrayIndexOutOfBoundsException오류
		// java.lang.ArrayIndexOutOfBoundsException
		// 배열의 index를 초과하는 방법호가 입력된 경우
		
		
		
		int[] score;
		//score = {10, 20, 30}; // 배열을 선언한 후 중괄호를 사용해서 값을 입력하면 오류가 발생
		// 그렇다면 배열 선언 후 생성하는 방법은?
		score = new int[] {10,20,30}; // 변수명 = new 타입[] {값 목록, , , ...}
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		// 2. 배열 선언 후 생성하는 방법 2
		// 값의 목록이 없지만 미리 배열을 만드는 경우
		score = new int[10]; 
		System.out.println("새로운 int 타입을 저장할 10개의 저장공간을 만들었습니다.");
		System.out.println(score);

	}

}

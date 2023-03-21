package array;

public class _02_ArrayEx {

	public static void main(String[] args) {
		// 배열을 생성
		int[] score = {10, 20, 30};
		String[] names = {"가나다", "김건우", "난자바"};
		
		//int i = 0;  i. : 이렇게 했을 때 기본타입은 아무것도 나오지 않는다
		
		
		
		// 반복문을 이용해서 배열에 입력된 값을 출력
		for(int i = 0; i < names.length; i++) {
			//배열의 값에 접근: 변수명[방번호]
			System.out.println(names[i]);
		}
	}

}

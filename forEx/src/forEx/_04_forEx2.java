package forEx;

public class _04_forEx2 {

	public static void main(String[] args) {
		// 1~100까지 정수 중에서 3의 배수의 총합
		int sum = 0;
		for(int i = 1; i < 101; i++) {
			if(i % 3 != 0) {
				continue; // 3의 배수가 아니면 증감식으로 이동해라.
			}
			sum = sum + i;
		}// for문의 끝
		System.out.println("1부터 100까지 3의 배수들의 총합: " + sum);
		
		
	}

}

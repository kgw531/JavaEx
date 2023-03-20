package forEx;

public class _04_Continue {
	public static void main(String[] args) {
		// 1~10까지의 수중에서 짝수의 합을 구해보자
		System.out.println("---------짝수의 합 구하기----------");
			int sum = 0;
			for(int i = 1; i < 11; i++) {
				if(i % 2 == 1) {
					continue; // 증감식으로 이동해라.
				}
				System.out.println("i = "+ i);
				sum += i; // sum = sum + i;
				
			}
			System.out.println("1~10까지 짝수의 합 : " + sum);

	}

}

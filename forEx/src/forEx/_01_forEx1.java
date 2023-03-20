package forEx;

public class _01_forEx1 {

	public static void main(String[] args) {
		// 이중 반복문(중첩 반복문)을 이용하여 구구단 출력하기
		for(int dan = 2; dan < 10; dan++) {
			System.out.println(dan + "단"); // dan: 2~9
			for(int i = 9; i > 0; i--) {// i : 1 ~ 9
				//System.out.println(dan + "*" + i+ "=" + dan * i);
				System.out.printf("%d * %d = %d", dan, i, dan * i);
				System.out.println();
			}
			System.out.println();
		}
		
		

	}

}

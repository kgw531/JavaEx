package forEx;

public class _03_Break {
	public static void main(String[] args) {
		Outter : // Label
		for(int dan = 2; dan < 10; dan++) {
			System.out.println(dan + "단"); // dan: 2~9
			for(int i = 9; i > 0; i--) {// i : 1 ~ 9
				// 만약 6단이면 구구단을 출력하지마
				if(dan == 6) {
					break Outter; //Label을 지정하여 break를 걸면 label한 위치로 빠져나감. 여기선 Outter라고 라벨링함
					// 자바의 최신기능이기 때문에 낮은 버전에서는 사용할 수 없을 수도 있다.
				}
				//System.out.println(dan + "*" + i+ "=" + dan * i);
				System.out.printf("%d * %d = %d", dan, i, dan * i);
				System.out.println();
			}
			System.out.println();
			//6단까지 출력한 후 반복문 탈출
//			if(dan == 6) {
//				break;
//			}
		}
	}

}

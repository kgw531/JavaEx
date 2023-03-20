package forEx;

public class _05_forEx3 {

	public static void main(String[] args) {
		// 초기값 지정.
		// i,j의 합이 5이면 (i,j) 출력 후 종료
		// 아니면 계속 주사위를 굴린다.
		
		while(true) {
			int i = (int) (Math.random()*6 + 1);
			int j = (int) (Math.random()*6 + 1);
			if(i + j == 5) {
				System.out.printf("(%d,%d)",i,j);
				break;
			}
		}
				


	}

}

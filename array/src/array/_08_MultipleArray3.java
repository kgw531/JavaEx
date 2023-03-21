package array;

public class _08_MultipleArray3 {
	public static void main(String[] args) {
		int[][] scores = new int[2][];
//		scores[0] = new int [] {1,2,3};
//		scores[1] = new int [] {4,5};
		
		scores = new int[][] {{1,2,3},{1,2}};
		
		
		//scores의 방의 갯수를 확인
		for(int i = 0; i < scores.length;i++) {
			System.out.println("방번호 : " + i);
			System.out.println("int배열의 길이 : " + scores[i].length);
			int[] point = scores[i];
			for(int j = 0; j < point.length; j++) {
				System.out.printf("(%d,%d) : \n", i,j);
				// 2차원 배열에서 값에 접근하는 방법
				System.out.println(point[j]);
				System.out.println(scores[i][j]);
				
			}
			
		}
		
	}

}

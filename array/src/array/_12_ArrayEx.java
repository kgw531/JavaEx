package array;

public class _12_ArrayEx {

	public static void main(String[] args) {
		int[] scores = {80,90,70,100};
		int num = 0;
		for(int score : scores) {
			//System.out.println(score);
			num = num + score; // num += score;
		}
		System.out.println("점수의 총합 : " + num);
		System.out.println("점수의 평균 : " + num / scores.length);
		
		
	}

}

package array;

public class _13_ArrayAdvancedFor {

	public static void main(String[] args) {
		int[] scores = {80,90,70,100};
		int sum = 0;
		for(int score : scores) {
			//System.out.println(score);
			sum = sum + score;
		}
		System.out.println("점수의 총합 : " + sum);
		System.out.println("점수의 평균 : " + sum / scores.length);

	}

}

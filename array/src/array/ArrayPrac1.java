package array;

public class ArrayPrac1 {

	public static void main(String[] args) {
		int[] score = {4, 5, 6, 6, 4, 7, 7, 9};
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]); 
			sum = sum + i; // score의 총합
			
		}
		System.out.println("score의 총합 : " + sum);
		System.out.println("평균 : " + sum / score.length);
		
	}

}

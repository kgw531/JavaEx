package Ifelse;

public class RandomPractice {

	public static void main(String[] args) {
		
		
		int i = 0;
		while(true) {
			int rotto = (int)(Math.random()*10 +1);
			System.out.println(rotto);
			i = i + 1;
			if(i < 6) {
				break;
			}
		}
		
		

	}

}

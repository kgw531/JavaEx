package Loof;

public class Practice {
	public static void main(String[] args) {
		int i;
		int j;
		for(i = 1; i < 10; i++) {
				System.out.println(i+"단");
			for(j=1; j< 10; j++) {
				System.out.printf("%d * %d = ", i, j);
				System.out.println(i*j);
			}
		}
		
	}
	

}

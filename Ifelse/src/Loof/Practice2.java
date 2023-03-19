package Loof;

public class Practice2 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		for(i = 1; i < 6; i++) {
			System.out.print("*");
			for(j = 1; j < i; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}

}
}
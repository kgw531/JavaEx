package forEx;

public class _07_Ex4 {

	public static void main(String[] args) {
		// 별 찍기2
		// 방법1
		for(int i = 4; i > 0; i--) {
			for(int j = 1; j < 5 ; j++) {
				if(j < i) {
				System.out.print(" ");
				}else {
				System.out.print("*");
					}
				}
			System.out.println();
			}
		System.out.println("========================");
		
		// 방법2
		for(int i = 1; i < 5; i++) {
			for(int j = 4; j > 0; j--) {
				if(i >= j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			

	}

}

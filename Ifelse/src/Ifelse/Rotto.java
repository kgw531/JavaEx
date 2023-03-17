package Ifelse;

public class Rotto {

	public static void main(String[] args) {
		// 로또 만들기
		
//		int rotto1 = (int) (Math.random()*45 +1);
//		int rotto2 = (int) (Math.random()*45 +1);
//		int rotto3 = (int) (Math.random()*45 +1);
//		int rotto4 = (int) (Math.random()*45 +1);
//		int rotto5 = (int) (Math.random()*45 +1);
//		int rotto6 = (int) (Math.random()*45 +1);
//		System.out.printf("%d ",rotto1);
//		System.out.printf("%d ",rotto2);
//		System.out.printf("%d ",rotto3);
//		System.out.printf("%d ",rotto4);
//		System.out.printf("%d ",rotto5);
//		System.out.printf("%d ",rotto6);
		
		// 반복문을 이용한 로또
		 int i = 0;
		 while (true) {
			int num = (int)(Math.random()*45 +1);
			System.out.print(num + "\n");
			i++;
			if(i == 5) {
				break;
			}
			
			
		}

	}

}

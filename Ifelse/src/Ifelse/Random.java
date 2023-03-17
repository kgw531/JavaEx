package Ifelse;

public class Random {

	public static void main(String[] args) {
		
		
		// Math.random()
		// 0.0 ~ 1.0 사이의 무작위 수를 출력하여 double 타입으로 변환
		// 0.00000000....1 ~ 0.9999999999999999...9
		// 10을 곱했을 때 0~9 , 1더하면 1~10
		// 100을 곱했을 때 0~99, 
		
//		double rotto1 = Math.random();
//		double rotto2 = Math.random();
//		double rotto3 = Math.random();
//		double rotto4 = Math.random();
//		double rotto5 = Math.random();
//		
//		System.out.println(rotto1  * 10);
//		System.out.println(rotto2 * 100);
//		System.out.println(rotto3);
//		System.out.println(rotto4);
//		System.out.println(rotto5);
		
		int dice = (int)(Math.random() * 6 + 1);
//		System.out.println(dice);
//		
//		if(dice == 1) {
//			System.out.println("주사위가 1 나왔습니다.");
//		}
//		if(dice == 2) {
//			System.out.println("주사위가 2 나왔습니다.");
//		}
//		if(dice == 3) {
//			System.out.println("주사위가 3 나왔습니다.");
//		}
//		if(dice == 4) {
//			System.out.println("주사위가 4 나왔습니다.");
//		}
//		if(dice == 5) {
//			System.out.println("주사위가 5 나왔습니다.");
//		}
//		if(dice == 6) {
//			System.out.println("주사위가 6 나왔습니다.");
//		}
		
		//switch
		switch (dice) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			
		case 2:
			System.out.println("2번이 나왔습니다.");
			
		case 3:
			System.out.println("3번이 나왔습니다.");
			
		case 4:
			System.out.println("4번이 나왔습니다.");
			
		case 5:
			System.out.println("5번이 나왔습니다.");
			
		case 6:
			System.out.println("6번이 나왔습니다.");
			
		default :
			System.out.println("==========종료============");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
//		
//		for(int i = 0; i < 7; i++) {
//			i = 0;
//			i = i + 1;
//			System.out.println();
//		}
//		
		
		
		

	}

}

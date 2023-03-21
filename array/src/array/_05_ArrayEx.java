package array;

// 접근제어자 class(타입) 클래스명{}
public class _05_ArrayEx {
//	접근제어자 반환타입 void 메서드이름(매개변수){} 지금은 이것만 기억하자
	
//	void : 반환 타입이 없다는 뜻
// 	매개변수 : (타입 변수명) -> 매개변수는 있을 수도 없을 수도 있다. 매개변수가 있다면 타입을 명시해야한다.
	public static void main(String[] args) { // 메인 메서드 안에 있는 매개변수를 이용하는 방법
		System.out.println(args.length); // 0, 변수만 생성하고 방을 생성하지 않았기 때문
		// System.out.println(args[0]); -> 오류
		//run configuration 에서 매개변수를 수정하면 배열을 생성해줄 수 있다.
//		for(int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//		}
		
		// 1: 로컬환경 2: 테스트 환경 3: 운영환경
		int mode = Integer.parseInt(args[0]);
		
		if(mode == 1) {
			System.out.println("로컬 환경입니다.");
			// 로컬 db 접속
		}else if(mode == 2) {
			System.out.println("테스트 환경입니다.");
			// 테스트 db에 접속
		}else if(mode == 3){
			System.out.println("운영환경 입니다.");
			// 운영 db 접속
		}
		
		
		
		
		

	}

}

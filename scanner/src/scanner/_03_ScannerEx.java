package scanner;

import java.util.Scanner; // import

public class _03_ScannerEx {

	public static void main(String[] args) {
		// 기본타입 이외의 타입은 모두 참조타입이라고 한다.
		Scanner scan; // Sca치고 자동완성시 자동으로 import, 오류가 발생시 커서를 대서 제시한 해결방안을 선택하여 import 할 수 있음
		scan = new Scanner(System.in); // 이 형식을 외우자
		
		Scanner scan1 = new Scanner(System.in); // 스캐너의 구조 : 클래스명 변수명 = new 클래스명(System.in); 
		// new연산자는 객체를 메모리에 생성 후 메모리의 주소를 반환한다.
		// new가 Scanner라는 객체를 생성하고 생성된 Scanner는 scanner변수에 저장됨
		
		
		System.out.println("문자열을 입력해주세요");
		// 한줄 읽어온다
		String input = scan.nextLine(); // 공백이 나와도 끊지 않고 출력
		System.out.println("문자열을 입력해주세요.");
		
		
		// 공백으로 구분해서 한 줄 읽어온다.
//		String input = scan.next(); // 공백이 나오면 하나씩 읽어줌
//		System.out.println(input);
//		System.out.println(Integer.parseInt(input) * 10);
		
		//숫자로 받아온다.
		int i = scan.nextInt();
		System.out.println(i);
		System.out.println(i * i); // 연산도 가능
		
		
		//
		
		
	}

}

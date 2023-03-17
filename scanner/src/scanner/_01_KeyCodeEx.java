package scanner;

import java.io.IOException;

public class _01_KeyCodeEx {

	public static void main(String[] args) throws IOException{
		
		// System.in.read() 메서드는 오류가 발생할 수 있다
		// 방법 1: throws 하는 방법을 선택하여 해결
		// 방법 2: try{} catch{}문으로 해결
		int code1 = System.in.read(); //  이 메소드는 int 값을 받는다.
		int code2 = System.in.read();
		int code3 = System.in.read();
		int code4 = System.in.read();
		int code5 = System.in.read();
		
		System.out.println("------------키코드------------");
		System.out.println((char)code1); // 문자로 표시할 땐 char로 형변환 -> 유니코드라서
		System.out.println(code2);
		System.out.println(code3);
		System.out.println(code4);
		System.out.println(code5); // 실행하니까 console창에 빨간네모가 들어옴 : 사용자가 입력할 때 까지 기다리는 중임
		// 입력하고 enter키를 누르는 순간 실행
		// 마지막 두 숫자는 ENTER키의 13,10
		// 이 과정보다 편한 객체가 있다?
		
		
		
		
		
		
	}

}

package member.service;

import java.util.Scanner;

public class MemberSurviceMain2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemberSurvice2 ms = new MemberSurvice2("홍길동", "123456");
		int i = 0;
		while(true){
			System.out.println("아이디를 입력해주세요");
			String id = scan.next();
			System.out.println("비밀번호를 입력해주세요");
			String pw = scan.next();
			
			boolean res = ms.login(id,pw);
			if(res) {
				System.out.println("환영합니다");
				break;
			} else {
				System.out.println("아이디 또는 비밀번호가 틀립니다.");
				i++;
				if(i >= 5) {
					System.out.println("시스템을 종료합니다. (아이디 또는 비밀번호 5회 불일치)");
					System.exit(0);
				}
			}
			
			
		}
	}

}

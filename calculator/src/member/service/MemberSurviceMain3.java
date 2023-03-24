package member.service;

import java.util.Scanner;

public class MemberSurviceMain3 {

	public static void main(String[] args) {
		MemberSurvice3 survice = new MemberSurvice3("김건우", "1234");
		// 방법 2 재밌는 방법~
		Scanner scan = new Scanner(System.in);
		
		// 입력
		while(true) {
			System.out.println("id : ");
			String id = scan.next();
			System.out.println("pw : ");
			String pw = scan.next();
			
			boolean res = survice.login(id, pw);
			
			if(res) {
				System.out.println("환영합니다.");
				break;
			}else {
				System.out.println("id/pw가 일치하지 않습니다.");
			}
			
		}
		System.out.println("로그아웃 하려면 q를 눌러주세요");
		String exit = scan.next();
		if("q".equals(exit)) {
			System.out.println("로그아웃 되었습니다.");
			System.exit(0);
		}
		
		
		
		
		
		
		
		
		
		
		
		
// 방법1 재미없는 방법~
//		boolean res = survice.login("김건우","1234");
//		if(res) {
//			System.out.println("환영합니다.");
//		}else {
//			System.out.println("id/pw가 일치하지 않습니다.");
//		}

	}

}

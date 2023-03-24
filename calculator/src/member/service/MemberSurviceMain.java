package member.service;

public class MemberSurviceMain {
	public static void main(String[] args) {
		MemberSurvice survice = new MemberSurvice();
		//boolean res = survice.login("hong", "12345");
		if(survice.login("hong", "12345")) {//if(res){} 이렇게 해줄 수도 있다.
			System.out.println("환영합니다.");
		}else {
			System.out.println("아이디와 비밀번호가 일치하지 않습니다.");
		}
		survice.logout("홍길동");
	}
	
	
}


package member.service;

public class MemberSurvice2 {
	public String id;
	public String password;
	
	public MemberSurvice2(String id, String password){
		this.id = id;
		this.password = password;
		
		
	}
	
	public boolean login(String id, String password
			) {
		if(id.equals(this.id) && password.equals(this.password)) {
			System.out.println("로그인 되었습니다");
			return true;
		}else {
			System.out.println("아이디나 비밀번호가 틀렸습니다. 다시 입력해주세요.");
			return false;
			
		}
		
		
	}
	public void logout() {
		System.out.println(this.id + "님, 로그아웃 되었습니다.");
		
	}
	
	

}

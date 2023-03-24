package member.service;

public class MemberSurvice3 {
	// 필드
	public String id;
	public String pw;
	
	public MemberSurvice3(String id, String pw) {
		this.id = id;
		this.pw = pw;
		
	}
	
	
	
	// 메서드
	// 일치하면 true, 일치하지 않으면 false 반환
	public boolean login(String id, String pw) {
		
		if(id != null && this.id.equals(id) && pw != null && this.pw.equals(pw)) {
			System.out.println("로그인 되었습니다.");
			return true;
		}
		System.out.println("로그인이 실패하였습니다.");
		return false;	
		
	}
	public void logout() {
		System.out.println(id + "로그아웃 되었습니다."); // 이 메서드에는 id와 같은 변수명의 매개변수가 없어서 id는 그냥 써도 필드를 의미한다.
	}
	
	
}

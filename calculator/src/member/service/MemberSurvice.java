package member.service;

public class MemberSurvice {
	
	public boolean login(String id, String password) {
		// id에 null이 들어올 경우 nullpointExceptiond이 발생 할 우려가 있다.
		// null이 아닌경우 체크로직을 실행하거나 "hong"(문자열).equals를 사용한다.
		if(id != null
				&& "hong".equals(id)
				&& "12345".equals(password)
				) {
				return true;
		}
		return false;
	}
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
		
	}

}

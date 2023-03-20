package forEx;

public class NullPointExceptionEx {

	public static void main(String[] args) {
		// 초기값으로 null을 입력
		// 참조변수가 아무런 객체도 참조하고 있지 않는다는 의미
		// . : 주소 접근자 또는 객체 접근 연산자 -> 필드, 메소드에 접근할 수 있도록 한다
		// . 이후 객체가 갖고 있는 접근 가능한 필드, 메서드 목록을 보여준다.
		// 사용법: 변수이름.필드명;, 변수이름.메서드명(매개변수);
		String name = null;
		name = "안녕"; // nullpointexception의 해결방안: 변수를 초기화시키거나
		
		if(name != null) {// if문을 통해 null인 경우 실행되지 않도록 처리하거나 한다.
			System.out.println("총 문자수 : " + name.length());
		}
		
		System.out.println("정상적으로 종료 되었습니다.");
	
		

	}

}

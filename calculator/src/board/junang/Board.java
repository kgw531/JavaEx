package board.junang;

public class Board {
	// 필드를 정의
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	// 클래스 이름과 동일하다.
	// 반환타입이 없다.
	public Board(String title, String content){
//		this.title = title;
//		this.content = content;
//		this.writer = "로그인 한 회원아이디";
//		this.date = "현재 컴퓨터 날짜";
//		this.hitcount = 0;
		this(title,content,null,null,0); // 코드가 간결해졌어!
		
	}
	
	public Board(String title, String content,String writer, String date, int hitcount){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
		
	}
	
}

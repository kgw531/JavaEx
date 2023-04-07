package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JDBCex {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "orauser";
	String pw = "1234"; 
	Connection conn;

	
	public static void main(String[] args) {
		JDBCex jdbc = new JDBCex();
	//	jdbc.ConnectionEx();
	//	jdbc.getList();
	//	jdbc.insert();
		// jdbc.delete();
		//jdbc.update();
	}
	
	
	public void ConnectionEx() {
		// 데이터 베이스 접근시 필요한 정보
				// ip,port,sid,계정정보,비밀번호
			
				try {
					//드라이버 로딩
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					//커넥션 얻어오기
					conn = DriverManager.getConnection(url,id,pw);
					System.out.println("커넥션 얻기 성공" + conn);
					
					//쿼리 실행
					Statement stmt = conn.createStatement();
					
					// 데이터 조회
					// executeQuery(쿼리문장 입력)
					// 리턴타입: ResultSet -> 결과 집합
					ResultSet rs = stmt.executeQuery("select count(*) from book order by no");
					rs.next(); // 한줄밑으로 내려오기
					System.out.println("조회결과 : " + rs.getInt("count(*)"));
					
					// 자원반납: 마지막꺼부터 역순으로 닫아준다.
					rs.close();
					stmt.close();
					conn.close();
					
					
					// 데이터 생성, 수정, 삭제
					//stmt.executeUpdate("");
					
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	
	public void getList() {
	
		List<Book> list = new ArrayList<>();
		
		try {
			// 클래스로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 얻어오기
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("커넥션 성공");
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book");
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String author = rs.getString(3);
				String isRent = rs.getString(4);
				Date regDate = rs.getDate(5);
				Date editDate = rs.getDate(6);
				Book book = new Book(no,title, author , isRent, regDate, editDate);
				list.add(book);
				
			}
			System.out.println(list);
			for(Book book : list) {
				System.out.println(book.toString());
			}
			rs.close();
			stmt.close();
			conn.close();
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void insert() {
		
		List<Book> list = new ArrayList<>();
		
		try {
			// 클래스로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 얻어오기
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("커넥션 성공");
			
			Statement stmt = conn.createStatement();
			// 업데이트 : executeUpdate -> 몇 권이 업데이트되었는 지 반환
			System.out.println("테스트");
			int res = stmt.executeUpdate("insert into book values(9, '자바', '어려운', 'N',sysdate,null)");
			System.out.println(res + "건이 처리되었습니다");
			
			
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
			e1.printStackTrace();
		}
		
		
	}
	
	
	public void delete() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
			conn.setAutoCommit(false); // 자동으로 커밋하는 것을 차단
			Statement stmt = conn.createStatement();
			int res = stmt.executeUpdate("delete from book");
			System.out.println(res + "건 처리 되었습니다.");
			conn.rollback();
			System.out.println("롤백되었습니다.");
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void update() {
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// db 연결 설정
			conn = DriverManager.getConnection(url,id,pw);
			// 쿼리 실행 객체 생성
			Statement stmt = conn.createStatement();
			//쿼리 실행
			int res = stmt.executeUpdate("update book set isrent = 'Y' where no = 10");
			
			// 실행결과 출력
			System.out.println(res + "건이 처리되었습니다");
			
			
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc 라이브러리를 확인해주세요.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
}

package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookDao {
	
	
	public static void main(String[] args) {
		BookDao dao = new BookDao();
		//dao.insert();
		dao.delete(1);
		//dao.update();
		//dao.insert(15,"해리포터","j롤링","N");
		List<Book> list = dao.getList();
//		System.out.println("책 리스트=====================");
//		for(Book book : list) {
//			
//			System.out.println(book.toString());
//		}
	}
	
	
	
	// 데이터 삽입
	public void insert(int no, String title, String author, String isRent) {
		
		try {
			Connection conn = DBUtill.getConnection();
			Statement stmt = conn.createStatement();
			
			
			int res = stmt.executeUpdate("insert into book VALUES(" + no + ",'"+ title +"','"+ author+"', '"+isRent+"', sysdate, null)");
			System.out.println(res + "건 처리되었습니다.");
			// 자원 반납
			DBUtill.closeConnection(conn, stmt);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	// 데이터 수정
	public void update(int no) {
		try {
			Connection conn = DBUtill.getConnection();
			Statement stmt = conn.createStatement();
			int res = stmt.executeUpdate("update book set isrent = 'Y' where " + no); // 쿼리를 연결하여 사용가능
			System.out.println(res + "건 수정하였습니다.");
			
			System.out.println("대기");
			Thread.sleep(5000);
			
			DBUtill.closeConnection(conn, stmt);
			System.out.println("자원 반납");
			System.out.println("대기");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// 데이터 삭제
	public void delete(int no) {
		try {
			Connection conn = DBUtill.getConnection();
			Statement stmt = conn.createStatement();
			int res = stmt.executeUpdate("delete from book where no =" + no); // 쿼리를 연결하여 사용가능
			System.out.println(res + "건 처리하였습니다.");
			DBUtill.closeConnection(conn, stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 데이터 조회
	public List<Book> getList(){
		List<Book> list = new ArrayList<>();
		
		try {
			Connection conn = DBUtill.getConnection();
			Statement stmt = conn.createStatement();
			// 질의 결과를 결과집합으로 받아온다.
			ResultSet rs = stmt.executeQuery("select * from book order by no");
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String author = rs.getString(3);
				String isRent = rs.getString(4);
				Date regdate = rs.getDate(5);
				Date editdate = rs.getDate(6);
				Book book = new Book(no,title, author, isRent, regdate, editdate);
				list.add(book);
			}
			
			
			DBUtill.closeConnection(conn, stmt,rs);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}

}

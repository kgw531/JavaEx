package com.library.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.library.Dao.connection.DBUtill;
import com.library.vo.Book;

public class DatabaseDao implements Dao{

	@Override
	public List<Book> getList() {
		List<Book> list = new ArrayList<>();
		try {
			Connection conn = DBUtill.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book order by no");
			while(rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String isRentStr = rs.getString("isRent");
				//삼항연산자 -> (조건) ? 참일때반환 : 거짓일때반환값
				boolean isRent = ("Y".equals(isRentStr)) ? true : false;
				//Date regdate = rs.getDate("regdate");
				// Date editdate = rs.getDate("editdate");
				Book book = new Book(no,title,author, isRent);
				list.add(book);
			}
			
			
			DBUtill.closeConnection(conn, stmt, rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
	}

	@Override
	public boolean ListToFile(List<Book> list) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int no) {
		int res = 0;
		try {
			Connection conn = DBUtill.getConnection();
			Statement stmt = conn.createStatement();
			res = stmt.executeUpdate("update book set isrent = 'Y' where " + no); // 쿼리를 연결하여 사용가능
			System.out.println(res + "건 수정하였습니다.");
			
			DBUtill.closeConnection(conn, stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return 0;
	}

	@Override
	public int insertBook(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

}

package com.library.Dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.library.Dao.connection.DBUtill;
import com.library.vo.Book;

public class FileDao implements Dao{
	
	
	List<Book> list = new ArrayList<>();
	Book book = new Book();

	@Override
	public List<Book> getList() {
		// 파일로부터 데이터를 읽어서 리스트로 봔환
		System.out.println("FileDao.getList() 시작");
		// 단독으로 사용불가 - 기본스트림을 파라메터로 넣어줍니다.
		try (BufferedReader br = new BufferedReader(new FileReader("bookList.txt"));){
			String readLine = "";
			while((readLine = br.readLine()) != null) { // readLine: 한줄씩 처리하고 파일의 끝은 null
				Book book = makeBook(readLine);
				if(book != null) { // makeBook메서드에서 null이 발생하지 않으면 담아준다.
					list.add(book);
				}
				
			}
			return list;
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
			//e1.printStackTrace();
		}
		
		
		System.out.println("FileDao.getList() 종료");
		return list;
	}
	
	/**
	 * 문자열을 파싱하여 Book객체를 생성
	 * @param str
	 * @return
	 */
	
	private Book makeBook(String readLine) {
		String[] str = readLine.split(" ");
		// 강제형변환시 오류가 발생할 수 있으므로 파일이 올바르지 않은 형태로 저장되어있을 경우 오류가 발생 -> try/catch
		try {
			int no = Integer.parseInt(str[0]); 
			String title = str[1];
			String author = str[2];
			boolean isRent = Boolean.parseBoolean(str[3]);
			book = new Book(no,title,author,isRent);
			return book;
			
		} catch (Exception e) {
			// 문자열 파싱 중 오류가 발생할 경우 메세지 처리, return null
			System.err.println(readLine + " : 파싱중 오류가 발생하였습니다.");
			return null;
		}
		
	}

	@Override
	/**
	 * 리스트를 매개변수로 받아 파일로 출력
	 */
	public boolean ListToFile(List<Book> list) {
		try (FileWriter fw = new FileWriter("bookList.txt");){
			// 리스트에 담긴 책의 정보를 파일로 출력합니다.
			for(Book book : list) {
				fw.write(book.toString() + "\n");
			}
			fw.flush();
			return true;
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
			return false;
		}
		
		
	}

	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int no) {
		Connection conn = DBUtill.getConnection();
		return 0;
	}

	@Override
	public int insertBook(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

}

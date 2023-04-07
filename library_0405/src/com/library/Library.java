package com.library;

import java.util.Collections;
import java.util.List;

import com.library.Dao.Dao;
import com.library.Dao.DatabaseDao;
import com.library.Dao.FileDao;
import com.library.vo.Book;

public class Library {
	// 필드로 선언시 클래스 내부에서 자유롭게 이용이 가능하다.
	List<Book> list = null;
	
	Dao dao = new FileDao();
	
	public Library() {
		list = dao.getList();
		
	}
	public Library(String daoType) {
		if(daoType.equals("DB")) {
			System.out.println("데이터베이스로 접속합니다.");
			dao = new DatabaseDao();
			
		}
		list = dao.getList();
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		System.out.println("책 목록 ============lib");
		String info = "";
		
		Collections.sort(list);
		//if(list==null) return "";
		for(Book book: list) {
			info += book.info() + "\n";
		}
		return info;
	}
	
	//책의 정보를 받아 리스트에 등록 후 리스트를 파일로 출력합니다.
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		
		
		// 0. 일련번호 중복 체크
		for(Book book : list) {
			if(book.getNo() == no) {
				System.err.println("일련번호가 중복되었습니다. \n확인 후 다시 입력해주세요.");
				return false;
			}
		}
		Book book = new Book(no, title, author, isRent);
		list.add(book);
		
		boolean res = dao.ListToFile(list); // 이 메서드의 반환타입은 boolean
		
		// 4. 파일에 정상적으로 등록되지 않은경우 리스트에서 제거
		if(!res) {
			list.remove(book);
			System.err.println("책이 등록되지 않았습니다. \n 관리자에게 문의해주세요.");
			return false;
		}
		System.out.println("책이 등록되었습니다.");
		System.out.println(toString());
		return true;
		
	}
	
	/**
	 * 책의 일련번호를 입력받아 리스트에서 삭제.
	 * 리스트를 파일로 출력한다.
	 * @param no
	 * @return
	 */

	public boolean deleteBook(int no) {
		for(Book book : list) {
			if(book.getNo() == no) {
				list.remove(book);
				dao.ListToFile(list);
				boolean res = dao.ListToFile(list);
				if(!res) {// 디테일
					//파일로 출력이 실패할 경우 책을 다시 리스트에 추가합니다.
					list.add(book);
					System.err.println("오류가 발생되었습니다. =====deleteBook");
					return false;
				}
				System.out.println("정상적으로 삭제되었습니다.");
				System.out.println(toString());
				return true; // 번호가 같으면 return하여 메서드 종료
			}
		}
		System.err.println("일련번호에 해당하는 도서를 찾지 못했습니다");
		return false;
		
	}
	/**
	 * 일련번호에 해당하는 책을 찾는다
	 * 책의 사애가 렌트가 가능한 상태 false이면 true, 렌트가 가능한 상태가 아니라면 메세지 처리, 리스트를 파일로 출력
	 * @return
	 */
	
	public boolean rentBook(int no) {
		for(Book book : list) {
			if(book.getNo() == no) {
				if(book.isRent() == false) {
					book.setRent(true);
					//파일로 출력
					boolean res = dao.ListToFile(list);
					// 데이터 베이스 업데이트
					int i = dao.update(no);
					if(i > 0) {
						System.out.println(i + "건 처리되었습니다.");
					}else {
						System.out.println("처리도중 오류가 발생하였습니다.");
						book.setRent(false);
					}
					
					
					if(!res) {
						book.setRent(false);
						System.err.println("파일로 출력하는데 실패했습니다.");
					}
					System.out.println("대여되었습니다.");
					System.out.println(toString());
					return true;
				}
			}
			
		}
		System.err.println("일련번호에 해당하는 도서가 없습니다.");
		return false;
	}
	/**
	 * 일련번호에 해당하는 도서를 찾는다.
	 * 도서가 대여중이라면 반납처리, 아니면 (반납가능한 도서가 아닙니다.) 메세지 처리
	 * @param no
	 * @return
	 */
	
	public boolean returnBook(int no) {
		for(Book book : list) {
			if(book.getNo() == no) {
				if(book.isRent()) {
					// 반납처리
					book.setRent(false);
					dao.ListToFile(list);
					// db업데이트 로직 호출
					dao.update(no);
					System.out.println("반납되었습니다.");
					System.out.println(toString());
					return true;
					
				}else {
					System.err.println("반납가능한 도서가 아닙니다.");
				}
			}
		}
		System.err.println("일련번호에 해당하는 책이 아닙니다.");
		return false;
	}
	
}

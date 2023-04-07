
package com.library;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.library.Dao.FileDao;
import com.library.vo.Book;

public class App {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		App app = new App();
		Library lib = new Library("DB");
		
		
		
		//  로그인 반복 시
		
			
			// 자주 사용하는 로직은 메서드로 빼서 만들면 코드가 간결해진다.
			// 로그인
			
				
				while(true) {
					System.out.println("id를 입력해주세요.");
					String id = app.getString();
					Outter:
					if(id.equalsIgnoreCase("admin")) {
						
						int menu= 0;
						int no = 0;
						System.out.println("관리자 메뉴입니다.");
						while(true) {
							System.out.println("1. 도서 등록  2. 도서삭제  0. 로그아웃  q. 종료");
							System.out.println("메뉴를 입력해주세요");
							menu = app.getInt();
							
							switch (menu) {
							case 1:
								System.out.println("등록할 도서의 일련번호를 입력하세요.");
								no = app.getInt();
								System.out.println("제목을 입력하세요");
								String title = app.getString();
								System.out.println("저자를 입력하세요");
								String author = app.getString();
								lib.insertBook(no, title, author, false);
								
								
								break;
							case 2:
								System.out.println("삭제할 도서의 일련번호를 입력하세요.");
								no = app.getInt();
								lib.deleteBook(no);
								
								break;
							case 0:
								
								break Outter;
								
							default:
								System.err.println(menu + "는 없는 메뉴 입니다.");
								break;
							}
							
						}
						
						
					}
					else {
						int menu = 0;
						int no = 0;
						System.out.println(id + "님, 환영합니다.");
						while(true) {
							System.out.println(lib.toString());
							System.out.println("1. 도서 대여  2. 도서반납  0. 로그아웃  q. 종료");
							System.out.println("메뉴를 선택하세요");
							menu = app.getInt();
							switch (menu) {
							case 1:
								System.out.println("대여할 도서의 일련번호를 입력하세요");
								no = app.getInt();
								lib.rentBook(no);
								
								break;
							case 2:
								System.out.println("반납할 도서의 일련번호를 입력하세요");
								no = app.getInt();
								lib.returnBook(no);
								break;
							case 0:
								
								break Outter;
								
							default:
								System.err.println(menu + "는 없는 메뉴 입니다.");
								break;
							}
							
						}
						
						
						
					}
					
				}

		//책 추가
//		lib.insertBook(1, "불편한편의점", "나카사키", false);
//		lib.insertBook(2, "불편한편의점2", "나카사키", false);
		// lib.toString
//		System.out.println(lib);
		
		
		 //책 삭제
//		int no = 0;
//		boolean res = lib.deleteBook(1);
		
		// 책 대여
//		no = 1;
//		res = lib.rentBook(2);
//		res = lib.returnBook(2);
	}
	
	/**
	 * 사용자로부터 입력받은 문자를 반환한다.
	 * 숫자가 입력될 경우 다시 입력을 요청
	 * @return
	 */
	public String getString() {
		String str = "";
		while(true) {
			try {
				str = scan.next();
				if(str.equalsIgnoreCase("q")) {
					System.out.println("시스템을 종료합니다");
					System.exit(0);
				}
				// 숫자로 변경시 숫자로 변경되면 문자를 입력해달라고 다시 요청
				Integer.parseInt(str);
				System.err.println("문자를 입력해주세요.");
			} catch (Exception e) {
				
				// 문자가 입력된 경우 반목문 탈출
				break;
			}
			
		}
		return str;
	}
	/**
	 * 사용자로부터 정수를 입력받아 반환한ㄴ다
	 * 문자가 입력되었을 경우 다시 입력받는다
	 * q, Q가 입력되었을 경우 프로그램을 종료한다.
	 * 
	 * @return
	 */
	public int getInt() {
		
		int i = 0;
		String str = "";
		while(true) {
			try {
				// 사용자 입력받기
				
				str = scan.next();
				if(str.equalsIgnoreCase("q")) {
					System.out.println("시스템이 종료됩니다.");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				break;
				
			} catch (Exception e) {
				System.err.println("잘못된 입력입니다.");
				System.err.println("다시 입력해주세요.");
				
			}
			
		}
		return i;
		
	}
	
	

}

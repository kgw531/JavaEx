package com.library.Dao;

import java.util.List;

import com.library.vo.Book;

public interface Dao {
	// 파일을 읽어서 리스트를 반환합니다.
	List<Book> getList();
	
	//리스트 파일로 출력
	boolean ListToFile(List<Book> list);
	
	

}

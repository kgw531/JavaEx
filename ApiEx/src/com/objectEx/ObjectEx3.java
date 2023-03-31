package com.objectEx;

import java.util.HashMap;

public class ObjectEx3 {
	
	public static void main(String[] args) {
		HashMap<Key,String> keymap = new HashMap();
		Key key = new Key(1);
		Key key2 = new Key(2);
		Key key3 = new Key(1);
		
		// equals()를 오버라이딩했으므로 true
		System.out.println("키 == 키3" + key.equals(key3));
		
		keymap.put(key, "홍길동");
		keymap.put(key2, "나잘난");
		keymap.put(key3, "너잘난");
		
		System.out.println(keymap.get(key));
		System.out.println(keymap.get(key2));
		System.out.println(keymap.get(key3));
		
	
		
		
		
	}
	
	public void checkEqual() {
		Key key1 = new Key(1);
		Key key2 = new Key(1);
		
		
		// 주소(번지값)을 확인하는 방법
		System.out.println(key1.hashCode());
		System.out.println(key1.toString());
		System.out.println(key2.hashCode());
		System.out.println(key2.toString());
		
		// 비교
		System.out.println(Integer.toHexString(key1.hashCode()));
		System.out.println(Integer.toHexString(key2.hashCode()));
		System.out.println("key1.equals(key2) : " + key1.equals(key2));
		
	}
	

}

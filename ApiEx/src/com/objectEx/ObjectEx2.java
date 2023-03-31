package com.objectEx;

import java.util.HashMap;

public class ObjectEx2 {
	public static void main(String[] args) {
		/**
		 * 		  	타입, 타입을 넣어준다.
		 * HashMap<key,value>
		 * 
		 * 동일한 키가 저장될 수없다.
		 * 이미 존재하는 키를 이용해 데이터를 담을 경우 덮어쓰기된다.
		 * 
		 */
		
		HashMap<String, String> hashmap = new HashMap<>();
		// 데이터를 담는 방법
		hashmap.put("key", "value");
		hashmap.put("key1", "value1");
		hashmap.put(new String("key"), "new value");
		
		// 데이터를 꺼내는 방법
		System.out.println("==========================");
		String str = hashmap.get("key");
		System.out.println(str);
		System.out.println("key1 : " + hashmap.get("key"));
		System.out.println("key2 : " + hashmap.get("key1"));
		
		
		HashMap<String, String> hashmap1 = new HashMap();
		
		hashmap1.put("1", "김건우");
		hashmap1.put("2", "나잘난");
		hashmap1.put("3", "번개맨");
		System.out.println("======================================");
		String str1 = hashmap1.get("2");
		System.out.println(str1);
		System.out.println(hashmap1.get("1"));
		System.out.println("======================================");
		
		HashMap<Integer, String> hashmap2 = new HashMap(); // 숫자로 넣고 싶을 때
		hashmap2.put(1, "손흥민");
		hashmap2.put(2, "박지성");
		hashmap2.put(3, "차범근");
		System.out.println(hashmap2.get(1));
		System.out.println(hashmap2.get(2));
		System.out.println(hashmap2.get(3));
		
		
		
		
		
		
		
		
		
	}

}

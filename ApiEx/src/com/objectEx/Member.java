package com.objectEx;

public class Member {
	private String id;
	
	
	
	public static void main(String[] args) {
	
		Member mem1 = new Member("id");
		
		System.out.println("==================");
		/**
		 * hashcode()
		 * 객체를 식별하는 정수값을 반환한다.
		 * Objcet 클래스의 객체 해쉬코드 메서드는 객체 메모리번지를 이용하여 
		 * 해쉬코드를 만들어 리턴한다.
		 * ==========>> 객체마다 다른 값을 가진다
		 * 두 객체가 동등한 지 비교하는데 사용되어진다.
		 */
		Object obj = new Object();
		//obj.equals();
	
		System.out.println(mem1.hashCode());
		// 16진수로 전환
		String str = Integer.toHexString(0);
		str.equals(str);
		System.out.println("hashcode 16진수로 변환 : " + str);
		System.out.println(mem1.toString());
		
		System.out.println("===========================");
		
		Member mem2 = new Member("id");
		System.out.println(mem1.equals(mem2));
		
	}

	public Member(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	/**
	 * this(Member 객체)가 가지고 있는 id값과 매개변수로 받은 obj 의 id 값이 일치하는 지 비교
	 * 
	 */
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.id.equals(member.id)) {
				System.out.println("obj.equals : " + super.equals(obj));
				return true;
			}
		}
		// 객체가 가지고 있는 id값이 같다면 true 아니면 false
		return false;
	}
	

}

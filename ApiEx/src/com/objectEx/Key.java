package com.objectEx;

public class Key {
	public int number;
	//public String str; 만약 문자열이면
	
	public Key(int number) {
		this.number = number;
	}
	
	
	@Override
	public int hashCode() {
		// 객체의 주소값을 숫자로 반환
		// 생성된 객체마다 다른 주소값을 가지고 있다. -> super.hashcode
		// str.hashcode(); 이렇게 쓰면 됨.
		return number;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key key = (Key)obj;
			if(this.number == key.number) { // int타입이라 == 이거 씀
				return true;
				
			}
		}
		return false;
	}

}

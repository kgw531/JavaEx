package com.jungang.common;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person();
		Person hong = new Person("홍길동", 20, 175.5, 79.7);
		
		System.out.println(person.information()); // 메서드 사용
		System.out.println(hong.information()); // 메서드 사용
		System.out.println("------------------------------");
		
		Person[] personArr = new Person[5];
		personArr[0] = new Person("김지민",20,0,0);
		personArr[1] = new Person("손흥민",30,0,0);
		personArr[2] = new Person("김종국",40,0,0);
		personArr[3] = new Person("한가인",50,0,0);
		personArr[4] = new Person("서태지",60,0,0);
		
		
		for(Person p : personArr) {
			System.out.println(p.information());
			System.out.println("----------------------------");
		}
	}

}

package com.jungang.common;

public class Person {
	protected String name;
	public int age;
	public double height;
	public double weight;
	
	// 
	public Person(){
		// 매개변수의 타입과 객수가 일치해야 생성자를 호출할 수 있다.
		this("정우성",30 ,170, 60); // 주의사항 : 생성자내에서 생성자를 호출할 때 필드에 있는 값 사용불가 -> 매개변수만 사용할 수 있다.
	}
	public Person(String name, int age, double height, double weight){
		// 초기화
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
	
	/**
	 * 이름과 나이를 반환
	 * @return 이름, 나이
	 */
	public String information() {
		return name + "," + age;
		
	}
	
	
	
}

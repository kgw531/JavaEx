package com.kh.inherit.practice;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		Student[] sArry = new Student[3];
		sArry[0] = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
		sArry[1] = new Student("김말똥",21,187.3,80.0,2,"경영학과");
		sArry[2] = new Student("강개순",23,167.0,45.0,4,"정보통신공학과");
		
		for(Student s : sArry) {
			System.out.println(s.information());
		}
		System.out.println("=====================================================");
		// 참조변수의 초기값인 null로 초기화된다.
		Employee[] empArry = new Employee[10];
		Scanner scan = new Scanner(System.in);
		int index = 0;
		
		
		while(true) {
			System.out.println("이름 : ");
			String name = scan.next();
			System.out.println("나이 : ");
			int age = scan.nextInt();
			System.out.println("신장 : ");
			double height = scan.nextDouble();
			System.out.println("몸무게 : ");
			double weight = scan.nextDouble();
			System.out.println("급여 : ");
			int salary = scan.nextInt();
			System.out.println("부서 : ");
			String dept = scan.next();
			
			Employee emp = new Employee(name,age,height,weight,salary,dept);
			empArry[index] = emp;
			
			// 다음 번 방으로 입력
			index++;
			
			// 반복문 탈출
			System.out.println("종료하시려면 n을 입력해주세요.");
			String input = scan.next();
			if(input.equals("n") || index == 9) {
				break;
			}
			
			
			
			
		}
		for(Employee e : empArry) {
			//null 체크
			// e. <-- 주소접근연산자 .을 이용할 경우 null은 주소를 가지고 있지 않으므로 오류가 발생!
			if(e == null) {
				break;
			}
			System.out.println(e.information());
		}
		
		
		
		
	}

}

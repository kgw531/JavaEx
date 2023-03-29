package com.kh.inherit.practice;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Student student1 = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공힉과");
		Student student2 = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		Student student3 = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		String[] student = new String[3];
		student[0] = student1.information();
		student[1] = student2.information();
		student[2] = student3.information();
		// 방법2
		// student[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공힉과");
		// student[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		// student[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		for(String stud : student) {
			System.out.println(stud);
		}
		
		System.out.println("==========================================================");
		
		Employee emp = new Employee();
		Scanner scan = new Scanner(System.in);
		String[] empList = new String[10];
		outter:
		while(true){
			for(int i = 0; i < empList.length; i ++) {
				System.out.println("이름을 입력하세요.");
				String name = scan.next();
				emp.setName(name);
				System.out.println("나이를 입력하세요.");
				int age = scan.nextInt();
				emp.setAge(age);
				System.out.println("신장을 입력하세요.");
				double height = scan.nextDouble();
				emp.setHeight(height);
				System.out.println("몸무게를 입력하세요.");
				double weight = scan.nextDouble();
				emp.setWeight(weight);
				System.out.println("급여를 입력하세요.");
				int salary = scan.nextInt();
				emp.setSalary(salary);
				System.out.println("부서를 입력하세요.");
				String dept = scan.next();
				emp.setDept(dept);
				
				empList[i] = emp.information();
				
			
				System.out.println("y를 누르면 계속되고 n을 누르면 종료합니다.");
				String input = scan.next();
			
				if("y".equals(input)) {
					System.out.println("입력을 계속합니다.");
				
				}else if("n".equals(input)) {
					System.out.println("종료합니다.");
					for(String list : empList) {
						System.out.println(list);
					}
					break outter;
				}
			}
			for(String list : empList) {
				System.out.println(list);
			}
				
			}
		
		}
		
		
		
	}



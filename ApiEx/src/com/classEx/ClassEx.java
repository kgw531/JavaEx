package com.classEx;

public class ClassEx {
	public static void main(String[] args) {
		// Car 클래스의 정보를 얻을 수 있다.
		// 방법1 : Class clazz = Car.class; 
		Class clazz;
		try {
			// 해당 경로에 클래스가 존재 할 경우 클래스를 반환
			// 없는 경우 오류 발생 -->clazz = Class.forName("com.classEx.Car1");

			
			// 라이브러리가 잘 로드되었는 지 확인할 때 사용.
			clazz = Class.forName("com.classEx.Car");
			
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
			System.out.println(clazz.getPackageName());
			
			// 클래스 경로를 활용하여 리소스 절대경로를 얻어오기
			String path = clazz.getResource("photo1.jpg").getPath();
			System.out.println(path);
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 정보를 얻기 실패"); 
		}
		
		
		
	}
}

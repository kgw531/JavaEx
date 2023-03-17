package com.jungang;

public class PrintfEx {

	public static void main(String[] args) {
		String name = "자바라";
		int age = 20;
		String id = "java";
		double height = 1.6;
		int i = 30;
		int money = 1000000;
		
		System.out.println("이름: " + name + " 나이: " + age + " 아이디: " + id);
		System.out.println("--------비교-------------");
		
		// 형식 문자열
		// 지정한 형식문자열에 맞게 값 또는 변수를 지정할 수 있다.
		// %d(정수), %f(실수), %s(문자열) 
		System.out.printf("이름: %s \n나이: %d \n아이디: %s \n키: %f", name, age, id, height );
		System.out.printf("이름: %s \n나이: %d \n아이디: %s \n키: %f", "김건우", 27, "rrd", 173.5 ); // 
		System.out.println("--------------------------------------");
		
		System.out.printf("이름: %s 나이: %d 아이디: %s 키: %f\n", name, age, id, height );
		System.out.printf("이름: %5s 나이: %d 아이디: %s 키: %f\n", name, age, id, height ); // %5s: 왼쪽 공백
		System.out.printf("이름: %-5s 나이: %d 아이디: %s 키: %f\n", name, age, id, height ); // %-5s: 오른쪽 공백
		System.out.printf("이름: %s 나이: %05d 아이디: %s 키: %f\n", name, age, id, height ); // %05s: 빈자리를 0으로 채움(숫자에만 적용)
		
		// 소숫점 정하기
		System.out.printf("이름: %s \n나이: %d \n아이디: %s \n키: %10.2f", name, age, id, height); // %10.2f: 10자리를 차지하고 소숫점 둘 째 자리까지 알려줘.
		System.out.printf("이름: %s 나이: %05d 아이디: %s 키: %f 습도: %d%%\n", name, age, id, height, i ); // %%는 %로 출력
		System.out.printf("이름: %s 나이: %05d \t\t\t아이디: %s 키: %f 습도: %d%%\n", name, age, id, height, i ); // \t는 탭, \n은 줄바꿈
		System.out.println("----------------------------------");
		
		
		System.out.println(money);
		System.out.printf("%,d\n", money); // 세자리 콤마 넣기: %,d
		
		
		//p91. 손코딩
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		System.out.printf("상품의 가격: %-6d원\n", value);
		System.out.printf("상품의 가격: %06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area);
		
		String n = "홍길동";
		String job = "도적";
		System.out.printf("%6d : %-10s : %10s\n", 1, n, job);
		
		//p.88 9번 문제
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int)((int)var1 + var2 + var3 + (int)Double.parseDouble(var4));
		System.out.println(result);
		
		
		
		
		
		
		
		
		
	}

}

package getter.setter;

import java.util.Calendar;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person("123456","홍삼원");
		// p.nation = "한국"; -> 컴파일 오류, 상수필드의 값을 변경할 수 없다.
		p.name = "홍사원";
		
		System.out.println("파이 값 : " + Person.PI);
		System.out.println("지구의 반지름 : " + Person.ERRTH_RADIUS + "km");
		
		
		Calendar cal = Calendar.getInstance();
		
		// 현재 일을 출력
		int day = cal.get(Calendar.DATE);
		int day1 = cal.get(8);
		
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.DATE) + "일");
		System.out.println(cal.get(Calendar.HOUR_OF_DAY) + "시");
		System.out.println(cal.get(Calendar.MINUTE) + "분");
		System.out.println(cal.get(Calendar.SECOND) + "분");
		
		
		// 실행전
		long before = System.currentTimeMillis();
		long after = System.currentTimeMillis();
		

	}

}

package array;

public class _04_ArrayEx {

	public static void main(String[] args) {
		// 스트링 타입의 배열 5칸을 만들기
		// 첫 번째칸에 이름 입력하기
		
		String[] names = new String[5];
		names[0] = "김건우";
		
		// 자바에서 참조형 변수의 메모리 주소를 표시하는 방법1 : 직접 찍기
		System.out.print("names 배열의 메모리 주소 : "); // @ 뒤에가 메모리 주소
		System.out.println(names);
		
		
		// 자바에서 참조형 변수의 메모리 주소를 표시하는 방법2
		System.out.println("names 객체의 hashcode: " + names.hashCode());
		
		// 16진수로 표시하는 방법1
		System.out.println("16진수로 변환 : " + Integer.toHexString(names.hashCode()));
		; 
		// 16진수로 표시하는 방법2
		System.out.printf("%x", names.hashCode());
		
	}

}

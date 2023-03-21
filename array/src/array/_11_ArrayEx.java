package array;

public class _11_ArrayEx {

	public static void main(String[] args) {
		String[] oldStrArr = {"java","array","copy"};
		String[] newStrArr = new String[5];
		
		// 5개의 매개변수를 가진다.
		//(원본배열, 복사시작 index, 새로운 배열, 새배열에 복사를 시작 할 인덱스, 복사 할 갯수)
		System.arraycopy(oldStrArr, 0, newStrArr, 1, oldStrArr.length); 
		System.arraycopy(oldStrArr, 0, newStrArr, 0, 0);
		
		// 방법1
		for(int i = 0; i < newStrArr.length;i++) {
			System.out.println(newStrArr[i]);
		}
		
		System.out.println("------------------------------");
		
		// 방법2
		// 향상된 for문을 이용하는 방법
		// for(타입 변수명 : 배열의 이름)
		// 0 ~ 배열명.length까지 newStrArr의 요소를 모두 순회하여 변수에 담는다.
		for(String str : newStrArr) {
			System.out.println(str);
		}
		// 결과는 방법1과 방법2가 같다.
		
		

	}

}

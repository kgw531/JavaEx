package array;

public class ArrayPrac2 {

	public static void main(String[] args) {
		// 배열 선언의 총 정리
		
		
		// 1차원 배열 선언 총 정리
		// 기본타입 
		int[] intArray1 = {1,2,3,4};
		
		int[] intArray2;
		intArray2 = new int[] {1,2,3,4,5};
		
		int[] intArray3 = new int[2]; // 배열의 index수를 지정 
		intArray3[0] = 1;
		intArray3[1] = 1;
		
		// 참조타입
		String[] strArr1 = {"1","2","3","4"};
		
		String[] strArr2;
		strArr2 = new String[] {"2","3","4"};
		
		String[] strArr3 = new String[3];
		strArr3[0] = "3";
		strArr3[1] = "1";
		strArr3[2] = "2";
		
		String[] strArr4 = new String[3];
		strArr3[0] = new String("3");
		strArr3[1] = "1";
		strArr3[2] = "3";
		
		// 2차원 배열 선언 총 정리
		// 기본타입
		int[][] intArr1 = {{1,2,3,},{4,5,6}};
		
		int[][] intArr2 = new int [2][3];
		intArr2[0] = new int[]{1,2,3};
		intArr2[1] = new int[]{4,5,3};
		
		for(int i = 0; i < intArr2.length; i ++) {
			int[] check = intArr2[i];
			for(int j = 0; j < check.length; j++) {
				System.out.println(check[j]);
			}
		}// 잘 들어갔나 확인
		
		// 참조타입
		String[][] strArray1 = {{"딸기","참외"},{"메론, 수박"}};
		
		String[][] strArray2 = new String[2][3];
		strArray2[0] = new String[] {"손흥민", "해리케인","클루셉스키"};
		strArray2[1] = new String[] {"안데르송", "페리시치","히샬리송"};
		for(int i = 0; i < strArray2.length; i++) {
			String[] check = strArray2[i];
			for(int j = 0; j < check.length; j++) {
				System.out.println(check[j]);
		}// 확인
		
			
			
		
		}

	}
	
}

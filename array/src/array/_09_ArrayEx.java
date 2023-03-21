package array;

public class _09_ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[3];
		names[0] = new String("java"); 
		names[1] = new String("java");
		names[2] = "C#";
		
		if(names[0].equals(names[1])) { // ==는 참조타입의 변수가 가지고 있는 주소를 비교, equals는 문자열 자체를 비교
			System.out.println("0번방 == 1번방");
		}else{
			System.out.println("0번방 != 1번방");
		}
		
	}

}

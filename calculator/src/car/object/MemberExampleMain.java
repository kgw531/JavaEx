package car.object;

public class MemberExampleMain {

	public static void main(String[] args) {
		Member member = new Member();
		
		member.name = "최하얀";
		System.out.println("이름: " + member.name);
		member.age = 23;
		System.out.println("나이 : " + member.age);

	}

}

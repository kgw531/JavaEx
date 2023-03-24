package getter.setter;

public class SingletonMain {

	public static void main(String[] args) {
		SingletonEx ex1 = SingletonEx.getInstance();
		SingletonEx ex2 = SingletonEx.getInstance();
		SingletonEx ex3 = SingletonEx.getInstance();
		SingletonEx ex4 = SingletonEx.getInstance();
		SingletonEx ex5 = SingletonEx.getInstance();
		
		if(ex1 == ex2) { // 참조변수를 비교할 땐 주소값을 비교한다.
			System.out.println("같은 객체예요!");
		}else {
			System.out.println("다른 객체에요!");
		}

	}

}

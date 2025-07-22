package singelTon;

public class Main {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingleton();
		singleton.print("hello");
		Singleton s1 = Singleton.getSingleton();
		s1.print("sh");

	}

}

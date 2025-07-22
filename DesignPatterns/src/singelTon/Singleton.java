package singelTon;

public class Singleton {
	private static Singleton instance;
	
	private Singleton() {
		System.out.println("Singleton Created!");
		
	}
	public static Singleton getSingleton() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void print(String message) {
		
		System.out.println(message);
	}

}

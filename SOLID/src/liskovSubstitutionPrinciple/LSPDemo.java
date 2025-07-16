package liskovSubstitutionPrinciple;

public class LSPDemo {

	public static void main(String[] args) {
		Bird sparrow = new Sparrow();
		Bird penguin = new Penguin();
		sparrow.move();
		penguin.move();

	}

}

package liskovSubstitutionPrinciple;

// Software entities should be open for extension, but closed for modification.
public class LSPDemo {

	public static void main(String[] args) {
		Bird sparrow = new Sparrow();
		Bird penguin = new Penguin();
		sparrow.move();
		penguin.move();

	}

}

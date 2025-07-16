package interfaceSegregationPrinciple;

public class Human implements Workable, Eatable{

	@Override
	public void eat() {
		System.out.println("Human can eat");
		
	}

	@Override
	public void work() {
		System.out.println("Human can work");
		
	}

	

	

}

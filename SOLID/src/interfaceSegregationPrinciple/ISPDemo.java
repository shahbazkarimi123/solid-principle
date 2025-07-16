package interfaceSegregationPrinciple;

public class ISPDemo {

	public static void main(String[] args) {
		Workable human = new Human();
		Workable robot = new Robot();
		
		human.work();
		((Human)human).eat();
		
		robot.work();

	}

}

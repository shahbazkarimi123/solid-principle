package strategy;

public class UPIStrategy implements Strategy{

	@Override
	public void pay(int amount) {
		System.out.println("Paid "+amount+" using UPI");
		
	}

}

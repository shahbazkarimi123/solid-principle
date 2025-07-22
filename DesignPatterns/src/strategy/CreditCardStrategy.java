package strategy;

public class CreditCardStrategy implements Strategy{

	@Override
	public void pay(int amount) {
		System.out.println("Paid "+amount+" using Credit Card");
		
	}

}

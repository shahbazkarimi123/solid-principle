package strategy;

public class PayPalStrategy implements Strategy{

	@Override
	public void pay(int amount) {
		System.out.println("Paid "+amount+" using Paypal");
		
	}

}

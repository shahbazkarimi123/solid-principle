package strategy;

public class Context {
	private Strategy strategy;
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	public void payBill(int amount) {
		if(strategy==null) {
			System.out.println("Payment method not selected.");
			return;
		}
		strategy.pay(amount);
		
	}

}

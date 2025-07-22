package strategy;

public class Main {

	public static void main(String[] args) {
		Context context = new Context();
		context.setStrategy(new CreditCardStrategy());
		context.payBill(500);
		
		context.setStrategy(new UPIStrategy());
		context.payBill(800);
		
		context.setStrategy(new PayPalStrategy());
		context.payBill(300);

	}

}

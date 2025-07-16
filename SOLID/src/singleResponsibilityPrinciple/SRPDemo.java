package singleResponsibilityPrinciple;

public class SRPDemo {

	public static void main(String[] args) {
		Invoice invoice = new Invoice("Kaju",5);
		PersistanceInvoice pInvoice = new PersistanceInvoice();
		pInvoice.saveToFile(invoice);
		

	}

}

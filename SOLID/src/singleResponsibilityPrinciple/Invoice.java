package singleResponsibilityPrinciple;

public class Invoice {
	private String item;
	private int quantity;
	
	public Invoice(String item, int quantity) {
		this.item = item;
		this.quantity = quantity;
		
	}
	public String getItem() {
		return this.item;
	}
	public int getQuantity() {
		return this.quantity;
	}

}

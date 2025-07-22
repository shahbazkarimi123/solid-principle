package openClosedPrinciple;
// Software entities should be open for extension, but closed for modification.
public class OCPDemo {
	public static void main(String[] args) {
		Premium premium = new Premium();
		Regular regular = new Regular();
		DiscountCalulate  discountCal = new DiscountCalulate();
		System.out.println(discountCal.calculateDiscount(regular));
		System.out.println(discountCal.calculateDiscount(premium));
	}
}

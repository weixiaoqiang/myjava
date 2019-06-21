package book;

public class DiscountBook extends Book {

	private double discount;

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public double getPrice() {
		return super.getPrice()*this.getDiscount();
	}
}

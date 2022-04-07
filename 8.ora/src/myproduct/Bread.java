package myproduct;

public class Bread extends Product{
	
	private double unit;
	
	public Bread(String name, int price, int vat, double unit) {
		super(name,price,vat);
		this.unit=unit;
	}
	
	@Override
	public String toString() {
		String to="name:"+getName()+" brutto price "+getBrutt()+" quantity price "+getUnitPrice();
		return to;
	}
	
	@Override
	double getUnitPrice(){
		return getBrutt()/unit;
		
	}
	public static boolean breadPrice(Bread A, Bread B) {
		if(A.getUnitPrice() > B.getUnitPrice()) {
			return true;
		}
		return false;
	}
}
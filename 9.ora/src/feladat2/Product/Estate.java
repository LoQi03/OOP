package feladat2.Product;

import feladat2.Model.Sales;

public class Estate implements Sales {
	
	private String currency;
	private int price;
	private int size;
	private String city;
	
	public Estate(int price, int size, String city) {
		this.price = price;
		this.size = size;
		this.city = city;
		this.currency = "Ft";
	}
	
	public int getUnitPrice() {
		return Math.round((float)this.price / this.size);
	}

	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "Estate [currency=" + currency + ", price=" + price + ", size=" + size + ", city=" + city + "]";
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
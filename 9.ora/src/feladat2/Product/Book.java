package feladat2.Product;

import Products.Product;

public class Book extends Product {


	public Book(String name, int nettoPrice, int vat) {
		super(name, nettoPrice, vat);
		super.setCurrency("Ft");
	}
	
}
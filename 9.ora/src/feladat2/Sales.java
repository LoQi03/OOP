package feladat2;

public interface Sales {

	int defaultPrice = 1;
	String Currency = "FT";
	
	String getCurrency();
	void setCurrency(String currency);

	int getPrice();
	void setPrice(int price);
}

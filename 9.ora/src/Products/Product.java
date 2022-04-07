package Products;

import feladat2.Model.Sales;

public class Product implements Sales{


	private String name;
    private int netPrice;
    private int vat;
    private String Curency;
    private int price;
    public int getGrossPrice() {
        double vatAmount = ((double) vat / 100.0) * netPrice;
        return (int) (vatAmount + netPrice);
    }

    public void increaseNetPrice(int percent) {
        netPrice += netPrice * (percent / 100.0);
    }

    public int comapreGrossPrice(Product other) {
        if (this.getGrossPrice() > other.getGrossPrice()) {
            return 1;
        } else if (this.getGrossPrice() == other.getGrossPrice()) {
            return 0;
        } else {
            return -1;
        }
    }

    public Product(String name, int price, int vat) {
        super();
        this.name = name;
        this.price = price;
        this.vat = vat;
        
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(int netPrice) {
        this.netPrice = netPrice;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

	@Override
	public String getCurrency() {
		return Curency;
	}

	@Override
	public void setCurrency(String currency) {
		this.Curency=currency;
	}

	@Override
	public int getPrice() {
		return this.price;
	}

	@Override
	public void setPrice(int price) {
		this.price=price;
	}

    @Override
	public String toString() {
		return "Product [name=" + name + ", Price=" + price + ", vat=" + vat + ", Curency=" + Curency + ", price="
				+ price + "]";
	}
    
    
}
package myproduct;

	public abstract class Product {
		private String name;
		private int price;
		private int vat;
		public Product(String name, int price, int vat) {
			this.name=name;
			this.price=price;
			this.vat=vat;
		}
		
		public Product(String name, int price) {
			this.name=name;
			this.price=price;
		}
		
		public void decreasePrice(int percent) {
			double redamount=Math.round(((double)this.price/100)*percent);
			this.price=(int) (this.price-redamount);	
		}
		
		
		public int getPrice() {
			return price;
		}
		
		public int getVat() {
			return vat;
		}
		
		public void setPrice(int price) {
			this.price=price;
		}

		abstract double getUnitPrice();


		public int getBrutt()
		{
			int brutt=price+((price*vat)/100);
			return brutt;
		}
		public String getName() {
			return this.name;
		}
		
		@Override
		public String toString() {
			String to="name:"+name+" brutto price "+getBrutt();
			return to;
		}
		
		public void incPrice(int percent) {
			price=price+((price*percent)/100);
		}
		
		public int comparePrice(Product A) {
			if(this.getBrutt() > A.getBrutt()) {
				return 1;
			}
			else if(this.getBrutt() < A.getBrutt() ) {
				return -1;
			}
			else {
				return 0;
			}
		}	
	}

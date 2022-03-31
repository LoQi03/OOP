package myproduct;

import java.util.Hashtable;


public class Book extends Product{
	
	private String author;
	private String title;
	private final int yearOfPublication;
	private int pages;
	private String style;
	
	public void setPages(int pages) {
		if(pages>=0) {
			this.pages=pages;
		}
		
	}
	
	public static Book getLonger(Book BookA, Book BookB) {
		if(BookA.getPages()==BookB.getPages()) {
			return BookA;
		}
		else if(BookA.getPages()>BookB.getPages()){
			return BookA;
		}
		else {
			return BookB;
		}
	}
	
	
	
	public int getPages() {
		return pages;
	}

	
	
	public Book(String author, String title, int price, int pages,String style) {
		super("Book",price);
		if(pages<0) {
			this.pages=0;
		}
		else {
			this.pages=pages;
		}
		this.author=author;
		this.title=title;
		java.time.LocalDate currentDate = java.time.LocalDate.now();
		int year = currentDate.getYear();
		this.yearOfPublication=year;
		this.style=style;
	}
	
	
	public Book(String author, String title,String style) {
		super("Book",2500);
		this.pages=100;
		this.author=author;
		this.title=title;
		java.time.LocalDate currentDate = java.time.LocalDate.now();
		int year = currentDate.getYear();
		this.yearOfPublication=year;
		this.pages=100;
		this.style=style;
		
		
	}
	

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public int getPrice() {
		return super.getPrice();
	}

	public void setPrice(int price) {
		super.setPrice(price);
	}

	public static int comparePublicationDate(Book bookA, Book bookB) {
		if(bookA.getYearOfPublication()>bookB.getYearOfPublication()) {
			return 1;
		}
		else if(bookA.getYearOfPublication()<bookB.getYearOfPublication()) {
			return 2;
		}
		else {
			return 0;
		}
		
	}
	
	public boolean hasEvenPages() {
		if(this.getPages()%2==0) {
			return true;
		}
		return false;
	}
	
	
	public String toString() {
		String datas= "Author:"+author+" title:"+title+" YOR:"+yearOfPublication+" price:"+getPrice()+" pages:"+pages+" style:"+style;
		return datas;
	}
	
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public static void listBookArray(Book[] array) {
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i].toString());
		}
	}
	
	public static Book getLongestBook(Book[] array) {
		Book max= array[0];
		for(int i=0; i<array.length;i++) {
			if(array[i].getPages()>max.getPages()) {
				max=array[i];
			}
		}
		return max;
		
	}
	
	
	public static Book getLongestEvenPagesBook(Book[] array) {
		Book max=null;
		for(int i=0; i<array.length;i++) {
			if(array[i].hasEvenPages() && (max==null || max.getPages()<array[i].getPages())) {
				max=array[i];
			}
		}
		return max;
	}
	
	public static void authorStatistics(Book[] books){
        Hashtable<String, Integer> dict = new Hashtable<String, Integer>();
        for (Book book : books){
            if (dict.containsKey(book.getAuthor())){
                dict.put(book.getAuthor(), dict.get(book.getAuthor()) + 1);
            }else {
                dict.put(book.getAuthor(), 1);
            }
        }

        dict.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }
	
	
	@Override
	public void decreasePrice(int percent) {
		if( getStyle().equalsIgnoreCase("children")) {
			super.decreasePrice(percent+7);
		}
		if( getStyle().equalsIgnoreCase("guide")) {
			super.decreasePrice(percent+5);
		}  
		
	}
	
	
	
	public static int countStyles(Book[] books) {       
        Hashtable<String, Integer> dict = new Hashtable<String, Integer>();
        for (int i=0; i<books.length;i++){
            if (dict.containsKey(books[i].getStyle())){
                dict.put(books[i].getStyle(), dict.get(books[i].getStyle()) + 1);
            }else {
                dict.put(books[i].getStyle(), 1);
            }
        }
        return dict.size();
	}

	public static void discountBooks(Book[] books, String style) {
		for(int i=0; i<books.length;i++) {
			if(books[i].getStyle() == style) {
				books[i].setPrice(books[i].getPrice()-((books[i].getPrice()/100)*10));
			}
		}
	}

	public static int listBooksWithStyle(Book[] books, String style) {
		int count=0;
		for(int i=0;i<books.length;i++) {
			if(books[i].getStyle().equalsIgnoreCase(style)) {
				books[i].toString();
				count++;
			}
		}
		return count;
	}
	
	public static int avgPrice(Book[] books, String style) {
		int count=0;
		int avarage=0;
		int sum=0;
		for(int i=0;i<books.length;i++) {
			if(books[i].getStyle().equalsIgnoreCase(style)) {
				sum=sum+books[i].getPrice();
				count++;
			}
		}
		
		if(count==0) {
			return 0;
		}
		
		avarage= (sum/count);
		return avarage;
	}

	@Override
	public
	double getUnitPrice() {
		return getBrutt()/pages;
	}
	
	
	
}

<<<<<<< HEAD
package feladat2;

public class Book {
	private String title;
	private String author;
	private int yop;
	private int price;
	
	public int incvalue(int percentage)
	{
		return this.price+=(int)(price*(percentage/100.00));
	}
	public String toString()
	{
		return "Book:(Title: "+this.title+" Author: "+this.author+" Year of production: "+this.yop+" Price: "+this.price+")";
	}
	public String setTitle(String input)
	{
		return this.title=input;
	}
	public String setAuthor(String input)
	{
		return this.author=input;
	}
	public int setYop(int input)
	{
		return this.yop=input;
	}
	public int setPrice(int input)
	{
		return this.price=input;
	}
	
	public String getTitle(String input)
	{
		return this.title;
	}
	public String getAuthor(String input)
	{
		return this.author;
	}
	public int getYop(int input)
	{
		return this.yop;
	}
	public int getPrice(int input)
	{
		return this.price;
	}
}
=======
package feladat2;

public class Book {
	private String title;
	private String author;
	private int yop;
	private int price;
	public int incvalue(int percentage)
	{
		return this.price+=(int)(price*(percentage/100.00));
	}
	public String toString()
	{
		return "Book:(Title: "+this.title+" Author: "+this.author+" Year of production: "+this.yop+" Price: "+this.price+")";
	}
	public String setTitle(String input)
	{
		return this.title=input;
	}
	public String setAuthor(String input)
	{
		return this.author=input;
	}
	public int setYop(int input)
	{
		return this.yop=input;
	}
	public int setPrice(int input)
	{
		return this.price=input;
	}
	
	public String getTitle(String input)
	{
		return this.title;
	}
	public String getAuthor(String input)
	{
		return this.author;
	}
	public int getYop(int input)
	{
		return this.yop;
	}
	public int getPrice(int input)
	{
		return this.price;
	}
}
>>>>>>> branch 'master' of https://github.com/LoQi03/OOP

package feladat3;

public class Person {
	private String name;
	private int weight;
	private int height;
	
	public double TTI()
	{
		return (double)(this.weight/(double)(this.height*this.height));
	}
	public String Obesity()
	{
		if(this.TTI()<18.5)
		{
			return "thin";
		}
		else if(this.TTI()>25)
		{
			return "obese";
		}
		else
		{
			return "normal";
		}
	}
	public String toString()
	{
		return "Person:(Name: "+this.name+" Weight: "+this.weight+" Height: "+this.height+" TTI: "+this.Obesity()+")";
	}
	public String setName(String input)
	{
		return this.name=input;
	}
	public int setWeight(int input)
	{
		return this.weight=input;
	}
	public int setHeight(int input)
	{
		return this.height=input;
	}
	public String getName()
	{
		return this.name;
	}
	public int getWeight()
	{
		return this.weight;
	}
	public int getHeight()
	{
		return this.height;
	}
}

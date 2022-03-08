package feladat3;

public class Person {
	private String name;
	private int weight;
	private double height;
	
	public double TTI()
	{
		return (double)(weight/(height*height));
	}
	public String Obesity()
	{
		if(this.TTI()<18.5)
		{
			return "thin";
		}
		else if(this.TTI()>25.0)
		{
			return "obese";
		}
		else
		{
			return "normal";
		}
	}
	@Override
	public String toString()
	{
		return "Person:[Name: "+this.name+" Weight: "+this.weight+" Height: "+this.height+"m TTI: "+this.Obesity()+"]";
	}
	public String setName(String input)
	{
		return this.name=input;
	}
	public int setWeight(int input)
	{
		return this.weight=input;
	}
	public double setHeight(double input)
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
	public double getHeight()
	{
		return this.height;
	}
}

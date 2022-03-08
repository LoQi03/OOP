package feladat1;

import java.util.Scanner;

public class Main2 {
	static Scanner input= new Scanner(System.in);
	public static void main(String[] args) {
		Rectangle[] array = new Rectangle[10];
		arrayUpload(array);
		arrayPrint(array);
		System.out.println("The smallest rectangle details:"+array[minIndex(array)].toString());
		Rectangle x = read();
		System.out.println(x.toString());
		System.out.println("Count of the bigger rectangle:"+CompareRectangle(array,x));
		System.out.println("The same rectangle index: "+((findTheEq(array,x)==-1)?"not exist":findTheEq(array,x)));
	}
	public static void arrayUpload(Rectangle[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			array[i]=new Rectangle(((int)(Math.random()*10-2+1)+2),((int)(Math.random()*10-2+1)+2));
		}
	}
	public static void arrayPrint(Rectangle[] array)
	{
		for(Rectangle item : array)
		{
			System.out.println(item.toString());
		}
	}
	public static int minIndex(Rectangle[] array)
	{
		int min=0;
		for(int i=1;i<array.length-1;i++)
		{
			if(array[min].getArea()>array[i].getArea())
			{
				min=i;
			}
		}
		return min;
	}
	public static Rectangle read()
	{
		boolean ok;
		int x=0,y=0;
		System.out.println("Please give me a rectangle details:");
		do
		{
			ok=true;
			try
			{
				System.out.println("Please give me the x value:");
				x=input.nextInt();
				input.nextLine();
				System.out.println("Please give me the y value:");
				y=input.nextInt();
			}
			catch(Exception e)
			{
				System.out.println("Wrong values!");
				ok=false;
			}
		}while(!ok && x<2 && y<2);
		Rectangle z = new Rectangle(x,y);
		return z;
	}
	public static int CompareRectangle(Rectangle[] array,Rectangle x)
	{
		int count=0;
		for(Rectangle item:array)
		{
			if(item.getArea()>x.getArea())
			{
				count++;
			}
		}
		return count;
	}
	public static int findTheEq(Rectangle[] array,Rectangle x)
	{
		int index=-1;
		
		for(int i=0;i<array.length;i++)
		{
			if(x.getArea()==array[i].getArea())
			{
				index=i;
			}
		}
		
		return index;
	}
	
}

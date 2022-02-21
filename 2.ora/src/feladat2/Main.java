package feladat2;

import java.util.Scanner;

public class Main {
	static Scanner input= new Scanner(System.in);
	public static void main(String[] args) {
		int arrSize=read(1,15);
		String[] names = new String[arrSize];
		readNames(names);
		printNames(names);
		String keyman=read();
	}
	public static int read(int min, int max)
	{
	int n = 0;
	do {
	while (!input.hasNextInt()) {
		System.out.println("That's not a number");
		input.next();
	}
		n = input.nextInt();
		input.nextLine();
	} while (n<min || n>max);
	return n;
	}
	public static void readNames(String[] names)
	{
		for(int i=0;i<names.length;i++)
		{
			System.out.print("Name "+(i+1)+":");
			names[i]=input.nextLine();
		}
		
	}
	public static void printNames(String[] names)
	{
		for(String name : names)
		{
			System.out.println(name);
		}
		
	}
	public static String read()
	{
		System.out.println("Adj meg egy nevet!");
		return input.nextLine();
	}
	public static boolean IsContaine(String[] names,String keyman)
	{
		for(String name : names)
		{
			if(name.equals(keyman))
			{
				return true;
			}
		}
		return false;
	}
	
}

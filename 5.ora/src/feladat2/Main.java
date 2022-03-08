package feladat2;

import java.util.Scanner;

public class Main {
	static Scanner input= new Scanner(System.in);
	public static void main(String[] args) {
		SoundDisc[] discs=new SoundDisc[read()];
		discs=uploadDiscs(discs);
		System.out.println(discs[maxLengthIndex(discs)].toString());
		printDiscs(discs);
	}
	public static int read()
	{
		int out=0;
		boolean ok;
		do
		{
			System.out.println("Please enter the number of disks:");
			ok=true;
			try {
				out=input.nextInt();
			}
			catch(Exception e)
			{
				System.out.println("Wrong input!");
				ok=false;
			}
		}while(!ok);
		input.nextLine();
		return out;
	}
	public static SoundDisc readDisc(int index)
	{
		SoundDisc out = new SoundDisc();
		boolean ok;
		do
		{
			System.out.println("Please give me the "+ index+". details(like this(a,t,l)):");
			String row=input.nextLine();
			String[] elements=row.split(",");
			ok=true;
			try {
				out.setAuthor(elements[0]);
				out.setTitle(elements[1]);
				out.setLength(Integer.parseInt(elements[2]));
			}
			catch(Exception e)
			{
				System.out.println("Wrong input!");
				ok=false;
			}
			
		}while(!ok);
		return out;
	}
	public static SoundDisc[] uploadDiscs(SoundDisc[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			array[i]=readDisc(i);
		}
		return array;
	}
	public static int maxLengthIndex(SoundDisc[] array)
	{
		int index=0;
		for(int i=1;i<array.length;i++)
		{
			if(array[index].getLength()<array[i].getLength())
			{
				index=i;
			}
		}
		return index;
	}
	public static void printDiscs(SoundDisc[] array)
	{
		for(SoundDisc item : array)
		{
			System.out.println(item.toString());
		}
	}
}

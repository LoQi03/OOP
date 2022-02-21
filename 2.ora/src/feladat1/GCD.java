package feladat1;

import java.util.Scanner;

public class GCD {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int a =read(1,10);
		int b=read(5,15);
		System.out.println(GCD(a,b));
	}
	public static int GCD(int a,int b) {
		if(b==0)
		{
			return a;
		}
		return GCD(b,a%b);
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
	public static void PrintPrimes(int N,int start)
	{
		int primecount=0;
		while(primecount<N)
		{
			for (int i=2;i<start;i++)
			{
				if(GCD(start,i)==1)
				{
					primecount++;
				}
				if(primecount>=N)
				{
					break;
				}
				start++;
			}
		}
	}
}

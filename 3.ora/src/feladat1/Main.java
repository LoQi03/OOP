package feladat1;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		repeat();
	}
	public static void calc(int x,int y,char op)
	{
		switch(op)
		{
			case '+':
			{
				System.out.println(x+y);
				break;
			}
			case '-':
			{
				System.out.println(x-y);
				break;
			}
			case '*':
			{
				System.out.println(x*y);
				break;
			}
			case '/':
			{
				if(y!=0)
				{
				System.out.println(x/y);
				}
				else
				{
					System.out.println("Cannot be divided by 0");
				}
				break;
			}
			default:
			{
				System.out.println("Bad parameters!");
				break;
			}
		}
	}
	public static void repeat()
	{		
		char quit=' ';
		while(quit!='y')
		{
			System.out.println("Just write a task for me!");
			String inString=input.nextLine();
			String[] strArray=inString.split(" ");
			int x=Integer.parseInt(strArray[0]);
			int y=Integer.parseInt(strArray[2]);
			char op=strArray[1].charAt(0);
			calc(x,y,op);
			System.out.println("If you want quit please type y, if not please type n!");
			quit=input.nextLine().charAt(0);
		}
	}
}

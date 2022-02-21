package feladat2;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		arrUpload(numbers);
		arrPrint(numbers);
		findMaxCouple(numbers);
		countSquareNum(numbers);
		System.out.println("SquareAVG: "+calcSquareAVG(numbers));
	}
	public static void arrUpload(int[] numbers)
	{
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]=(int)(Math.random()* 50)+1;
		}
	}
	public static void arrPrint(int[] numbers)
	{
		for(int num:numbers)
		{
			System.out.println(num);
		}
	}
	public static void findMaxCouple(int [] numbers)
	{
		int max=0;
		for(int num:numbers)
		{
			if(num%2==0 && max<num)
			{
				max=num;
			}
		}
		System.out.println("The biggest couple number is:"+max);
	}
	public static void countSquareNum(int [] numbers)
	{
		int Scount=0;
		for(int num:numbers)
		{
			if(Math.sqrt(num)%1==0)
			{
				Scount++;
			}
		}
		System.out.println("SquareNums:"+Scount);
	}
	public static double calcSquareAVG(int[] numbers)
	{
		int sum=0;
		for(int num:numbers)
		{
			sum+=Math.pow(num, 2);
		}
		return Math.sqrt(sum/numbers.length);
	}
}

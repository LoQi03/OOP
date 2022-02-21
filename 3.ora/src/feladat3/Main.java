package feladat3;
import java.lang.Math;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int[] num=new int[3];
		read(num);
		calc(num[0],num[1],num[2]);
	}
	public static void read(int[] num)
	{
		boolean ok;
		do {
			 System.out.print("Az egyenlet konstansai vesszõvel elválasztva: ");
			 String inString = input.nextLine();
			 String[] strArray = inString.split(",");
			 	ok = true;
			 try {
				num[0] = Integer.parseInt(strArray[0]);
				num[1] = Integer.parseInt(strArray[1]);
				num[2] = Integer.parseInt(strArray[2]);
			 }
			 catch (NumberFormatException ex) {
				 ok = false;
			 }
			} while (!ok);

	}
	public static void calc(int a, int b,int c)
	{
		double[] x = new double[2];
		String result="";
        int d = b * b - 4 * a * c;
        if (d > 0) {
            x[0] = (-b + Math.sqrt(d)) / (2.0 * a);
            x[1] = (-b - Math.sqrt(d)) / (2.0 * a);
            result = "x1 = " + x[0] + " ; x2 = " + x[1];
        } else if (d == 0) {
            x[0] = (-b / 2 * a);
            result = "x = " + x[0];
        } else {
            result = "Nincs valós megoldás!";
        }
        System.out.println(result);
	}
}

package feladat3;

import java.util.Scanner;

public class Main {
	static Scanner input= new Scanner(System.in);
	public static void main(String[] args) {
		Person p = new Person();
		p=Readp();
		System.out.println(p.toString());

	}
	public static Person Readp()
	{
		Person p=new Person();
		boolean ok;
		do {
			 System.out.println("Height(m),Weight(kg),FullName");
			 String inString = input.nextLine();
			 String[] strArray = inString.split(",");
			 	ok = true;
			 try {
				p.setHeight(Double.parseDouble(strArray[0]));
				p.setWeight(Integer.parseInt(strArray[1]));
				p.setName(strArray[2]);
			 }
			 catch (Exception e) {
				 ok = false;
			 }
			} while (!ok);
		return p;
	}
	
}

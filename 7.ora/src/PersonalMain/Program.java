package PersonalMain;
import java.util.Scanner;

import PersonalData.Child;
import PersonalData.Parent;
import PersonalData.Person;

public class Program {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("First person:");
		Person p1=readPerson();
		System.out.println("Second person:");
		Person p2=readPerson();
		System.out.println(p1);
		System.out.println(p2);
		/*if(p1 instanceof Person)
		{
			System.out.println("Ez egy ember!");
		}*/
	}
	public static Person readPerson()
	{
		Person p=new Person();
		boolean ok;
		do {
			ok=true;
			System.out.println("Please give me the person details(Name,Age):");
			try
			{
				String row=input.nextLine();
				String[] item=row.split(",");
				p.setName(item[0]);
				p.setAge(Integer.parseInt(item[1]));
			}
			catch(Exception e)
			{
				ok=false;
			}
		}while(!ok);
		if(p.getAge()<18)
		{
			Child child = new Child(p.getName(), p.getAge(), readSchool());
			return child;
		}
		else
		{
			Parent parent= new Parent(p.getName(),p.getAge(),readWorkplace());
			return parent;
		}
	}
	public static String readSchool()
	{
		System.out.println("Please give me the School name:");
		return input.nextLine();
	}
	public static String readWorkplace()
	{
		System.out.println("Please give me the Workplace name:");
		return input.nextLine();
	}
	
}

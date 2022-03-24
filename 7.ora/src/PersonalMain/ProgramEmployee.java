package PersonalMain;
import java.util.Arrays;
import java.util.Scanner;
import PersonalData.Child;
import PersonalData.Employee;
import PersonalData.Parent;
import PersonalData.Person;

public class ProgramEmployee {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Person pArray[]=new Person[readInt()];
		uploadPerson(pArray);
		Arrays.sort(pArray,(a,b) -> a.getAge()-b.getAge());
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
			if(parent.getWorkplace().isEmpty())
			{
				return parent;
			}
			else
			{
				Employee emp= new Employee(parent.getName(),parent.getAge(),parent.getWorkplace(),readPayment());
				return emp;
			}
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
	public static int readPayment()
	{
		System.out.println("Please give me the salary:");
		return input.nextInt();
	}
	public static int readInt()
	{
		boolean ok;
		int out=0;
		do {
			ok=true;
			System.out.println("Please give me the number of persons:");
			try
			{
				out= input.nextInt();
			}
			catch(Exception e)
			{
				ok=false;
			}
			input.nextLine();
		}while(!ok);
		return out;
	}
	public static void uploadPerson(Person array[])
	{
		for(Person item:array)
		{
			item=readPerson();
		}
	}
	public static void printPerson(Person array[])
	{
		for(Person item:array)
		{
			System.out.println(item);
		}
	}
}

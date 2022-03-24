package PersonalData;

public class Person {
	private int Age;

	private String Name;
	
	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public boolean IsYounger(Person other)
	{
		if(this.getAge()>other.getAge())
		{
		return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Person [Age=" + Age + ", Name=" + Name + "]";
	}
}

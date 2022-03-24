package PersonalData;

public class Employee extends Parent {
	
	private int salary;
	private final int retirementage=65;
	public Employee(String Name, int Age, String workplace,int salary) {
		super(Name, Age, workplace);
		this.setName(Name);
		this.setAge(Age);
		this.setWorkplace(workplace);
		this.salary=salary;
	}
	public int getPayment() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", retirementage=" + retirementage + ", getWorkplace()="
				+ getWorkplace() + ", getAge()=" + getAge() + ", getName()=" + getName() + "]";
	}
	
}

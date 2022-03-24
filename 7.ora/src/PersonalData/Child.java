package PersonalData;

public class Child extends Person {
	private String school;
	
	public Child(String Name,int Age,String school)
	{
		this.setName(Name);
		this.setAge(Age);
		this.school=school;
	}
	
	public String getSchool() {
		return school;
	}

	@Override
	public String toString() {
		return "Child [ age="+this.getAge()+" name="+this.getName()+" school=" + school + "]";
	}

	public void setSchool(String school) {
		this.school = school;
	}
}

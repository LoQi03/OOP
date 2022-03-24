package PersonalData;

public class Parent extends Person {
	private String workplace;
	
	public Parent(String Name,int Age,String workplace)
	{
		this.setName(Name);
		this.setAge(Age);
		this.workplace=workplace;
	}
	public String getWorkplace() {
		return workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}
	@Override
	public String toString() {
		return "Parent [ age="+this.getAge()+" name="+this.getName()+" workplace=" + workplace + "]";
	}
}

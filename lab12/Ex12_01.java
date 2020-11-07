package lab12;
class Employee{
	String name;
	int salary;
	public Employee(String name, int salary) {
		this.name=name;
		this.salary=salary;
	}
	public String getName()
	{
		return this.name;
	}
	public int getSalary() {return this.salary;}
	public boolean equals(Object otherObject) {
		if(this==otherObject) return true;
		if(otherObject==null) return false;
		if(getClass()!=otherObject.getClass()) return false;
		Employee tmp=(Employee)otherObject;
		//return this.getName()==tmp.getName();
		return this.getName().equals(tmp.getName())&&this.getSalary()==tmp.getSalary();
	}
	@Override
	public int hashCode() {
		return this.name.hashCode()+this.salary;
	}
	
}
public class Ex12_01 {

	public static void main(String[] args) {
		Employee e1= new Employee("John", 10000);
		Employee e2= new Employee(new String("John"), 10000);
		Employee e3= new Employee(new String("John"), 10000);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode() == e2.hashCode());
	}

}

package lab11;

class Employee1 {
	private String name;
	protected int salary;

	public Employee1(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}

	public int getSalary() {
		return this.salary;
	}

	@Override
	public String toString() {
		
		return this.name+", "+"Employee, salary: "+this.salary;
	}
	
	
}

class Manager1 extends Employee1 {
	private int bonus;

	public Manager1(String name, int salary) {
		super(name, salary);
		bonus = 10000;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getSalary() {
		return salary + bonus;
	}
	@Override
	public String toString() {
		
		return this.getName()+", "+"Manager, salary: "+super.getSalary()+" , bonus: "+this.bonus;
	}
}

public class Ex11_03 {
	public static void main(String[] args) {
		Employee1 e1 = new Employee1("John", 50000);
		Manager1 e2 = new Manager1("Peter", 100000);
		System.out.println(e1);
		System.out.println(e2);
	}
}

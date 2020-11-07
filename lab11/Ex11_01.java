package lab11;

class Employee {
	private String name;
	private int salary;

	public Employee(String name, int salary ) {
		this.name = name;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getSalary() {
		return this.salary;
	}
	public void setBonus(int a) {
	
	}
}

class Manager extends Employee {
	private int bonus;
	public Manager() {
		super("NoName(Manager)", 5000);
		//Superclass �� constructor�� argument�� �ִٸ� �ݵ�� subclass�� constructor�� ù��° �ٿ��� super�� ���� ȣ���ؾ� �Ѵ�. 
		super.setName("NoName(Manager)");
		bonus=10000;
		
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getSalary() {
		return super.getSalary() + this.bonus;
	}
}

public class Ex11_01 {
	public static void main(String[] args) {
		Manager m = new Manager();
		System.out.println(m.getName());
		System.out.println(m.getSalary());
		Employee e=  new Manager();
		System.out.println(e.getSalary());//employee�� �ƴ϶� manager�� getSalary�� ȣ��ȴ�. �̸� Dynamic method lookup�̶�� �Ѵ�. 
		e.setBonus(1000);//������ �߻��Ѵ�. �̸� �ذ��� ����� employee�� setBonus�� �߰��ϰų� casting�ؾ� �Ѵ�. 
		//1. Casting
		if(e instanceof Manager)
		{
			((Manager) e).setBonus(1000);
			//Manager tmp=(Manager) e;
			//tmp.setBonus(1000); �� ����� �ϳ��� ����Ѵ�. �������� ���� ��� ���
		}
		//2. Employee�� setBonus�� �����Ѵ�. �����Ե� Employee�� setBonus���� �ƹ��͵� ����x
			
	}
}

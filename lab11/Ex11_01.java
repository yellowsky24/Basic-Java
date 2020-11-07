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
		//Superclass 의 constructor에 argument가 있다면 반드시 subclass의 constructor의 첫번째 줄에서 super을 통해 호출해야 한다. 
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
		System.out.println(e.getSalary());//employee가 아니라 manager의 getSalary가 호출된다. 이를 Dynamic method lookup이라고 한다. 
		e.setBonus(1000);//에러가 발생한다. 이를 해결할 방법은 employee에 setBonus를 추가하거나 casting해야 한다. 
		//1. Casting
		if(e instanceof Manager)
		{
			((Manager) e).setBonus(1000);
			//Manager tmp=(Manager) e;
			//tmp.setBonus(1000); 두 방법중 하나를 사용한다. 교수님은 위에 방법 사용
		}
		//2. Employee에 setBonus를 선언한다. 교수님도 Employee의 setBonus에서 아무것도 수행x
			
	}
}

package lab11;

abstract class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public final String getName() {
		return name;
	}

	public abstract int getId();
}
class Student extends Person{
	int id;
	public Student(String name, int Id)
	{
		super(name);
		this.id=Id;
	}
	@Override
	public int getId() {
		return id;
	}
	
}
public class Ex11_02 {
	public static void main(String[] args) {
		Person p = new Student("Fred", 1729);
		System.out.println(p.getName() + " " + p.getId());
	}
}

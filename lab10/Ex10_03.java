package lab10;
class Employee{
	private String name;
	private int salary;
	public Employee() {
		this.name="NoName";
		this.salary=100000;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
class Manager extends Employee{
	private int bonus=50000;
	public void setBonus(int bonus) {this.bonus=bonus;}
	public int getSalary() {return super.getSalary()+bonus;}
	//super.getSalary()대신에 this.salary라고 하면 오류가 발생한다. 
	//따라서 Employee의 salary를 protected로 바꾸면 에러가 발생하지 않는다. 
	//또한 public대신 protected를 사용하여  visibility를 감소시키면 안된다. Super class의 accessiblity보다 작으면 안된다. 
}
public class Ex10_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m= new Manager();
		
	}

}

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
	//super.getSalary()��ſ� this.salary��� �ϸ� ������ �߻��Ѵ�. 
	//���� Employee�� salary�� protected�� �ٲٸ� ������ �߻����� �ʴ´�. 
	//���� public��� protected�� ����Ͽ�  visibility�� ���ҽ�Ű�� �ȵȴ�. Super class�� accessiblity���� ������ �ȵȴ�. 
}
public class Ex10_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m= new Manager();
		
	}

}

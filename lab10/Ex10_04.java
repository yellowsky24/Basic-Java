package lab10;

class Employee1{
	private String name;
	protected Employee1 supervisor;
	public Employee1() {this.name="NoName";}
	public boolean worksFor(Employee1 supervisor) {
		System.out.println("Employee.worksFor");
		return (this.supervisor==supervisor); 
	}
}
class Manager1 extends Employee1{
	public boolean worksFor(Manager1 supervisor) {
		System.out.println("Manager.worksFor");
		return(this.supervisor==supervisor);
	}
}
public class Ex10_04 {

	public static void main(String[] args) {
		boolean rv;
		Manager1 m= new Manager1();
		Employee1 n= new Manager1();
		//�̰� ���� ������ ���ð� ����. method overriding�� ��� �� superclass�� sub class ��� ��� method�� �۵��ϴ���!!!
		//�ϴ� �˾ƾ� �ϴ°� superclass variable�� subclass object�� �Ҵ�ɶ� ��� �Ǵ°�?
		Employee1 e= new Employee1();
		rv=m.worksFor(n);//���⼭�� Employee�� worksFor�� ����ȴ�. �ֳ��ϸ� type�� Employee�̱� �����̴�. 
		rv=m.worksFor(e);
	

	}

}

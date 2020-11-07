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
		//이거 문제 무조건 나올거 같다. method overriding의 경우 막 superclass와 sub class 섞어서 어느 method가 작동하는지!!!
		//일단 알아야 하는게 superclass variable이 subclass object가 할당될때 어떻게 되는가?
		Employee1 e= new Employee1();
		rv=m.worksFor(n);//여기서는 Employee의 worksFor이 수행된다. 왜냐하면 type이 Employee이기 때문이다. 
		rv=m.worksFor(e);
	

	}

}

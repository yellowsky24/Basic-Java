package lab10;
interface Person{
	String getName();
	default int getID() {return 0;}
}
interface Identified{
	default int getID() {return 1;}
}
class Employees implements Person, Identified{
	private String name;
	public Employees(String name) {this.name=name;}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	} 
	//�ذ� ����� �̿� ���� override�� ���� �ʴ´�. 
	public int getID() {return 2;}
}
public class Ex10_01 {

	public static void main(String[] args) {
		Employees e=new Employees("Jack");
		System.out.println(e.getID());
	}

}

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
	//해결 방법은 이와 같이 override를 하지 않는다. 
	public int getID() {return 2;}
}
public class Ex10_01 {

	public static void main(String[] args) {
		Employees e=new Employees("Jack");
		System.out.println(e.getID());
	}

}

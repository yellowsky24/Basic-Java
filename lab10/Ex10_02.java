package lab10;

interface CustomInterface{
	void method1();
	default void method2(){
		method4();
		method5();
		//non static method�� static method�� non static method�� ȣ���� �� �ִ�. 
		System.out.println("default method");
	}
	static void method3() {
		method5();
		//������ static method�� static method�� ȣ���� �����ϴ�. 
		System.out.println("static method");
	}
	private void method4() {
		System.out.println("private method");}
	private static void method5() {
		System.out.println("private static method");
	}
}
public class Ex10_02 implements CustomInterface{
	public void method1() {System.out.println("abstract method");}
	public static void main(String[] args) {
		CustomInterface instance = new Ex10_02();
		instance.method1();
		instance.method2();
		CustomInterface.method3();

	}
	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}

}

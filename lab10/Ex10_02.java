package lab10;

interface CustomInterface{
	void method1();
	default void method2(){
		method4();
		method5();
		//non static method는 static method와 non static method를 호출할 수 있다. 
		System.out.println("default method");
	}
	static void method3() {
		method5();
		//하지만 static method는 static method만 호출이 가능하다. 
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

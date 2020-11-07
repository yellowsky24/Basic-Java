package lab13;

public class Ex13_03 {
	public static void main(String args[]) {
		try {
		method1();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static void method1()throws Exception {
		method2();
	}

	static void method2() throws Exception{
		throw new Exception("HI!");
	}
}
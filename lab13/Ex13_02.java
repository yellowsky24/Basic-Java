package lab13;

public class Ex13_02 {
	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0);
			System.out.println(4);
		} catch ( ArithmeticException e) {
			System.out.println(5);
		} catch (Exception e) {
			System.out.println(6);
		} finally {
			System.out.println(7);
		}
		System.out.println(8);
	}//������� 1->2->3->exception �߻�!->5->7->8 �̰� ���� ���°� ��¥ ������ ���迡 ���ð� ����
}
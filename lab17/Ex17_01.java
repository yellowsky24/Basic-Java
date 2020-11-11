package lab17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex17_01 {
	public static long add1(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++)
			list.add(i + "");//�̴� string�� ����� ���ؼ� ""�� ���δ�. 
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long add2(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
			list.add(500, "X");//+500 X�� �����Ѵ�. 
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long remove1(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = list.size() - 1; i >= 0; i--)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long remove2(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<>(2000000);
		LinkedList<String> ll = new LinkedList<>();
		System.out.println("=== sequential add ===");
		System.out.println("ArraList : " + add1(al));
		System.out.println("LinkedList: " + add1(ll));
		System.out.println();
		
		//add1: 180, 405�� ��µȴ�. �� ArrayList�� ������. 
		System.out.println("=== non-sequential add ===");
		System.out.println("ArraList : " + add2(al));
		System.out.println("LinkedList: " + add2(ll));
		System.out.println();
		
		//add2: 4072, 20 �� ��µȴ�.  
		System.out.println("=== non-sequential delete ===");
		System.out.println("ArraList : " + remove2(al));
		System.out.println("LinkedList: " + remove2(ll));
		System.out.println();
		System.out.println("=== sequential delete ===");
		System.out.println("ArraList : " + remove1(al));
		System.out.println("LinkedList: " + remove1(ll));
	}
}
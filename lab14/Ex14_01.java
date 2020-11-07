package lab14;

import java.util.ArrayList;

class A{
	public String toString() {
		return "Class A Object";
		}
}

class B{
	public String toString() {
		return "Class B Object";
		}
}

class C{
	public String toString() {
		return "Class C Object";
		}
}

class Box<T>{
	T item;
	public Box(T item) {
		this.item=item;
	}
	void setItem(T item) {
		this.item=item;
		
	}
	T getItem()
	{
		return item;
	}
}

public class Ex14_01 {

	public static void main(String[] args) {

		//Box<A>[] boxes=new Box<>[10];// 오류가 발생한다. generic class의 array는 생성이 불가능하다. 
		Box<A> a= new Box<>(new A());
		Box<B> b= new Box<>(new B());
		Box<C> c= new Box<>(new C());
		System.out.println(a.getItem());
		System.out.println(b.getItem());
		System.out.println(c.getItem());
	}

}

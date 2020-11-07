package lab14;

import java.util.ArrayList;

interface Eatable{}
class Fruit implements Eatable{
	public String toString() {
		return "fruit";
	}
}
class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit{
	public String toString() {
		return "Grape";
	}
}
class Toy{
	public String toString() {
		return "Toy";
	}
	
}
class Box1<T>{
	ArrayList<T> list=new ArrayList<T>();
	public void add(T item) {
		list.add(item);
	}
	public String toString() {
		return list.toString();
	}
}
class FruitBox<T extends Fruit &Eatable> extends Box1<T>{	
}
public class Ex14_02 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		// FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // Error: Type mismatch
		// FruitBox<Toy> toyBox = new FruitBox<Toy>(); // Error: Toy cannot be a type of FruitBox.
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		// appleBox.add(new Grape()); // Error: Grape is not a subclass of Apple.
		grapeBox.add(new Grape());
		System.out.println("fruitBox-"+fruitBox);
		System.out.println("appleBox-"+appleBox);
		System.out.println("grapeBox-"+grapeBox);

	}

}

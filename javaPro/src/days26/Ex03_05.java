package days26;

import java.util.ArrayList;

/**
 * @author kenik  
 * @date 2025. 9. 22. 오전 11:22:25 
 * @subject [제네릭 클래스의 객체 생성과 사용]   
 * @content 
 */ 
public class Ex03_05 {

	public static void main(String[] args) {
		/*
		// Box03<Apple> appleBox = new Box03<Apple>();
		Box03<Apple> appleBox = new Box03<>(); // JDK 1.7 부터
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		// appleBox.add(new Grape()); 에러 
		
		// Box03<Apple> appleBox = new Box03<Grape>(); 에러 X
		
		// Fruit   Apple 상속 관계가 있지만 아래와 같이 객체 생성 X
		// Box03<Fruit> fruitBox = new Box03<Apple>(); 에러
		
		Box03<Fruit> fruitBox = new Box03<>();
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		// fruitBox.add(new Toy());   에러
		*/

	} // main

} // class

/*
 * Fruit 
 *   ㄴ Apple
 *   ㄴ Grape
 * 
 * Toy
 */

/*
// 제네릭 클래스 선언
class Box03<T>{
	
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {
		this.list.add(item);
	}
	T get(int index) {
		return this.list.get(index);
	}
	int size() {
		return this.list.size();
	}
	
	public String toString() {
		return this.list.toString();
	}
	
}

class Fruit{
	public String toString() {
		return "Fruit";
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

*/


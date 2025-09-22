package days26;

import java.util.ArrayList;

/**
 * @author kenik  
 * @date 2025. 9. 22. 오전 11:36:10 
 * @subject   [제한된 제네릭 클래스]
 * @content    ㄴ Box<T>  T라는 타입 파라미터에 지정할 수 있는 타입의 종류를 제한.
 */ 
public class Ex03_06 {

	public static void main(String[] args) {
		/*
		// Box04 제네릭 클래스의 T에는 모든 자료형(타입)을 사용할 수 있다. 
		// 모든 타입( T )를 담을 수 있는 상자이다. 
		Box04<Fruit> b1 = new Box04<>();
		Box04<Apple> b2 = new Box04<>();
		Box04<Grape> b3 = new Box04<>();
		Box04<Toy> b4 = new Box04<>();
		Box04<String> b5 = new Box04<>();
		Box04<Integer> b6 = new Box04<>();

		FruitBox<Apple> b7 = new FruitBox<>();
		FruitBox<Grape> b8 = new FruitBox<>();
		// FruitBox<Toy> b9 = new FruitBox<>(); 에러
		
		*/
	}

}

/*
// 타입 T를 제한하는 데 Fruit 클래스를 상속받고 Eatable 인터페이스를 
// 구현한 타입으로 제한한다는 의미 
class SampleBox<T extends Fruit & Eatable>{
	// 
}

class EatBox<T extends Eatable>{
	// Box4<T>의 모든 멤버를 복사 붙이기 했다라고 (가정)
}

class FruitBox<T extends Fruit>{ // 제한된 제네릭 클래스의 의미
// class FruitBox<T>{  // T 모든 타입 담는 상자 -> 과일만 제한
	// Box4<T>의 모든 멤버를 복사 붙이기 했다라고 (가정)
}

class Box04<T>{
	
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

// 먹을 수 있는 클래스일 경우에는 Eatable 인터페이스를 구현.
interface Eatable{	
}

class Fruit implements Eatable{
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
package days26;

import java.util.ArrayList;

/**
 * @author kenik  
 * @date 2025. 9. 22. 오후 12:04:59 
 * @subject    ? 와일드 카드 설명
 * @content   <?> ==  <? extends Object> 제한 없다. 모든 타입이 가능하다. 
 *            <? extends T>  T와 그 자식들만 가능
 *            <? super T>    T와 그 부모들만 가능
 *            
 *            매개변수로 과일상자를 대입하면 쥬스를 만들어서 반환하는 
 *            Juicer 클래스 선언 + makeJuice() 메서드를 선언
 */ 
public class Ex03_07 {

	public static void main(String[] args) {
		// [1]
		// 과일상자		
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		Juice juice = Juicer.makeJuice(fruitBox);
		System.out.println( juice ); // days26.Juice@3b6eb2ec
		
		FruitBox<Apple> appleBox = new FruitBox<>();
		// The method makeJuice(FruitBox<Fruit>) in the type Juicer
		// is not applicable for the arguments (FruitBox<Apple>)
		juice = Juicer.makeJuice(appleBox); //  에러
		System.out.println( juice );

	}

}

// 과일 -> 쥬스
class Juice{
	// 구현~~~ (가정)
}

// 과일상자 -> 쥬스 만들어서 주는 클래스
// 제네릭 클래스 X
class Juicer{
	// [1] FruitBox<Fruit>, FruitBox<Apple>
	//             제네릭 타입 T 다르고 해서 오버로딩 성립 X
	/*
	static Juice makeJuice(FruitBox<Fruit> box) {
		//
		//
		return new Juice();
	}
	static Juice makeJuice(FruitBox<Apple> box) {
		//
		//
		return new Juice();
	}
	*/
	
	// [2]
	/*
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		//
		//
		return new Juice();
	}
	*/
	
	// [3] 위의 [2] 를 제네릭 메서드로 변환해서 선언
	// [제네릭 메서드 ? ]
	//   ㄴ 메서드의 선언부에 제네릭 타입이 선언된 메서드 
	//   ㄴ 리턴 자료형 바로 앞에 
	//   ㄴ 제네릭 클래스의 <T>와는 별개이다. 
	static <T extends Fruit> Juice makeJuice(FruitBox<T> box) {
		//
		//
		return new Juice();
	}
}


class FruitBox<T extends Fruit>{ // 제한된 제네릭 클래스의 의미
// class FruitBox<T>{  // T 모든 타입 담는 상자 -> 과일만 제한
	// Box4<T>의 모든 멤버를 복사 붙이기 했다라고 (가정)
}

class Box05<T>{
	
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


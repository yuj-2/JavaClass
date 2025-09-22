package days26;

/**
 * @author kenik  
 * @date 2025. 9. 22. 오전 11:09:42 
 * @subject   
 * @content 
 */ 
public class Ex03_03 {

	public static void main(String[] args) {
		Box<String> b1 = new Box<>();
		// b1.setItem(3.14);
		b1.setItem("문자열");    // 타입의 안정성 (장점)
		String str  = b1.getItem(); // 다운 캐스팅  할 필요가 없다. (장점)
		
		// Box<int> b2 = new Box<>(); 기본형을 T  타입으로 사용할 수 없다.
		Box<Integer> b2 = new Box<>();
		b2.setItem(new Integer(100));
		b2.setItem(100);  // 오토 박싱/오토 언박싱.
		int i = b2.getItem(); //다운 캐스팅 X, 오토 언박싱.
		
		Box b3 = new Box();
		// b3.setItem(Object item);  // 자동 T -> Object 처리.

	}

}


/* 제네릭 클래스
 *  ㄴ 클래스명 뒤에 <T>을 붙이면 된다.
 *  ㄴ Type, Key, Value, Eelment 등등 
 *  ㄴ T 타입 파라미터(매개변수)
 *  ㄴ Box 원시 타입
 *  ㄴ Box<T> 제네릭 클래스 , T의 Box 라고 읽으면 된다. 
 * */
class Box<T>{
	
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item; 
	} 
	
}
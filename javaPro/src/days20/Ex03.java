package days20;

import java.lang.reflect.InvocationTargetException;

/**
 * @author kenik  
 * @date 2025. 9. 12. 오전 11:04:40 
 * @subject   어떤 객체로 부터 클래스 정보를 얻어오는 3가지 방법.
 * @content                 Class 타입
 */ 
public class Ex03 {

	public static void main(String[] args) {
		Card c1 = new Card();
		System.out.println( c1 );  // SPADE : 1

		// [1]  Object.getClass()
		//		Class classInfo = c1.getClass();
		//		String fullName = classInfo.getName();
		//		System.out.println( fullName );

		// [2] 모든 클래스에 static 필드 : class 추가
		/*
		Class classInfo = Card.class;
		//  객체 생성		Card c = new Card();
		// Card c2 = (Card)classInfo.newInstance();
		Card c2;
		try {
			c2 = (Card) classInfo.getDeclaredConstructor().newInstance();
			System.out.println( c2 );
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		*/ 
		
		// [3] JDBC 수업할때 ... 
		String fullName = "days20.Card";
		 try {
			Class classInfo = Class.forName(fullName);
			// 
		} catch (ClassNotFoundException e) { 
			e.printStackTrace();
		}

	}

}

// final 변수 : 상수
// final 메서드 : 오버라이딩할 수 없는 최종 메서드
// final 클래스 : subclass 자식클래스를 가질 수 없는 최종 클래스 
final class Card{

	String kind; // 카드 종류
	int num;     // 카드 번호

	// 디폴트 생성자
	Card() {
		this("SPADE", 1);
	}
	// 생성자
	Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}

	@Override
	public String toString() {
		return String.format("%s : %d", this.kind, this.num);
	}

}

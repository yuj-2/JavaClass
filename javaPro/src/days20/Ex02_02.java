package days20;

import days15.Point;

/**
 * @author kenik  
 * @date 2025. 9. 12. 오전 10:30:54 
 * @subject   Object 최상위 부모클래스의 메서드들을 연습.
 * @content 
 */ 
public class Ex02_02 {

	public static void main(String[] args) {
		
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		
		// p1 객체를  복제(clone)해서 p3 객체를 생성.
// [1]	Point p3 = new Point();
//		p3.x = p1.x;
//		p3.y = p1.y;
		
// [2]	Point p3 = new Point(p1.x, p1.y);
		
// [3]	Point p3 = new Point(p1);
		
		// Object.clone() 복제 메서드 
		//The method clone() from the type Object [is not visible]
		
		// checked 예외
		try {
			Point p3 = p1.clone();
			System.out.println( p3.toString() );
		} catch (CloneNotSupportedException e) { 
			e.printStackTrace();
		} 
		
	}

}

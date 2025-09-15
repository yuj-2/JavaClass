package days21;

import java.util.Objects;

import days15.Point;

/**
 * @author kenik  
 * @date 2025. 9. 15. 오후 12:12:59 
 * @subject   java.util.Arrays 클래스
 * @content             Random 클래스
 *                      Objects 클래스
 */ 
public class Ex07 {

	public static void main(String[] args) {
		Point p = null;
		
		if ( p != null ) {   // Dead code  경고  ***
			p.x = 100;
		}
		
		if ( !Objects.isNull(p) ) {
			p.x = 100;
		}
		
		Point p2 = null;
		if ( p != null && p.equals(p2) ) {
			//
		}
		if ( Objects.equals(p, p2) ) {
			//
		}
		
		// System.out.println( p.toString() );
		System.out.println( Objects.toString(p, "NULL"));

		// Object 의 보조기능 클래스 => Objects 클래스
	}

}

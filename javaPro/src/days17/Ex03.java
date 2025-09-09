package days17;

/**
 * @author kenik  
 * @date 2025. 9. 9. 오전 10:38:55 
 * @subject   2. is-a 관계 ( 상속 관계 )
 * @content     1) 상속 관계
 *              2) 상속
 *                    부모 -> 자식( 재산 )
 *                    부모 -> 자식( 코드 )   ?
 *              3) 상속 장점
 *                 - 코드 재 사용 +  코딩량이 적다.
 *                 - 생산성 향상, 유지 보수 용이
 *              4) 상속 예    
 *                  x, y 좌표 관리 기능이 구현된 클래스 : Point2D.java        
 *                  x, y, z 좌표 관리 기능이 구현된 클래스 : Point3D.java        
 */ 
public class Ex03 {

	public static void main(String[] args) {		
		/*
		Point2D p1 = new Point2D(10, 20);
		Point2D p2 = new Point2D(1);
		Point2D p3 = new Point2D(p1);
		
		p3.dispPoint2D();
		p3.offsetPoint(p2);
		p3.dispPoint2D();
		*/
		
		// 클래스 배열 초기화
		Point2D [] pArr = {
				new Point2D(10, 20),
				new Point2D(1),
				new Point2D(2,4)
		};
		
		pArr[2].dispPoint2D();
		pArr[2].offsetPoint(pArr[1]);
		pArr[2].dispPoint2D();

	} // main

} // class










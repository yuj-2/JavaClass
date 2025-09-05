package days15;

/**
 * @author kenik  
 * @date 2025. 9. 5. 오후 3:04:56 
 * @subject   
 * @content  1. 매개변수  - 기본형, 참조형
 *           2. 리턴자료형 - 기본형, 참조형
 *           
 *           Point 클래스 선언 
 */ 
public class Ex05 {

	public static void main(String[] args) {
		/*
		힙영역                    스택영역
        [10][0][0x1번지]          [0x2번지]
		  x  y                     p1(객체)
		0x2번지
		 
        [20][0][0x1번지]          [0x3번지]
		  x  y                     p2(객체)
		0x3번지 
		  
		메서드영역		 
		     []
		     dispPoint()
		     0x1번지
		*/
		Point p1 ; // 지역변수, 참조변수, 객체
		p1 = new Point(); // 인스턴스화, 객체 생성		
		// 객체명.필드명
		p1.x = 10;
		p1.y = 1;
		
		// 객체명.메서드명();
		
		Point p2 = new Point();
		p2.x = 20;
		p2.y = 2;
		
		// p1.offsetPoint(50).dispPoint();  X
		
		p1.offsetPoint(p2).dispPoint();
		
		// (중요)
		//p1.dispPoint();
		//p2.dispPoint();
		
		/*
		p1.dispPoint();  // > x=10, y=0		
		p1.offsetPoint(5);
		p1.dispPoint();  // > x=15, y=5
         */
		
		/*
		p1.dispPoint();
		p1.plusPoint(p2);
		p1.dispPoint();
		
		int p1X = p1.getX();
		System.out.printf("p1.x=%d\n", p1X);
		*/
	} // main

} // class







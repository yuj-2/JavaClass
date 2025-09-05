package days15;

// 좌표(x,y)를 다루는 속성, 기능이 구현된 클래스
public class Point {

	// 필드
	public int x = 0;
	public int y;

	// 생성자
	public Point() {
	  System.out.println("> Default Constructor 호출됨...");
	}
	
	// 생성자  Ctrl + Alt + 방향키
	public Point(int n) {
		System.out.println("> Constructor 1 호출됨...");
		y = x = n;
	}
	
	public Point(int i, int j) {
		System.out.println("> Constructor 2 호출됨...");
		x = i;
		y = j;
	}

	// 메소드
	// p1.dispPoint();
	// p2.dispPoint();
	public void dispPoint() {
		System.out.printf("> x=%d, y=%d\n", x, y); // p2.x, p2.y
	}

	// 메서드 선언 
	// p1.offsetPoint(5);
	public void offsetPoint(int n) {  // 기본형 매개변수
		x += n;
		y += n;
	}

	// 리턴자료형이 참조형인 메서드 선언
	// p1.offsetPoint(p2).dispPoint()
	public Point offsetPoint(Point p) {
		Point result = new Point();
		result.x = x + p.x;  // 10 + 20 = 30
		result.y = y + p.y;  // 1 +  2  = 3
		return result;
	}

	// 메서드 선언 
	// p1.plusPoint(p2)
	public void plusPoint(Point p) {
		x += p.x;
		y += p.y;
	}

	// x좌표를 반환하는 메서드 선언  p1.getX()
	public int getX() {
		return x;
	}



}

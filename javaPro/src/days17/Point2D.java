package days17;

public class Point2D {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point2D() {
		System.out.println("> Point2D 디폴트 생성자 호출됨...");
	}
	public Point2D(int n) {
		this.x = n;
		this.y = n;
		System.out.println("> Point2D 1 생성자 호출됨...");
	}
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("> Point2D 2 생성자 호출됨...");
	}
	public Point2D(Point2D p) {
		this.x = p.x;
		this.y = p.y;
		System.out.println("> Point2D 1 생성자 호출됨...");
	}

	// Getter, Setter	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	// 메서드 
	public void dispPoint2D() {
		System.out.printf("x=%d, y=%d\n", this.x, this.y);
	}

	public String getXY() {
		return String.format("(%d, %d)", this.x, this.y);
	}

	public Point2D offsetPoint(int i) {  // 기본형 매개변수
		x += i;
		y += i;
		return this;  // this의 3번째 용도  참조형 반환자료형
	}

	public void offsetPoint(Point2D p) {  // 참조형 매개변수
		x += p.x;
		y += p.y;
	}

	public Point2D plus(Point2D p) {
		int xValue =  x + p.x;
		int yValue =  y + p.y;

		Point2D newp = new Point2D();
		newp.x = xValue;
		newp.y = yValue;

		return newp;
	} 

}

package days17;
 

/**
 * @author kenik  
 * @date 2025. 9. 9. 오전 11:49:28 
 * @subject   도형 클래스         Shape
 * @content     ㄴ 원 클래스      Circle
 *              ㄴ 삼각형 클래스   Triangle
 */ 
public class Ex04 {

	public static void main(String[] args) {
		
		// Shape s = new Shape();
		
		Shape c = new Circle();
		Shape t = new Triangle();
		
		c.도형면적메서드();
		t.도형면적메서드();
		
		

	} // main

} // class

// 모든 클래스의 최상위 클래스 : [Object 클래스]이다. 
class Shape{   //  extends Object
	
	String color = "black";  // 명시적 초기화
	
	public void draw() {
		System.out.printf("[color=%s]\n", this.color);
	}
	
	public void 도형면적메서드() {
		
	}
	
}

/*
class Circle{
	// 필드
	int x;
	int y;  // 원점 좌표
	int r;  // 반지름 radius
	
	// 생성자
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public Circle() {
		this(0,0,0);
	}
	// 메소드
}
*/

// 상속관계(is-a 관계)
//        ???은 ???이다.
//        원은 도형이다. 
class Circle extends Shape{
	
	// 필드
	Point2D center; // 원점    has-a 관계
	int r; // 반지름
	
	public Circle() {
		this( new Point2D(0,0), 0 );
	}
	public Circle( Point2D center, int r ) {
		this.center = center;
		this.r = r;
	}
	
	@Override
    public void 도형면적메서드() {
		System.out.println("> 원 면적 계산 : 반지름*반지름*3.14.");
	}
	
	// 부모로 부터 상속된  draw() 메서드  : [color=%s]
	//  원점, 반지름 출력(draw)
	// 1) 부모로 부터 물려받은 draw() 메서드를 다시 안의 코딩 수정 -  오버라이딩
	// 2) 새로 출력하는 draw() 메서드를 다시 선언               -  오버로딩
}

class Triangle extends Shape{
	
	// 꼭지점 3개
	Point2D [] pArr = new Point2D[3];
	
	public Triangle() { 
		// pArr[0]  NullPOintException 발생
	}
	
	@Override
    public void 도형면적메서드() {
		System.out.println("> 삼각형 면적 계산 : 가로*세로*1/2");
	}
	
}








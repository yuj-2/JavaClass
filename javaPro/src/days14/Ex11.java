package days14;

/**
 * @author kenik  
 * @date 2025. 9. 4. 오후 3:38:58 
 * @subject   Call By Reference
 * @content 
 */ 
public class Ex11 {

	public static void main(String[] args) {
		Point p = new Point();
		p.x= 10;
		p.y= 20;
		p.dispPoint();
		
		swap(p); // Call By Reference
		
		p.dispPoint();
		 
	} // main	 

	private static void swap(Point p) {  // Point p = p  클래스 복사
		int temp = p.x;
		p.x = p.y;
		p.y = temp;
	}

} // class

class Point{
	int x;
	int y;
	public void dispPoint() {
		System.out.printf("> x=%d, y=%d\n", x, y);
	}
}




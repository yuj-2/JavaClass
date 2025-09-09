package days17;

public class Point3D extends Point2D{

	// 필드
	private int z;
 
	// 생성자
	public Point3D() {
		System.out.println("> Point3D 디폴트 생성자 호출됨...");
	}
	public Point3D(int n) {
		//The field Point2D.x [is not visible]
		super(n);
		this.z = n;
		System.out.println("> Point3D 1 생성자 호출됨...");
	}
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.println("> Point3D 3 생성자 호출됨...");
	}
	public Point3D(Point3D p) {
		// 업캐스팅, 다운캐스팅 - 클래스 간의 형변환
		// super(p); // Point2D(Point2D p <-	Point3D p )
		
		this.setX(p.getX());
		this.setY(p.getY());
		
		this.z = p.z;
		System.out.println("> Point3D 1 생성자 호출됨...");
	}

	// Getter, Setter		
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}

	// 메서드 
	public void dispPoint3D() {
		System.out.printf("x=%d, y=%d, z=%d\n"
				, this.getX(), this.getY(), this.z);
	}

	public String getXYZ() {
		return String.format("(%d, %d, %d)"
				, this.getX(), this.getY(), this.z);
	}

}

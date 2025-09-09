package days17;

// 상속을 사용하지 않은 클래스
public class Point3D_Original {

	// 필드
	private int x;
	private int y;
	private int z;

	// 생성자
	public Point3D_Original() {
		System.out.println("> Point3D 디폴트 생성자 호출됨...");
	}
	public Point3D_Original(int n) {
		this.x = n;
		this.y = n;
		this.z = n;
		System.out.println("> Point3D 1 생성자 호출됨...");
	}
	public Point3D_Original(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("> Point3D 3 생성자 호출됨...");
	}
	public Point3D_Original(Point3D_Original p) {
		this.x = p.x;
		this.y = p.y;
		this.z = p.z;
		System.out.println("> Point3D 1 생성자 호출됨...");
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
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}

	// 메서드 
	public void dispPoint3D() {
		System.out.printf("x=%d, y=%d, z=%d\n", this.x, this.y, this.z);
	}

	public String getXYZ() {
		return String.format("(%d, %d, %d)", this.x, this.y, this.z);
	}

}

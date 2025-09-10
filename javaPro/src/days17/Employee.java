package days17;

// [사원클래스]
// 사원이라면 "공통적으로 가지고 있는 멤버들을 선언"한 클래스.
// 인스턴스를 생성할 수 없는 불완전한 클래스
// 질문) 공통적인 멤버들만으로 이루어진 미리 선언된 클래스가 필요하다면 
//      그 클래스는 추상클래스로 선언한다. 
public abstract class Employee extends Object{

	// 필드
	private String name;  		// 사원명
	private String addr; 		// 주소
	private String tel; 		// 연락처
	private String hiredate; 	// 입사일자

	// Getter, Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	// 생성자
	public Employee() {
		super();
		System.out.println("> Employee 디폴트 생성자 호출됨.");
	}

	public Employee(String name, String addr, String tel, String hiredate) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.println("> Employee 4 생성자 호출됨.");
	}

	// 메소드
	public void dispEmpInfo() {
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s\n"
				, this.name, this.addr, this.tel, this.hiredate);
	}
	
	// 가상메서드 -> 자식클래스 반드시 오버라이딩 사용
//	public int getPay() {
//		return 0;
//	}
	
	// 몸체가 구현이 안된 불완전한 메서드 -> 추상메서드
	public abstract int getPay() ;

}







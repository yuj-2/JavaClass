package days17;

// 영업직 사원클래스 
public  final class SalesMan extends Regular{

	// 필드 : name, addr, tel, hiredate, basepay
	// 메서드 : getter, setter,  dispEmpInfo(), getPay()
	// 생성자 상속 X

	private int sales; // 판매량
	private int comm;  // 커미션

	// 생성자
	public SalesMan() {
		super();
		System.out.println("> SalesMan 디폴트 생성자 호출됨.");
	}
	public SalesMan(String name, String addr, String tel, String hiredate, int basePay, int sales, int comm) {		
		super(name, addr, tel, hiredate, basePay);		
		this.sales = sales;
		this.comm = comm;
		System.out.println("> SalesMan 7 생성자 호출됨.");
	}

	@Override
	public int getPay() {  
		return super.getPay() + this.sales * this.comm;
	}
	
	@Override
	public void dispEmpInfo() {
		System.out.printf(
				"사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 기본급:%d"
						+ " 판매량=%d, 커미션=%d\n"
						,this.getName(), this.getAddr(), this.getTel()
						, this.getHiredate(), this.getBasePay()
						, this.sales, this.comm );
		 
	}

}

/*
// 10년 뒤에 새로운 사원 형태 생겼다.
class NewTypeEmp extends SalesMan{
  private int newField;
  public void newMethod() {	  
  }
}
*/


















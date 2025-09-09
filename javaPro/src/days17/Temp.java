package days17;

// 임시직 사원클래스
public class Temp extends Employee{

	// 필드 - name, addr, tel, hiredate
	// 메서드 - dispEmpInfo() , getter, setter
	// 생성자 상속 X

	private int days;   	// 근무일수
	private int payOfDay; 	// 하루일당

	public Temp() {
		super(); 
		System.out.println("> Temp 디폴트 생성자 호출됨.");
	}
	public Temp(String name, String addr, String tel, String hiredate, int days, int payOfDay) {
		super(name, addr, tel, hiredate); 
		this.days = days;
		this.payOfDay = payOfDay;
		System.out.println("> Temp 6 생성자 호출됨.");
	}

	// 급여 계산해서 반환하는 메서드 
	public int getPay() {
		return this.days * this.payOfDay;		
	}


	@Override
	public void dispEmpInfo() {
		super.dispEmpInfo();
		System.out.printf("근무일수:%d, 하루일당:%d\n", this.days, this.payOfDay);
	}


}

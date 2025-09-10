package days17;

/**
 * @author kenik  
 * @date 2025. 9. 9. 오후 3:18:48 
 * @subject   
 * @content 
 */ 
public class Ex07 {

	public static void main(String[] args) {
		// 1. Employee
		//Employee emp1 = new Employee("이나영", "서울시 강남구", "010-1234-1234", "2020.01.01");
		// 2. Regular
		Employee emp2 =  new Regular("김수진", "서울시 당산동", "010-1272-2322", "2018.12.12", 3000000);	
		// 3. Temp
		Employee emp3  = new Temp("장소예", "서울 강북", "010-4334-3894", "2022.02.12", 15, 200000);
		// 4. SalesMan
		Employee emp4  =  new SalesMan("최현아", "경기도 수원", "010-8732-9877", "2015.03.15", 500000, 20, 100000);
		
		//dispTest(emp1);
		dispTest(emp2);
		dispTest(emp3);
		dispTest(emp4);
		
		//NewTypeEmp emp5 = new NewTypeEmp();
		//dispTest(emp5);
	} // main

	// 오버로딩(overloading)
	private static void dispTest(Employee emp) {  // 매개변수 다형성
		emp.dispEmpInfo();
	}
	
	/*
	private static void dispTest(Employee emp) {
		emp.dispEmpInfo();
	}
	private static void dispTest(Regular emp) {
		emp.dispEmpInfo();
	}
	private static void dispTest(Temp emp) {
		emp.dispEmpInfo();
	}
	private static void dispTest(SalesMan emp) {
		emp.dispEmpInfo();
	}
	private static void dispTest(NewTypeEmp emp) {
		emp.dispEmpInfo();
	}
	*/
	

} // class











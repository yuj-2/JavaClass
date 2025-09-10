package days18;

import days17.Employee;
import days17.Regular;
import days17.SalesMan;
import days17.Temp;

/**
 * @author kenik  
 * @date 2025. 9. 10. 오전 10:01:59 
 * @subject   
 * @content 
 */ 
public class Ex02 {

	public static void main(String[] args) {
		// [ 추상화 ]
		//Employee emp1 = new Employee("이나영", "서울시 강남구", "010-1234-1234", "2020.01.01");
		Employee emp2 =  new Regular("김수진", "서울시 당산동", "010-1272-2322", "2018.12.12", 3000000);	
		Employee emp3  = new Temp("장소예", "서울 강북", "010-4334-3894", "2022.02.12", 15, 200000);
		Employee emp4  =  new SalesMan("최현아", "경기도 수원", "010-8732-9877", "2015.03.15", 500000, 20, 100000);
		
		System.out.println( emp2.getPay());		
		System.out.println( emp4.getPay());
		
//		emp4.dispEmpInfo();

	} // main

} // class







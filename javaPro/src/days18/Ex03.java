package days18;

import days17.Employee;
import days17.Regular;
import days17.SalesMan;
import days17.Temp;

/**
 * @author kenik  
 * @date 2025. 9. 10. 오전 10:38:49 
 * @subject   instanceof 연산자
 * @content 
 */ 
public class Ex03 {

	public static void main(String[] args) {
		
		// 클래스 배열 초기화 + 업캐스팅 
		Employee [] emps = {
				 new Regular("김수진", "서울시 당산동", "010-1272-2322", "2018.12.12", 3000000)
				, new Temp("장소예", "서울 강북", "010-4334-3894", "2022.02.12", 15, 200000)
				, new SalesMan("최현아", "경기도 수원", "010-8732-9877", "2015.03.15", 500000, 20, 100000)
		};
		
//		for (int i = 0; i < emps.length; i++) {
//			어떤사원인지판단하는메서드(emps[i]);
//		}

		어떤사원인지판단하는메서드(emps[2]);
		
	}

	// instanceof 연산자
	private static void 어떤사원인지판단하는메서드(Employee emp) { 
		// 주의할 점) 상속관계가 있는 클래스들은 자식클래스를 먼저 체크한다. 
		if (emp instanceof SalesMan) {
			System.out.println("영업직사원");
		} else if (  emp instanceof Regular  ) {
			System.out.println("정규직사원");
		}else if (emp instanceof Temp) {
			System.out.println("임시직사원");
		}  
		
	}

}

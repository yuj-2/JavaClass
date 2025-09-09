package days17;

/**
 * @author kenik  
 * @date 2025. 9. 9. 오후 14:00:00 
 * @subject   
 * @content 
 */ 
public class Ex06 {

	public static void main(String[] args) {
		/*
                       [ 상속 계층도 ]
                          Object
                            ↑  
                          Employee  사원클래스 
                     ↑                  ↑
                 Regular 정규직         Temp 임시직 
                     ↑
                 SalesMan 영업직
                 
                 1. 상속성 정리
                 2. 다형성 / 인터페이스
                 3. 업캐스팅 / 다운캐스팅
                 4. 추상화
                 5. this, super 키워드 설명
                 6. final 키워드 설명
                 등등
		 * */
		
		// 1. 사원 객체 생성 후 사원정보 출력 메소드 호출
		/*
		Employee emp1 = new Employee("이나영", "서울시 강남구", "010-1234-1234", "2020.01.01");
		emp1.dispEmpInfo();
		*/
		
		// 2. 정규직 사원 객체 생성 + 호출
		/*
		Regular emp2 =  new Regular("김수진", "서울시 당산동", "010-1272-2322", "2018.12.12", 3000000);		
		// Employee.dispEmpInfo()
		emp2.dispEmpInfo();
		System.out.println( emp2.getPay() );
		*/
		
		/*
		// 3. 테스트
//		int i = 100; 
//		long l = i;  자동 형 변환 경우   int -> long
		
		// (1) 왜?  Employee emp = new Regular();
		//     가능:   클래스의 타입이 다르다. 
		//         부모타입  <--참조--   자식객체를 생성
		//         클래스 간의 형변환 - 자동 업캐스팅
		Employee emp3 =  new Regular("김수진", "서울시 당산동", "010-1272-2322", "2018.12.12", 3000000);		
		emp3.dispEmpInfo();
		// emp3.getPay();  X 문제점 파악
		*/ 
		
		/*
		// 4. 
		Employee emp4  = new Temp("장소예", "서울 강북", "010-4334-3894", "2022.02.12", 15, 200000);
		emp4.dispEmpInfo();
		*/
		
		/*
		// 5. 
		Employee emp5  =  new SalesMan("최현아", "경기도 수원", "010-8732-9877", "2015.03.15", 500000, 20, 100000);
		emp5.dispEmpInfo();
		*/

	} // main

} // class







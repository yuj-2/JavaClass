package days14;

/**
 * @author kenik  
 * @date 2025. 9. 4. 오후 12:38:33 
 * @subject   
 * @content 
 */ 
public class Ex07 {
	
	private class Sample{
		
	}
	
	// 중첩 클래스
	protected class Test{
		
	}

	public static void main(String[] args) {	
		
		/*
         public class Ex07{}
         1. 클래스 선언 시 앞에 붙는 접근 지정자 설명 ( 시험 )
           1) public - 패키지 내부/외부 어디서든지 사용(참조, 상속) 가능 
           3) X == default == package  - 패키지 내부에서만 사용(참조, 상속) 가능
           
           2) proteced   비활성화
               ㄴ defalut(package) 접지 기능 + 패키지 외부에서도 상속 가능
           4) private    비활성화
               ㄴ 같은 파일 내에서만 사용(참조, 상속) 가능하다. 
               
              왜? 중첩 클래스를 선언할 때만 2)4) 접근지정자를 사용할 수 있다. 
                 (내부 클래스)
                 inner
                 4가지 종류가 있다. 
        
         2. Person 클래스 선언
		 * */
		
		// days14.Ex07 클래스      - 같은 패키지 내부이다.
		// days14.Person 클래스
		
		Person p1 = new Person();
		
		System.out.println( " end ");

	} // main

} // class

 class Ex08{
	 
	 // 중첩 클래스
	 abstract class InnerEx08{
		 
	 }
	 final class InnerEx08_02{
		 
	 }
	 static class InnerEx08_03{
		 
	 }
	 
	 // [ 클래스 앞에 붙는 기타 제어자 설명... (암기) ]
	 // 1) abstract - 추상클래스
	 // 2) final - 최종클래스
	 // 3) static 비활성화 - 중첩 클래스 선언 시만 사용 가능. - 정적(스태틱)클래스
	 
}









package days16;

/**
 * @author kenik  
 * @date 2025. 9. 8. 오후 2:29:33 
 * @subject   [ static 키워드 설명 ]  p 247
 * @content   (가정)
 *            기업은행 1층 에 우리 모두가 보통예금(적금) 가입.
 *            저축과 관련된 Save 클래스 선언
 *            ( 이자율은 모두 동일하다 )
 */ 
public class Ex05 {

	public static void main(String[] args) {
		// 클래스명.static필드명 접근 가능
		// The field Save.rate [is not visible]
		// Save.rate = 0.08;
		// 클래스명.static메서드()
	
		
		// 객체명.static필드명
		
		
		// 클래스로더에 의해서 static 필드는 메모리(메서드 영역)에 올라간다.
		
		//Save s = null;
		//s.setName("홍길동");
		
		
		
		/*
		 스택영역        메서드영역         힙영역           8바이트
		 []                             [이나영][10000]
		 s1            [0.04] 1개
		 []                             [김수진][10000]
		 s2
		 []                             [장소예][10000]
		 s3
		 []                             [이지혜][10000]
		 s4
		 []                             [지영주][10000]
		 s5
		 :
		 :
		 * */
		// [2] 클래스 배열을 사용해서 코딩 수정.  + (배열 초기화)
	 
		Save [] s = {
				    new Save("이나영", 10000, 0.04),
				    new Save("김수진", 2300, 0.04),
				    new Save("장소예", 5000, 0.04),
				    new Save("이지혜", 34000, 0.04),
				    new Save("지영주", 1000, 0.04)
		};		
		
		// 클래스명.
		// Save.setRate(0.08);
		// 객체명.
		s[4].setRate(0.09);
		
		for (int i = 0; i < s.length; i++) {
			s[i].printSave();
		}
	 
		/* [1]
		Save s1 = new Save("이나영", 10000, 0.04);
		Save s2 = new Save("김수진", 2300, 0.04);
		Save s3 = new Save("장소예", 5000, 0.04);
		Save s4 = new Save("이지혜", 34000, 0.04);
		Save s5 = new Save("지영주", 1000, 0.04);
		
		s1.printSave();
		s2.printSave();
		s3.printSave();
		s4.printSave();
		s5.printSave();
		*/

	} // main

} // class








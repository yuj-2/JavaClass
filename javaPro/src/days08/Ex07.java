package days08;

import com.util.Graphic2D;

/**
 * @author kenik  
 * @date 2025. 8. 27. 오후 3:19:16 
 * @subject   메소드(method) == 함수
 * @content   함수 ? 
 *              ㄴ 프로그래밍에서 반복되는 명령어들을 찾아서
 *                별도로 묶어서 필요할 때 마다 불러서 사용할 수 있도록 한 것.
 *              ㄴ 프로그램의 구조화 -> 유지, 보수 용이
 *              ㄴ 선언 형식
 *              [접] [기] 리턴자료형 메소드명([매개변수...]){  몸체(Body)
 *                  // 실행명령
 *                  // 실행명령
 *                  // 실행명령
 *                  // 실행명령
 *                  [return 리턴값;]
 *              }  
 *              ㄴ 메소드 3가지 파악(이해)
 *                1) 기능(일)
 *                2) 매개변수
 *                3) 리턴값( 리턴자료형 )
 */ 
public class Ex07 {

	public static void main(String[] args) {
		//System.out.println("=--------------"); // 50줄 가정 
		Graphic2D.drawLine(50, '^');// 메소드 호출 부분
		System.out.println(" 부서명  : 사원명 ");
		//System.out.println("---------------"); // 50줄 가정
		Graphic2D.drawLine(30, '$'); // 메소드 호출 부분
		System.out.println(" 영업부  : 이나영 ");
		System.out.println(" 총무부  : 김수진 ");
		System.out.println(" 자재부  : 장소예 ");
		System.out.println(" 기획부  : 최현아 ");
		//System.out.println("---------------"); // 50줄 가정
		Graphic2D.drawLine(); // 메소드 호출 부분
		
	} // main

	/*
	// 메소드(함수) 선언 부분
	// 1) 선 긋는 기능
	// 2) 매개변수	X
	// 3) 리턴값  	X  void
	// Duplicate method drawLine() in type Ex07
	// 메소드명 동일 + 매개변수 갯수, 타입 X
	// 중복 함수
	// 오버로딩(Overloading)
	public static void drawLine(){		
		System.out.println("=-------------="); // 50줄 가정
	}
	
	public static void drawLine(int n){		
		for (int i = 1; i <= n; i++) {
			System.out.print("-");
		}
		System.out.println(); // 50줄 가정
	} 
	
	public static void drawLine(int n, char style){		
		for (int i = 1; i <= n; i++) {
			System.out.print( style );
		}
		System.out.println(); // 50줄 가정
	}
	*/
	
} // class








package days09;

/**
 * @author kenik  
 * @date 2025. 8. 28. 오후 3:27:12 
 * @subject   재귀 함수(Recursive Function)
 * @content    ㄴ 자기 자신을 호출하는 함수(메서드)
 */ 
public class Ex05 {

	public static void main(String[] args) {
		disp(); // 메서드 호출 부분
	} // main

	// 재귀 메서드 선언 부분
	// 기저조건 X
	private static void disp() {
		System.out.println("> disp() 메서드 호출됨...");
		
		
		disp();// 메서드 호출 부분
	}

} // class








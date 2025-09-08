package days16;

/**
 * @author kenik  
 * @date 2025. 9. 8. 오후 3:46:56 
 * @subject   [ 가변 인자 ] p236
 * @content 
 */ 
public class Ex08 {

	public static void main(String[] args) {
		
		// 두 정수의 합을 구해서 반환하는 sum 함수 선언 + 호출
		int result = sum(1,2);
		System.out.println(result);
		
		result = sum(1,2,3);
		System.out.println(result);
		
		result = sum(1,2,3,4);
		System.out.println(result);

		int [] m = {1,2,3,43,5,5,5,5,5,5,5,5,3,2,4,2,43,32};
		result= sum(m);
		System.out.println(result);
	} // main

	// 오버로딩(중복함수)
	// 가변 인자 : jdk1.5 메서드의 매개변수의 갯수가 고정X -> 동적 지정할 수 있다. 
	private static int sum(int...m) {
		int result = 0;
		for (int i = 0; i < m.length; i++) {
			result += m[i];
		}
		return result;
	}
	
	/*
	private static int sum(int [] m) {
		int result = 0;
		for (int i = 0; i < m.length; i++) {
			result += m[i];
		}
		return result;
	}
	
	private static int sum(int a, int b, int c, int d) { 
		return a+b+c+d;
	}
	private static int sum(int a, int b, int c) { 
		return a+b+c;
	}
	private static int sum(int a, int b) { 
		return a + b;
	}
   */
} // class









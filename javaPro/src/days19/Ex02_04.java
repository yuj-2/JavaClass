package days19;

/**
 * @author kenik  
 * @date 2025. 9. 11. 오전 10:36:55 
 * @subject   내부 클래스에서 외부 클래스의 멤버들을 접근하는 방법
 * @content 
 */ 
public class Ex02_04 {
	
	// 외부클래스 필드 선언
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		// 인스턴스 내부 클래스 안에서 외부 클래스의 멤버 사용
		// ( 마치 내부 클래스 자신의 멤버처럼 사용 가능 )
		// outerIv = 100; X
		int a = outerIv;
		int b = outerCv;
		
	}
	
	static class StaticInner{
		// int a = outerIv; X
		int b = outerCv;
	}
	
	void method1() {
		
		int x = 0;
		int y = 0;
		
		class LocalInner{
			
			// 외부 클래스 필드 사용 가능
			int cc = outerIv; 
			int dd = outerCv;
			
			
			// 메서드 안의 지역변수 사용 가능
			int aa = x;
			int bb = y;
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

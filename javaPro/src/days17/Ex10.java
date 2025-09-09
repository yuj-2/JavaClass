package days17;

/**
 * @author kenik  
 * @date 2025. 9. 9. 오후 4:34:56 
 * @subject   [final 키워드 설명]
 * @content    1. 
 */ 
public class Ex10 {
	// 2. 필드 : 인스턴스 변수,  클래스 변수
	public static final  double PI ; // = 3.141592;  // 상수    명시적 초기화
	
	static{
		PI = 3.141592;
	}
	
	{
		// PI = 3.141592;  인스턴스 초기화 블럭
	}

	Ex10(){
		// PI = 3.141592;
	}
	public static void main(String[] args) {
		//  1. 상수 선언 ( 지역변수 )
		final int STUDENT_COUNT = 30;
		
		Ex10 obj = new Ex10();
		System.out.println( obj.PI );
		
		obj.finalTest(100);

	} // main
	
	//                    3. final 매개변수 앞에
	public void finalTest(final int x) {
		
		// x = 200;
		
	}

} // class


// 클래스 앞에 final 
// Top 클래스는 자식 클래스를 가질 수 없는 마지막(최종) 클래스 이다. 
// final class Top{
class Top{
	
	void test1() {
		System.out.println("> test1...");
	}
	
	// 자식 클래스에서 오버라이딩 할 수 없는 메서드 이다. 
    final void test2() {
		System.out.println("> test2...");
	}
	
}

// The type Bottom cannot subclass the final class Top
class Bottom extends Top{
	
	@Override
	void test1() {
		System.out.println("> top.test1... 재정의 했다.");
	}
	
	/*
	// Cannot override the final method from Top
	@Override
	void test2() {
		System.out.println("> top.test2... 재정의 했다.");
	}
	*/
	
}








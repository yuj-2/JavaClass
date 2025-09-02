package days01;

public class Ex04 {
	public static void main(String[] args) {
		// [지역변수]는 반드시 초기화를 해야 사용할 수 있다.
//		String name;
//		name = "김유진"; //변수의 초기화
		
		String name = "김유진";
		System.out.println(name);

		name = "홍길동"; //name 기억공간은 하나
//		String name = "홍길동"; //지역변수 중복 선언 오류
		System.out.println(name);
	}
	
}

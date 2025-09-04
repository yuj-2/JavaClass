package days14;

/**
 * @author kenik  
 * @date 2025. 9. 4. 오후 2:30:15 
 * @subject   
 * @content 
 */ 
public class Ex09 {
	
	// 필드
	String name;

	public static void main(String[] args) {
		
		/*
		// 지역 변수
		String name = "abc";
		System.out.println( name.length() );
		
		int [] m = new int[3];
		System.out.println(  m.length );
		*/
		
		Tv t1 = new Tv();
		System.out.println( t1.power ); // false
        t1.power();
        System.out.println( t1.power ); // true
        System.out.println( t1.channel ); // 10번 채널
        t1.channelUp();
        t1.channelUp();
        t1.channelUp();
        System.out.println( t1.channel ); // 13번 채널
        t1.power();
        System.out.println( t1.power ); // true 

	} // main

} // class

// 클래스의 구성요소 = [ 1) 필드   ] + [2) 메소드    ]
// The public type Tv must be defined in its own file
class Tv{
	
	// 멤버
	// 속성 == 멤버변수 == 필드 field
	// [ 필드 선언 형식  ]
	// [접근지정자] [기타제어자] 자료형 필드명;
	public String color = null;  // 명시적 초기화
	boolean power = false;  // 필드
	public int channel = 10;
	
	// [ 지역변수 선언 형식 ] 
	// 자료형 변수명[=초기값];
	
	// 기능(일) == 멤버함수 == 메서드 method
	public void power() {
		power = !power;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	
}








package days14;

/**
 * @author kenik  
 * @date 2025. 9. 4. 오후 3:13:18 
 * @subject   클래스의 복사(copy)와 복제(clone)
 * @content    객체             객체
 */ 
public class Ex10 {

	public static void main(String[] args) {
		
		Tv t1 = new Tv();		
		dispTv(t1);		
		System.out.println( t1.color  );
		
		/* 
		// 클래스(객체) 복사
		Tv t2 = t1;		
		t1.color="red";		
		System.out.println( t2.color);
		*/

	} // main

	private static void dispTv(Tv t) {   // Tv t = t1   클래스 복사
		t.color = "blue";
	}

} // class





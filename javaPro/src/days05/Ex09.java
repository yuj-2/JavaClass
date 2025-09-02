package days05;

/**
 * @author kenik  
 * @date 2025. 8. 22. 오후 4:42:43 
 * @subject 가위(1) 바위(2) 보(3) 게임  
 * @content 1) 컴퓨터 : 랜덤한 수 ( 난수 )
 *          2) 사용자
 */ 
public class Ex09 {

	public static void main(String[] args) {
		// 자바 : 난수(임의의 수 ) 발생시키는 코딩
		// 1) java.util.Random 클래스
		// 2) Math.random() ***
		
		// 0.0 *3 <= double Math.random() *3 < 1.0*3;
		// 0    <= (int)( Math.floor(   Math.random() *3 )) <= 2
		
		
		// 1  <= (int)( Math.floor(Math.random()*3))+1  <= 3 ;
		/*
		System.out.println( Math.floor(  3.0)  );
		System.out.println( Math.floor(  3.2)  );
		System.out.println( Math.floor(  3.5)  );
		System.out.println( Math.floor(  3.9)  );
		*/
		 
		for (int i = 0; i < 10; i++) {
			// int n = (int)( Math.floor(Math.random()*3))+1;
			 int n = (int)( Math.floor(Math.random()*3))+1;
			//if( n < 1 || n > 3 ) System.out.println("XXX");
			 System.out.println( n );
		}
		
		// int randomNum = (int)(Math.random() * 3) + 1;
	 
		
		System.out.println("END");

	} // main

} // class









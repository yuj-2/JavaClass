package days08;

/**
 * @author kenik  
 * @date 2025. 8. 27. 오전 11:40:07 
 * @subject   
 * @content 
 */ 
public class Ex02_03 {

	public static void main(String[] args) {
		String message = "TODO Auto-generated method stub";
		
		// 1. 끝에서 3글자만 읽어와서 출력 : tub
		System.out.println( message.length() );
		//int beginIndex = message.length() - 3 ;
		int beginIndex = message.length() - 1 ;
		System.out.println( message.substring(beginIndex) );
		
		
	} // main

} // class

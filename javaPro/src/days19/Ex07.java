package days19;

import java.io.IOException;

/**
 * @author kenik  
 * @date 2025. 9. 11. 오후 3:21:00 
 * @subject   
 * @content 
 *           1. unchecked 예외
 *               ㄴ 컴파일러가 예외처리를 확인하지 않는 예외
 *               ㄴ RuntimeException 및 자식 예외 클래스 들
 *                                    ( ArithmeticException
 *                                    ArrayIndexOutOfBoundsException
 *                                    :
 *                                    )
 *           2. checked 예외
 *               ㄴ 컴파일러가 예외처리를 확인하는 예외
 *               ㄴ  RuntimeException제외한 모든 예외 클래스들
 *                  IOException
 *    
 */ 
public class Ex07 {

	public static void main(String[] args) throws IOException  {
		
		// Unhandled exception type IOException
		// public  int read() throws IOException{
	    // }
		int b = System.in.read();
		System.out.println( b );
		
		
	}

}

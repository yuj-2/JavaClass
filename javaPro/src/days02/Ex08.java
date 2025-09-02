package days02;

/**
 * @author kenik  
 * @date 2025. 8. 19. 오후 2:25:20 
 * @subject   형변환
 * @content     ㄴ 자동 타입(형) 변환
 *              ㄴ 강제 타입(형) 변환
 *            자료형(==타입)
 *            String -> int,byte,short,boolean 등등  
 *            int,byte,short,boolean -> String
 *            정수타입 -> 실수형 
 *            b,s,i,l    f,d
 *            실수형 -> 정수형 
 *            f,d      b,s,i,l
 *            
 *            정수형 -> 정수형
 *            실수형 -> 실수형
 *            등등
 *            p55~60 설명
 *            
 *            자동 형 변환 2가지 경우
 *            1) 작은타입 + 큰타입 => 큰타입 
 *            2) 큰타입  =  작은타입
 */ 
public class Ex08 {

	public static void main(String[] args) {
		
		//float avg = (float) 98.78;
		//float avg = 98.78F;
		
		byte b = 10;
		long l = 100;
		System.out.println( b + l ); // 작은타입 + 큰타입 => 큰타입
		
		
		/* 큰타입 = 작은타입  자동 형 변환 되는 경우
		byte b = 50; // -128 ~ 127 정수
		long l = b;    // 900경 ~ 900경 정수   byte->long 자동 형 변환
		// [1바이트]
		// [1바이트][1바이트][1바이트][1바이트][1바이트][1바이트][1바이트][1바이트]
		System.out.println( l );
		*/
		
		/*
		long l = 50;
		// Type mismatch: cannot convert from long to byte
		// byte = long 자동형변환X -> long(50) 강제형변환 byte(50)
		byte b = (byte) l;
		System.out.println( b );
		
		// ( 3 + 5 )* 2       최우선 연산자 ()
		// (변환하고자하는 타입) CAST 연산자 - 강제로 형 변환할 때 사용하는 연산자
		//
		*/

	}

}







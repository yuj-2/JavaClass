package days02;

/**
 * @author kenik  
 * @date 2025. 8. 19. 오전 10:29:01 
 * @subject   기본형 중에 정수 자료형 
 * @content   byte(1), short(2), int(4), long(8)
 */ 
public class Ex02 {

	public static void main(String[] args) {
		// 1. 이름을 저장할 변수 선언
		String name = "이창익";
		// 2. 나이를 저장할 변수 선언     min=0   max=125
		// byte   1byte  []    [][][][][][][] 2^7 = 128가지
		//              부호비트  음수 128가지 양수 128
		//                      -128 ~ 127 정수 
		//                        0~255 정수  X 
		// short 2byte   [] [][][]  2^15 =32768 가지
		//                -32768 ~ 32767 정수
		// int   4byte   []  2^31  2147483648가지( 21억 가지 )
		//                  -21억 ~ 21억 정수
		// long 8byte    []  2^63   9223372036854775808 가지
		//                   -900경 ~ 900경 정수
		
		// 자료형 변수명 [= 초기값];
		byte age;
		// Type mismatch: cannot convert from String to byte
		age = 100;
		System.out.println(age);
				
		// -128 <= byte 정수  <= 127
		// Type mismatch: cannot convert from int to byte
		//age = 150;
		
		// Type mismatch: cannot convert from double to byte
		//age = 20.;
		
		// Type mismatch: cannot convert from long to byte
		// age = 20L;
		
		// Type mismatch: cannot convert from double to byte
		// age = 20D;
		System.out.println(age);

	} //main

} //class






package days02;

/**
 * @author kenik  
 * @date 2025. 8. 19. 오후 12:26:42 
 * @subject   실수형 : float(4) double(8)
 * @content 
 */ 
public class Ex05 {

	public static void main(String[] args) {
		// p49
		// 정밀도 확인
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		
		System.out.println(var1);
		System.out.println(var2);
		
		// 구분선 --------------------------------------------------		
		System.out.println(  "-".repeat(50)   );
		 
		/*
		3.14; double
		3.   double
		3D   double  suffix 접미사
		3d   double
		*/
		/*
		3F  float
		3f  float
		*/

		// int    i    [    ][    ][    ][     ]
		// float avg   [s][8비트 지수부][   23비트  0.98789(가수부)]
		//Type mismatch: cannot convert from double to float
		float avg = 98.789F; // 0.98789(가수부) x 10^2(지수부)
		
		// double avg = [s][11비트 지수부][    52비트  0.98789(가수부)]
		double avg2 = 98.789;
		
		// 3.14
		// 3.141592
		System.out.println( avg );
		System.out.println( avg2 );
		
		// 9.1234567 -> 2진수 변환  0101010.............무한

	}

}


/*
char c = 'A'; 
String s = "A"; // 문자열 == 문자의 나열   'A'+'/0'="A"
*/
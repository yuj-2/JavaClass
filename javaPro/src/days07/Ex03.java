package days07;

/**
 * @author kenik  
 * @date 2025. 8. 26. 오전 10:25:41 
 * @subject   
 * @content 
 */ 
public class Ex03 {

	public static void main(String[] args) {
		
		// ASCII  0~255
		// 0~31  제어문자 
		// 32~127 일반문자( 숫자, 알대, 알소 등등 )
		// 128 ~
		/*
		System.out.printf("[%d(%c)]\n", 0, (char)0);
		System.out.printf("[%d(%c)]\n", 0, (char)0);
		System.out.printf("[%d(%c)]\n", 0, (char)0);
		System.out.printf("[%d(%c)]\n", 0, (char)0);
		System.out.printf("[%d(%c)]\n", 0, (char)0);
		:
		System.out.printf("[%d(%c)]\n", 255, (char)255);
		*/
		
		for (int i = 0; i < 256; i++) {
			System.out.printf("[%d('%c')]\n", i, (char)i);
		}
		
		// 13  CR   '\r'  줄바꿈(개행)
		// 10  LF   '\n'  줄바꿈(개행)

	} // main

} // class
















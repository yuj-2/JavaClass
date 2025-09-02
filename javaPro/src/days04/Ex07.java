package days04;

import java.util.Arrays;

/**
 * @author kenik  
 * @date 2025. 8. 21. 오후 2:01:03 
 * @subject   
 * @content 
 */ 
public class Ex07 {

	public static void main(String[] args) {
		// [] index 연산자 -> 배열(Array)
		
		/*
		// 1. 모든 지역변수는 초기화하지 않으면 사용할 수 없다. 
		int kor; // 지역변수(local variable)
		// The local variable kor may not have been initialized
		System.out.println( kor );
		*/
		
		// [스택]영역                    [힙]
		// [0x100번지]                  [0][0][0] int자료형의 기본값인 0으로 초기화                      
		//    iArr                     0x100번지
		int [] iArr = null;
		iArr = new int[10];
		
		// Arrays 클래스
		System.out.println(  Arrays.toString(iArr) ); 
		
		// The local variable iArr may not have been initialized
		// NullPointerException
		//iArr[0] = 100;
//		System.out.println( iArr[0] ); // 0   lowerbound 아랫첨자값
//		System.out.println( iArr[1] );
//		System.out.println( iArr[2] ); // 2   upperbound  윗첨자값
		
		// 윗첨자값 = 배열명.length - 1
		// 배열크기 : 배열명.length
		System.out.println( iArr.length );
		
		// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		//System.out.println( iArr[3] );
		
		
	} //main

}//class






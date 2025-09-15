package days21;

import java.util.Arrays;

/**
 * @author kenik  
 * @date 2025. 9. 15. 오전 10:21:24 
 * @subject   Chapter 12 수학 클래스
 * @content 
 */ 
public class Ex04 {

	public static void main(String[] args) {
		
//		System.out.println(Math.sqrt(4)); // 2.0
		
//		System.out.println( Math.abs(-100) ); // 100
//		System.out.println( Math.abs(100) );  // 100
		
//		System.out.println( Math.pow(2.1, 3.3));		
		
//		System.out.println( Math.PI );  // 3.141592653589793
		
//		System.out.println( Math.max(2, 3) );
//		System.out.println( Math.min(2, 3) );
		
		// 0.0 <= double Math.random(); < 1.0
		// long Math.round(doulbe)  반올림  소숫점 첫 번째 자리에서 반올림
		// int Math.round(float)
		// 반올림
//		System.out.println( Math.round(3.2) ); // long 3
//		System.out.println( Math.round(3.6) ); // long 4
		
		// 바닥 == 절삭 == 버림
//		System.out.println( Math.floor(3.2) ); // double 3.0
//		System.out.println( Math.floor(3.6) ); // double 3.0
		
		// 천장 == 절상 == 올림
//		System.out.println( Math.ceil(3.2) ); // double 4.0
//		System.out.println( Math.ceil(3.6) ); // double 4.0
		
		// 게시판
		int totalCount = 241;   // 총 게시글 수
		int postsPerPage = 10;     // 한 페이지에 출력할 게시글 수
		int totalPageCount = 0; // 총 페이지 수 
		
		totalPageCount = (int) Math.ceil((double)totalCount / postsPerPage);
		System.out.println( totalPageCount );
		
		
		/*
		// [문제] 소수점 3째 자리에서 반올림을 해서 소수점 2자리 까지 출력.
		double d = 3.141592;
		// 3.14 출력
		// [3]
		//System.out.println( d*100 );
		//System.out.println( Math.round(d*100) );
		d = Math.round(d*100)/100D ;
		System.out.println( d );
		*/
		
		/* [1]
		// System.out.printf( "%.2f", d );
		String strD = String.format("%.2f", d);  // "3.14"
		d = Double.parseDouble(strD);
		System.out.println( d );
		 */
		
		

		
	} // main

} // class


/*
// 1. 소수 -> String으로 변환
// 모든 자료형 + "" => String 변환
String strD = 3.141592 + "";
System.out.println( strD );		
// String.valueOf(3.141592) 

// 2. String -> char[]로 변환

int len = strD.length();
char [] dArr = new char[len];
for (int i = 0; i < len; i++) {
	dArr[i] = strD.charAt(i);
} 
char [] dArr = strD.toCharArray();

//만약 소수점 3째자리가 5보다 크다면 =>arr[5]-'0'
int index =  Arrays.binarySearch(dArr, '.');
System.out.println( index );
index += 3;
System.out.println( dArr[index] >= 5 ? dArr[index-1]++ );
//소수점 2째자리의 수를 1 더한다
//그 이후 char 배열로 소수점 2째 자리까지 출력
*/


//미구현
//	      if((int)(arr[5]-'0')>=5) {
//	         arr[4]=arr[5]
//	      }

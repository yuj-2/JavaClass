package days21;

/**
 * @author kenik  
 * @date 2025. 9. 15. 오전 7:43:25 
 * @subject   
 * @content 
 */ 
public class Ex01 {

	public static void main(String[] args) {
		/*
		[ 문제 설명 ] 9:15 제출
		길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수
		, solution을 완성하세요. 
		예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

		제한 조건
		n은 길이 10,000이하인 자연수입니다.
		입출력 예
		n	return
		3	"수박수"
		4	"수박수박"
		5   "수박수박수"
		6   "수박수박수박"
		 */

		System.out.println( solution(3) ); // 수박수
		System.out.println( solution(4) ); // 수박수박
		
		System.out.println( solution(-4) ); // 수박수박

	} // main

	public static String solution(int n) {
		StringBuilder sb = new StringBuilder(); 
		// if( n < 1 || n > 10000) return null;
		if(  !( 1<=n &&  n<= 10000) ) return null;		
		for (int i = 1, share = n/2; i <= share; i++) {
			sb.append("수박");
		}		
		if( n%2==1) sb.append("수");
		
		return sb.toString();
	}
	
	/*
	public static String solution(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			sb.append(i%2==1?"수":"박");
		}		
		return sb.toString();
	}
	*/

	/*
	public static String solution(int n) {
		String result = "";
		for (int i = 1; i <= n; i++) {
			if (i%2==1) {
				result += "수";
			} else {
				result += "박";
			}
		}
		return result;
	}
	 */

} // class






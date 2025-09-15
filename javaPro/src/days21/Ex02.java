package days21;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author kenik  
 * @date 2025. 9. 15. 오전 9:44:53 
 * @subject   String
 * @content   StringBuffer , StringBuilder
 *            StringTokenizer 클래스
 */ 
public class Ex02 {

	public static void main(String[] args) {
		// Token (토큰) ? 조각
		String team = "이나영,김수진,장소예";
		StringTokenizer st = new StringTokenizer(team, ",");
				
		System.out.println( st.countTokens() ); // 3
		
		// boolean st.hasMoreTokens()  토근 유무를 true/false
		// st.nextToken()
		
		while ( st.hasMoreTokens()  ) {
			String name = st.nextToken();
			System.out.println( name );
		}
		
		
		
		/* [1] split () 권장
		// String.split(regex)
		String [] teamArr = team.split(",");
		System.out.println( Arrays.toString(teamArr) );
		*/
		
		

	} // main
	
} // class







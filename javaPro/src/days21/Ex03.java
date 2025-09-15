package days21;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author kenik  
 * @date 2025. 9. 15. 오전 10:10:33 
 * @subject   StringJoiner 클래스 == String.join() 권장
 * @content 
 */ 
public class Ex03 {

	public static void main(String[] args) {
		String team = "이나영,김수진,장소예";
		String [] teamArr = team.split(",");
		System.out.println( Arrays.toString(teamArr) );
		// [2]
		StringJoiner sj = new StringJoiner(
				"</li>\n<li>", "<ol>\n<li>", "</li>\n</ol>") ;
		for (int i = 0; i < teamArr.length; i++) {
			sj.add( teamArr[i] );
		}
		System.out.println( sj.toString() );
		
		/* [1]
		//  String.join() 기억
		String content  = "<ol>\n<li>";  // 접두사
		content += String.join("</li>\n<li>", teamArr);
		content += "</li>\n</ol>";       // 접미사
		System.out.println( content );
		*/
		
		
		

	}

}

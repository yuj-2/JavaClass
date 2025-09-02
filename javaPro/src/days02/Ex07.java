package days02;

/**
 * @author kenik  
 * @date 2025. 8. 19. 오후 2:10:54 
 * @subject p52 이스케이프 문자   
 * @content   \"    \'   \\    \t   \n  \r     
 * 
 */ 
public class Ex07 {

	public static void main(String[] args) {
		String result = "이나영\r\"김수진\"\n장\t소\t예";
		System.out.println( result );
		
		// \n 라인피드    LF   10 개행문자
		// \r 캐리지리턴  CR   13 
		// 엔터 -> CRLF    \r\n
		
		
	}

}

/*
이나영
"김수진"
장	소	예
*/
